package ISP;

import ISP.Interface.ICircle;

public class OCircle implements ICircle {
  @Override
  public String drawCircle() {
    return "other circle";
  }
}
