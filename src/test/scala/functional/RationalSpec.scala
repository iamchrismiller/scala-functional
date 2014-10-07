package functional

import org.scalatest._

class RationalSpec extends FlatSpec with Matchers {

  import functional.exercises.Rational

  "Rational With Numerator 1 and Denominator 0" should "throw  IllegalArgumentException" in {
    intercept[IllegalArgumentException] {
      new Rational(1, 0).toString
    }
  }

  "Rational With Numerator 1 and Denominator 1" should "equal 1" in {
    new Rational(1, 1).toString should be("1/1")
  }

  "Rational With Numerator 2 and Denominator 4" should "equal 1/2" in {
    new Rational(2, 4).toString should be("1/2")
  }

  "Rational With Numerator 4 and Denominator 2" should "equal 2/1" in {
    new Rational(4, 2).toString should be("2/1")
  }

  "Rational(2,2) + Rational(3,1)" should "equal 4/1" in {
    (new Rational(2,2) + new Rational(3,1)).toString should be("4/1")
  }

  "Rational(2,2) - Rational(3,1)" should "equal -2/1" in {
    (new Rational(2,2) - new Rational(3,1)).toString should be("-2/1")
  }

  "new Rational(4, 2).negate.toString" should "equal -2/1" in {
    new Rational(4, 2).negate.toString should be("-2/1")
  }

  "Rationals 1/3 - 5/7 - 3/2" should "equal -79/42" in {
    val x = new Rational(1,3)
    val y = new Rational(5,7)
    val z = new Rational(3,2)

    (x - y - z).toString should be("-79/42")
  }

  "new Rational(4, 2) < new Rational(2,4)" should "equal false" in {
    (new Rational(4, 2) < new Rational(2,4)) should be(false)
  }

  "new Rational(2, 2) < new Rational(8,4)" should "equal true" in {
    (new Rational(2, 2) < new Rational(8,4)) should be(true)
  }

  "new Rational(2, 2) max new Rational(8,4)" should "equal 2/1" in {
    (new Rational(2, 2) max new Rational(8,4)).toString should be("2/1")
  }

  "new Rational(1, 2).reciprocal" should "equal 2/1" in {
    new Rational(1, 2).reciprocal.toString should be("2/1")
  }

}
