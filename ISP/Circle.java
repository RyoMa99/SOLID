package ISP;

import ISP.Interface.IShape;

public class Circle implements IShape {
  @Override
  public String draw() {
    return "circle";
  }
}
