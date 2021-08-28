package com.nvoulgaris.training.unittestingfundamentals.singleassertion;

import java.util.Random;

public class TwinsGenerator {

  Random random = new Random();

  public int generate() {
    return random.nextInt();
  }
}
