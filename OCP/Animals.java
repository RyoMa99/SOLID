package OCP;

import OCP.Interface.Animal;

public class Animals {
  public static void animalsSounds(Animal a[]){
    for(int i = 0; i < a.length; i++){
      System.out.println(a[i].makeSound());
    }
  }
}
