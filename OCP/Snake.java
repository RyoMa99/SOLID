package OCP;

import OCP.Interface.Animal;

public class Snake implements Animal {
  @Override
  public String makeSound() {
    return "hiss";
  }
}
