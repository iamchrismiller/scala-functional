package functional

import org.scalatest._

class ChangeSpec extends FlatSpec with Matchers {

  import functional.exercises.Change

  "Change.possible(4, List(1,2))" should "equal 3" in {
    Change.possible(4, List(1, 2)) should equal(3)
  }

  "Change.possible(15, List(1,5,10,25))" should "equal 3" in {
    Change.possible(15, List(1, 5, 10, 25)) should equal(6)
  }

  "Change.possible(300,List(5,10,20,50,100,200,500)) sorted CHF" should "equal 1022" in {
    Change.possible(300, List(5, 10, 20, 50, 100, 200, 500)) should equal(1022)
  }
  "Change.possible(301,List(5,10,20,50,100,200,500)) no pennies" should "equal 0" in {
    Change.possible(301, List(5, 10, 20, 50, 100, 200, 500)) should equal(0)
  }

  "Change.possible(300,List(500,5,50,100,20,200,10)) unsorted CHF" should "equal 1022" in {
    Change.possible(300, List(500, 5, 50, 100, 20, 200, 10)) should equal(1022)
  }

}