package SRP;

import java.util.List;

public class BadDiscountManager {
  int totalPrice;
  List<Product> discountProducts;

  /**
   * 割引価格を取得する
   * 
   * @param price 商品価格
   * @return 割引価格
   */
  static int getDiscountPrice(int price) {
    int discountPrice = price - 300;
    if (discountPrice < 0) {
      discountPrice = 0;
    }
    return discountPrice;
  }

  // 4割引の割引価格を実装する。
  // すると、overrideしていたSummerDiscountの方が仕様と違うようになってしまう。
  /**
   * 割引価格を取得する
   * 
   * @param price 商品価格
   * @return 割引価格
   */
  // static int getDiscountPrice(int price) {
    // return (int) (price * (1.00 - 0.04));
  // }
}
