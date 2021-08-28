package com.nvoulgaris.training.unittestingfundamentals.naming

import spock.lang.Specification

class AccountShould extends Specification {

  def "persist a deposit transaction when making a deposit"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "throw an InvalidAmountException when making a deposit with a non-positive amount"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "persist a withdrawal transaction when making a withdrawal"() {
    // Actual test case is omitted for brevity
    expect: true
  }

  def "throw an InvalidAmountException when making a withdrawal with a non-positive amount"() {
    // Actual test case is omitted for brevity
    expect: true
  }
}