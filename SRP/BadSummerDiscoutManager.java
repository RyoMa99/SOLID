package SRP;

public class BadSummerDiscoutManager {
  BadDiscountManager discountManager;
  
  /**
   * 商品を追加する
   * @param product 商品
   * @return 追加に成功した場合true
   */
  boolean add(Product product) {
    // 商品の割引価格を加算し、
    // 上限30,000円を超えていなければ商品を追加する。
    int tmp = this.discountManager.totalPrice +
              BadDiscountManager.getDiscountPrice(product.price);
      if (tmp < 30000) {
        this.discountManager.totalPrice = tmp;
        this.discountManager.discountProducts.add(product);
        return true;
      }
      else {
        return false;
      }
    }
  }
}
