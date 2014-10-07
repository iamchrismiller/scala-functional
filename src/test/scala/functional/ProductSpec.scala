package functional

import org.scalatest._

class ProductSpec extends FlatSpec with Matchers {

  import functional.exercises.Product

  "Product function should apply squared function to lower and upper bounds" should "equal 144" in {
    Product.calculate(x => x * x)(3, 4) should be (144)
  }

  "Product function should apply squared function to lower and upper bounds which are out of bounds" should "equal 1" in {
    Product.calculate(x => x * x)(3, 2) should be (1)
  }

  "Product function should apply cubed function to lower and upper bounds" should "equal 1728" in {
    Product.calculate(x => x * x * x)(3, 4) should be (1728)
  }

  "Product factorial function should use calculate to determine factorial of 5" should "equal 120" in {
    Product.factorial(5) should be (120)
  }

  "Product calculate should use mapReduce to determine square between 3 and 4" should "equal 144" in {
    Product.calcUsingMapReduce(x=>x * x)(3,4) should be (144)
  }
}
