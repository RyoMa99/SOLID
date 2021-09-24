package ISP;

import ISP.Interface.IShape;

public class Rectangle implements IShape {
  @Override
  public String draw() {
    return "rect";
  }
}
