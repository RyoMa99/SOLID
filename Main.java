import DIP.Controller.UserController;
import DIP.Repository.UserRepository;
import DIP.Service.UserService;
import OCP.Animals;
import OCP.Lion;
import OCP.Snake;
import OCP.Interface.Animal;
import SRP.*;
import SRP.ValueObject.*;

class Main{
  public static void main(String[] args) {
    RegularPrice bookPrice = new RegularPrice(500);
    System.out.println(bookPrice.amount);

    RegularDiscountedPrice bookDiscountedPrice = new RegularDiscountedPrice(bookPrice);
    System.out.println(bookDiscountedPrice.amount);

    SummerDiscountedPrice summerBookDiscountedPrice = new SummerDiscountedPrice(bookPrice);
    System.out.println(summerBookDiscountedPrice.amount);

    Animal animals[] = {new Lion(), new Snake()};
    Animals.animalsSounds(animals);

    UserRepository repo = new UserRepository();
    UserService service = new UserService(repo);
    UserController controller = new UserController(service);
    System.out.println(controller.get());
  }
}