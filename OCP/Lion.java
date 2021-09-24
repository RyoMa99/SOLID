package OCP;

import OCP.Interface.Animal;

public class Lion implements Animal {

  @Override
  public String makeSound() {
    return "roar";
  }
}
