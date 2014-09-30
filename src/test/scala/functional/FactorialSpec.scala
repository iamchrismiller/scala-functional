package functional

import org.scalatest._

class FactorialSpec extends FlatSpec with Matchers {

  import functional.exercises.Factorial

  "Factorial.calculate_simple(1)" should "equal 1" in {
    Factorial.calculate_simple(1) should be(1)
  }

  "Factorial.calculate_simple(2)" should "equal 2" in {
    Factorial.calculate_simple(2) should be(2)
  }

  "Factorial.calculate_simple(3)" should "equal 6" in {
    Factorial.calculate_simple(3) should be(6)
  }

  "Factorial.calculate_simple(4)" should "equal 24" in {
    Factorial.calculate_simple(4) should be(24)
  }

  "Factorial.calculate_simple(5)" should "equal 120" in {
    Factorial.calculate_simple(5) should be(120)
  }

  "Factorial.calculate_simple(10)" should "equal 3628800" in {
    Factorial.calculate_simple(10) should be(3628800)
  }

  "Factorial.calculate_simple(15)" should "equal 1307674368000" in {
    Factorial.calculate_simple(15) should be(1307674368000L)
  }

  "Factorial.calculate_simple(20)" should "equal 2432902008176640000" in {
    Factorial.calculate_simple(20) should be(2432902008176640000L)
  }

  //Tail Recursion

  "Factorial.calculate_tail(1)" should "equal 1" in {
    Factorial.calculate_tail(1) should be(1)
  }

  "Factorial.calculate_tail(2)" should "equal 2" in {
    Factorial.calculate_tail(2) should be(2)
  }

  "Factorial.calculate_tail(3)" should "equal 6" in {
    Factorial.calculate_tail(3) should be(6)
  }

  "Factorial.calculate_tail(4)" should "equal 24" in {
    Factorial.calculate_tail(4) should be(24)
  }

  "Factorial.calculate_tail(5)" should "equal 120" in {
    Factorial.calculate_tail(5) should be(120)
  }

  "Factorial.calculate_tail(10)" should "equal 3628800" in {
    Factorial.calculate_tail(10) should be(3628800)
  }

  "Factorial.calculate_tail(15)" should "equal 1307674368000" in {
    Factorial.calculate_tail(15) should be(1307674368000L)
  }

  "Factorial.calculate_tail(20)" should "equal 2432902008176640000" in {
    Factorial.calculate_tail(20) should be(2432902008176640000L)
  }

}
