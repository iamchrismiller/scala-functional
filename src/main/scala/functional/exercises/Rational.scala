package functional.exercises


/**
 * Rational Expressions
 * @param x - Numerator x
 * @param y - Denominator y
 */
class Rational(x : Int, y : Int) {

  //Throw Error on 0 Denominator
  require(y != 0, "Rational denominator (y) must be non-zero")

  //Define Constructor For Whole Number
  def this(x : Int) = this(x, 1)

  /*
   * Find the Greatest Common Denominator
   * @param a - Rational A
   * @param b - Rational B
   * @return
   */
  private def gcd(a : Int, b : Int) : Int = {
    if(b == 0) a else gcd(b, a % b)
  }

  //Local Immutable Values
  val numerator = x
  val denominator = y

  /**
   * Negate Rational
   * @return
   */
  def negate : Rational = {
    new Rational(-this.numerator, this.denominator)
  }

  /**
   * Add Two Rationals
   * @param a - Rational
   * @return
   */
  def + (a : Rational) : Rational = {
    new Rational(
      this.numerator * a.denominator + a.numerator * this.denominator,
      this.denominator * a.denominator
    )
  }

  /**
   * Subtract Rationals
   * @param a - Rational
   * @return
   */
  def - (a : Rational) : Rational = {
    this + a.negate
  }

  /**
   * Is The Rational a less than the local Rational
   * @param a - Rational
   * @return
   */
  def < (a : Rational) : Boolean = {
    this.numerator * a.denominator < a.numerator * this.denominator
  }

  /**
   * Return the Larger Rational Number
   * @param a - Rational
   * @return
   */
  def max(a : Rational) : Rational = {
    if (this < a) a else this
  }

  /**
   * Return the Reciprocal of the Rational
   * @return
   */
  def reciprocal : Rational = {
    new Rational(this.denominator, this.numerator)
  }

  /**
   * Pretty Print Rational
   * @return
   */
  override def toString : String = {
    val g = this.gcd(this.numerator, this.denominator)
    //Simplify Expression When Printing
    this.numerator/g + "/" + this.denominator/g
  }

}