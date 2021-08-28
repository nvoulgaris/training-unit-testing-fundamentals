package com.nvoulgaris.training.unittestingfundamentals.mocking;

public class BookingService {

  private Gateway gateway;

  public BookingService(Gateway gateway) {
    this.gateway = gateway;
  }

  public void create(int amount) {
    if (amount < 0)
      return;

    gateway.send();
  }
}
