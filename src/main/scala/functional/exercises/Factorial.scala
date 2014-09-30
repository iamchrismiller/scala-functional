package functional.exercises

object Factorial {

  /**
   * Simple Recursive Factorial
   * @param num - Int Of Number to calculate
   * @return
   */
  def calculateSimple(num : Int) : Long = {
    //bail on non-positive numbers
    if (num <= 0) 1
    //recurs
    else num * calculateSimple(num - 1)
  }

  /**
   * Tail-call Recursive factorial
   * @param num - Int Of Number to calculate
   * @return
   */
  def calculateTail(num : Int) : Long = {
    //inner recursive "loop"
    def recurs(acc : Long, num : Int): Long =
      //Return the Accumulator
      if (num <= 0) acc
      //Perform Tail Recursion
      else recurs(acc * num, num - 1)
    //Perform Recursion
    recurs(1, num)
  }
}
