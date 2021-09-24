package SRP;

import SRP.ValueObject.*;

public class SummerDiscountedPrice {
  private static final int MIN_AMOUNT = 0;
  private static final int DISCOUNT_AMOUNT = 300;
  public final int amount;

  public SummerDiscountedPrice(RegularPrice price) {
    int discountedAmount = price.amount - DISCOUNT_AMOUNT;
    if (discountedAmount < MIN_AMOUNT) {
      discountedAmount = MIN_AMOUNT;
    }

    this.amount = discountedAmount;
  }
}
