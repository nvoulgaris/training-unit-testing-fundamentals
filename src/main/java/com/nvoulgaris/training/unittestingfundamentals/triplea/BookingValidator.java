package com.nvoulgaris.training.unittestingfundamentals.triplea;

public class BookingValidator {

  public void validate(Booking booking) {
    if (booking.getBookingId() == null)
      throw new InvalidBookingException();
  }
}
