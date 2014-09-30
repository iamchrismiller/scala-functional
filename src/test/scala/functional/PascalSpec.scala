package functional

import org.scalatest._

class PascalSpec extends FlatSpec with Matchers {

  import functional.exercises.Pascal

  "Pascal Simple Recursion of vertices (0,1)" should "equal 1" in {
    Pascal.calculateSimple(0,1) should be (1)
  }

  "Pascal Simple Recursion of vertices (0,2)" should "equal 1" in {
    Pascal.calculateSimple(0,2) should be (1)
  }

  "Pascal Simple Recursion of vertices (1,1)" should "equal 1" in {
    Pascal.calculateSimple(1,1) should be (1)
  }

  "Pascal Simple Recursion of vertices (2,2)" should "equal 1" in {
    Pascal.calculateSimple(2,2) should be (1)
  }

  "Pascal Simple Recursion of vertices (1,2)" should "equal 2" in {
    Pascal.calculateSimple(1,2) should be (2)
  }

  "Pascal Simple Recursion of vertices (1,3)" should "equal 3" in {
    Pascal.calculateSimple(1,3) should be (3)
  }

  "Pascal Simple Recursion of vertices (2,4)" should "equal 6" in {
    Pascal.calculateSimple(2,4) should be (6)
  }

  //Tail Recursion

  "Pascal Tail Recursion of vertices (0,1)" should "equal 1" in {
    Pascal.calculateTail(0,1) should be (1)
  }

  "Pascal Tail Recursion of vertices (0,2)" should "equal 1" in {
    Pascal.calculateTail(0,2) should be (1)
  }

  "Pascal Tail Recursion of vertices (1,1)" should "equal 1" in {
    Pascal.calculateTail(1,1) should be (1)
  }

  "Pascal Tail Recursion of vertices (2,2)" should "equal 1" in {
    Pascal.calculateTail(2,2) should be (1)
  }

  "Pascal Tail Recursion of vertices (1,2)" should "equal 2" in {
    Pascal.calculateTail(1,2) should be (2)
  }

  "Pascal Tail Recursion of vertices (1,3)" should "equal 3" in {
    Pascal.calculateTail(1,3) should be (3)
  }

  "Pascal Tail Recursion of vertices (2,4)" should "equal 6" in {
    Pascal.calculateTail(2,4) should be (6)
  }

}
