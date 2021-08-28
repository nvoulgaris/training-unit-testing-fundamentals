package com.nvoulgaris.training.unittestingfundamentals.naming;

import java.math.BigInteger;

public class WithdrawalTransaction implements Transaction {

  private BigInteger amount;

  public WithdrawalTransaction(BigInteger amount) {
    this.amount = amount;
  }
}
