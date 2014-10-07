package functional

import org.scalatest._

class SumSpec extends FlatSpec with Matchers {

  import functional.exercises.Sum
  import functional.exercises.Factorial

  "Sum function should apply simple sum function to lower and upper bounds" should "equal 12" in {
    Sum.calculate(x => x, 3, 5) should be (12)
  }

  "Sum of should apply squared function to lower and upper bounds" should "equal 50" in {
    Sum.calculate(x => x * x, 3, 5) should be (50)
  }

  "Sum function should apply cubed function to lower and upper bounds" should "equal 216" in {
    Sum.calculate(x => x * x * x, 3, 5) should be (216)
  }

  "Sum function should apply curried function to lower and upper bounds" should "equal 50" in {
    Sum.calcF(x => x * x)(3,5) should be (50)
  }

  "Sum function should use mapReduce to apply curried function to lower and upper bounds" should "equal 50" in {
    Sum.calcUsingMapReduce(x => x * x)(3,5) should be (50)
  }

}
