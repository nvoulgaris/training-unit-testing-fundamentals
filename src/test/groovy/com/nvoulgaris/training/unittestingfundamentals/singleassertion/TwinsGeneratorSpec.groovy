package com.nvoulgaris.training.unittestingfundamentals.singleassertion

import spock.lang.Specification

class TwinsGeneratorSpec extends Specification {

  TwinsGenerator twinsGenerator

  def setup() {
    twinsGenerator = new TwinsGenerator()
  }

  def "should generate a non-negative, even integer"() {
    when:
      Integer twinsCount = twinsGenerator.generate()
    then:
      twinsCount >= 0
      twinsCount % 2 == 0
  }
}
