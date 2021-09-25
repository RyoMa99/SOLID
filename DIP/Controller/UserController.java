package DIP.Controller;

import DIP.Controller.Interface.IUserService;

public class UserController {
  IUserService service;
  public UserController(IUserService service){
    this.service = service;
  }

  public String get(){
    String userId = "001";
    return service.Fetch(userId);
  }
}
