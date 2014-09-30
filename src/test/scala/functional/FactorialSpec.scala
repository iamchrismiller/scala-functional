package functional

import org.scalatest._

class FactorialSpec extends FlatSpec with Matchers {

  import functional.exercises.Factorial

  "Factorial.calculateSimple(1)" should "equal 1" in {
    Factorial.calculateSimple(1) should be(1)
  }

  "Factorial.calculateSimple(2)" should "equal 2" in {
    Factorial.calculateSimple(2) should be(2)
  }

  "Factorial.calculateSimple(3)" should "equal 6" in {
    Factorial.calculateSimple(3) should be(6)
  }

  "Factorial.calculateSimple(4)" should "equal 24" in {
    Factorial.calculateSimple(4) should be(24)
  }

  "Factorial.calculateSimple(5)" should "equal 120" in {
    Factorial.calculateSimple(5) should be(120)
  }

  "Factorial.calculateSimple(10)" should "equal 3628800" in {
    Factorial.calculateSimple(10) should be(3628800)
  }

  "Factorial.calculateSimple(15)" should "equal 1307674368000" in {
    Factorial.calculateSimple(15) should be(1307674368000L)
  }

  "Factorial.calculateSimple(20)" should "equal 2432902008176640000" in {
    Factorial.calculateSimple(20) should be(2432902008176640000L)
  }

  //Tail Recursion

  "Factorial.calculateTail(1)" should "equal 1" in {
    Factorial.calculateTail(1) should be(1)
  }

  "Factorial.calculateTail(2)" should "equal 2" in {
    Factorial.calculateTail(2) should be(2)
  }

  "Factorial.calculateTail(3)" should "equal 6" in {
    Factorial.calculateTail(3) should be(6)
  }

  "Factorial.calculateTail(4)" should "equal 24" in {
    Factorial.calculateTail(4) should be(24)
  }

  "Factorial.calculateTail(5)" should "equal 120" in {
    Factorial.calculateTail(5) should be(120)
  }

  "Factorial.calculateTail(10)" should "equal 3628800" in {
    Factorial.calculateTail(10) should be(3628800)
  }

  "Factorial.calculateTail(15)" should "equal 1307674368000" in {
    Factorial.calculateTail(15) should be(1307674368000L)
  }

  "Factorial.calculateTail(20)" should "equal 2432902008176640000" in {
    Factorial.calculateTail(20) should be(2432902008176640000L)
  }

}
