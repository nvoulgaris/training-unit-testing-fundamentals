package com.nvoulgaris.training.unittestingfundamentals.naming;

import java.math.BigInteger;
import java.util.List;

public class Account {

  private List<Transaction> transactions;

  public void deposit(BigInteger amount) {
    if (isNonPositive(amount))
      throw new InvalidAmountException();

    this.transactions.add(new DepositTransaction(amount));
  }

  public void withdraw(BigInteger amount) {
    if (isNonPositive(amount))
      throw new InvalidAmountException();

    this.transactions.add(new WithdrawalTransaction(amount));
  }

  private boolean isNonPositive(BigInteger amount) {
    return amount.signum() != 1;
  }
}
