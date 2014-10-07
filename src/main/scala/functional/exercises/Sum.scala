package functional.exercises

object Sum {

  import scala.annotation.tailrec
  import functional.exercises.Helpers.mapReduce

  /**
   * Sum of a and b applied to function f
   * @param f - Sum Function to apply
   * @param a - Lower Bound
   * @param b - Upper Bound
   * @return
   */
  def calculate(f: Int => Int, a: Int, b: Int): Int = {
    /**
     * Apply Specific Sum Function to Integers a and b
     * @param a - Value a
     * @param acc - Accumulator
     * @return
     */
    @tailrec
    def recurs(a: Int, acc: Int): Int = {
     if (a > b) acc
     else recurs(a + 1, f(a) + acc)
    }
    //do work
    recurs(a, 0)
  }

  /**
   * Calculate Sum using Function Currying
   * @param f - Sum Function to Apply
   * @param a - Lower Bound
   * @param b - Upper Bound
   * @return
   */
  def calcF(f : Int => Int)(a : Int, b : Int) : Int = {
    if (a > b) 0
    else f(a) + calcF(f)(a+1, b)
  }

  /**
   * Sum Calculation using MapReduce Helper
   * @param f - Function to apply
   * @param a - Lower Bound
   * @param b - Upper Bound
   * @return
   */
  def calcUsingMapReduce(f : Int => Int)(a : Int, b : Int) : Int = mapReduce(f, (x,y) => x + y, 0)(a,b)
}
