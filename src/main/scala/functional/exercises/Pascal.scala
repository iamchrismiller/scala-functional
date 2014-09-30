package functional.exercises

object Pascal {

  /**
   * Simple Recursive Pascal Triangle
   * @param col - Column Index
   * @param row - Row Index
   * @return
   */
  def calculate_simple(col: Int, row: Int): Int = {
    //edge
    if (col == 0 || col == row) 1
    //recurs and use simple arithmetic
    else calculate_simple(col-1, row-1) + calculate_simple(col, row-1)
  }

  /**
   * Tail-call Recursive Pascal Triangle
   * @param col - Triangle Column
   * @param row - Triangle Row
   * @return
   */
  def calculate_tail(col: Int, row: Int): Int = {
    /**
     * Calculate Pascal Value Using Recursive Accumulator
     * @param acc - Accumulator Register
     * @param col - Column Index
     * @param row - Row Index
     * @return
     */
    def recurs(acc: Int, col: Int, row: Int) : Int = {
      //edge
      if (col == 0 || col == row) acc + 1
      //Tail Recursion storing resultant in accumulator
      else recurs(recurs(acc, col - 1, row - 1), col, row - 1)
    }
    //Perform Recursion
    recurs(0, col, row)
  }
}