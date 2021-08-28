package com.nvoulgaris.training.unittestingfundamentals.behaviorvsstate;

public class Gateway {

  private int retries = 0;

  public void get(Request request) {
    boolean result = request.execute();

    while (!result && retries < 1) {
      result = request.execute();
      retries++;
    }
  }
}
