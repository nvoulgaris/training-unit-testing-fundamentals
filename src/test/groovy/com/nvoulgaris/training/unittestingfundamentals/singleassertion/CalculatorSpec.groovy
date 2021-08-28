package com.nvoulgaris.training.unittestingfundamentals.singleassertion

import spock.lang.Specification

class CalculatorSpec extends Specification {

  Calculator calculator

  def setup() {
    calculator = new Calculator()
  }

  def "should divide two integers"() {
    when:
      int result = calculator.divide(6, 2)
    then:
      result == 3
    and:
      calculator.divide(2, 0)
    then:
      thrown(ArithmeticException)
  }
}
