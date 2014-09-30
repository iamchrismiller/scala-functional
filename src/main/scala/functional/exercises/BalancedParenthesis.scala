package functional.exercises


object BalancedParenthesis {

  /**
   * Is The List Of Parenthesis Balanced?
   * @param chars - Immutable Linked List
   * @return
   */
  def isBalanced(chars: List[Char]): Boolean = {
    /**
     * Recurs through the list of characters and track open
     * @param chars - Immutable List of characters
     * @param open - Count of open parenthesis
     * @return
     */
    def recurs(chars: List[Char], open: Int): Boolean = {
      //too many closing ) before open (
      if (open < 0) false
      else {
        //switch/pattern match head :: tail
        chars match {
          //increment count on open paren
          case '(' :: tail => recurs(tail, open + 1)
          //decrement count on close paren
          case ')' :: tail => recurs(tail, open - 1)
          //empty list same as list()
          case Nil => if (open == 0) true else false
          //catch all other characters and pass through
          case _ :: tail => recurs(tail, open)
        }
      }
    }
    //do work
    recurs(chars, 0)
  }
}
