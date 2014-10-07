package functional.exercises

object Helpers {

  /**
   * Map Reduce Method For Product/Sum Simplification
   * @param f - Function To Apply
   * @param combine - Combine Function
   * @param zero - Zero value (Sum '0' vs Product '1')
   * @param a - Lower Bound
   * @param b - Upper Bound
   * @return
   */
  def mapReduce(f : Int => Int, combine : (Int, Int) => Int , zero : Int)(a: Int, b : Int) : Int = {
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }

}
