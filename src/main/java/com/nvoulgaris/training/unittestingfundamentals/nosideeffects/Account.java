package com.nvoulgaris.training.unittestingfundamentals.nosideeffects;

import java.math.BigInteger;

public class Account {

  private BigInteger balance;

  public void deposit(BigInteger amount) {
    this.balance =  this.balance.add(amount);
  }
}
