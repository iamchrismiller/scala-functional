package functional

import org.scalatest._

class BalancedParenthesisSpec extends FlatSpec with Matchers {

  import functional.exercises.BalancedParenthesis

  "BalancedParenthesis.isBalanced('(if (zero? x) max (/ 1 x))'.toList)" should "be true" in {
    BalancedParenthesis.isBalanced("(if (zero? x) max (/ 1 x))".toList) should be(true)
  }

  "BalancedParenthesis.isBalanced('I told him ...' is balanced'.toList)" should "be true" in {
    BalancedParenthesis.isBalanced("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList) should be(true)
  }

  "BalancedParenthesis.isBalanced('balance: ':-)' is unbalanced'.toList)" should "be false" in {
    BalancedParenthesis.isBalanced("balance: ':-)' is unbalanced".toList) should be(false)
  }

  "BalancedParenthesis.isBalanced('())('.toList)" should "be false" in {
    BalancedParenthesis.isBalanced("())(".toList) should be(false)
  }

  "BalancedParenthesis.isBalanced('(()))('.toList)" should "be false" in {
    BalancedParenthesis.isBalanced("(()))(".toList) should be(false)
  }

  "BalancedParenthesis.isBalanced('there are no parens'.toList)" should "be true" in {
    BalancedParenthesis.isBalanced("there are no parens".toList) should be(true)
  }

}