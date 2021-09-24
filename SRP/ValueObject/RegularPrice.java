package SRP.ValueObject;

public class RegularPrice {
  private static final int MIN_AMOUNT = 0;
  public final int amount;

  public RegularPrice(int amount){
    if (amount < MIN_AMOUNT){
      throw new IllegalArgumentException();
    }

    this.amount = amount;
  }

  RegularPrice add(RegularPrice price){
    return new RegularPrice(this.amount + price.amount);
  }
}
