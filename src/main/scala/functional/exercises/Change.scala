package functional.exercises

object Change {

  /**
   * Count the number of possible combinations of change
   * for a given List of Coins
   * @param money - Integer Money Amount
   * @param coins - Immutable list of coins
   * @return
   */
  def possible(money: Int, coins: List[Int]): Int = {

    /**
     * Recurs Over Money and Accumulate Combinations
     * @param acc - Accumulator Register
     * @param money - Integer Money Amount
     * @param coins - Immutable list of coins
     * @return
     */
    def recurs(acc: Int, money: Int, coins: List[Int]): Int = {
      //no coins in list or money is negative
      if (coins.isEmpty || money < 0) acc
      //money is fulfilled
      else if (money == 0) acc + 1
      //add combinations using tail-recursion
      else recurs(recurs(acc, money - coins.head, coins), money, coins.tail)
    }
    //do work
    recurs(0, money, coins)
  }

}
