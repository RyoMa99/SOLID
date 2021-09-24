package SRP;

import SRP.ValueObject.RegularPrice;

public class RegularDiscountedPrice {
  private static final double DISCOUNT_RATE = 0.04;
  public final int amount;

  public RegularDiscountedPrice(RegularPrice price){
    this.amount = (int)(price.amount * (1.00 - DISCOUNT_RATE));
  }
}
