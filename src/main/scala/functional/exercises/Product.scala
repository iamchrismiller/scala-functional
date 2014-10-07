package functional.exercises

object Product {

  import functional.exercises.Helpers.mapReduce

  /**
   * Calculate the Product of the function from lower to upper bounds
   * @param f - Function to apply each number within the bounds
   * @param a - Lower Bound
   * @param b - Upper Bound
   * @return
   */
  def calculate(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * calculate(f)(a + 1, b)
  }

  /**
   * Product Calculation using MapReduce Helper
   * @param f - Function to apply
   * @param a - Lower Bound
   * @param b - Upper Bound
   * @return
   */
  def calcUsingMapReduce(f : Int => Int)(a : Int, b : Int) : Int = mapReduce(f, (x,y) => x * y, 1)(a,b)

  /**
   * Create factorial method from product
   * @param n - Factorial Num
   * @return
   */
  def factorial(n : Int) =  calculate(x => x)(1,n)

}
