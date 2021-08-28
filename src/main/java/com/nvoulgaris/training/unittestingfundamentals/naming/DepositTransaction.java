package com.nvoulgaris.training.unittestingfundamentals.naming;

import java.math.BigInteger;

public class DepositTransaction implements Transaction {

  private BigInteger amount;

  public DepositTransaction(BigInteger amount) {
    this.amount = amount;
  }
}
