package DIP.Service;

import DIP.Controller.Interface.IUserService;
import DIP.Service.Interface.IUserRepository;

public class UserService implements IUserService {
  IUserRepository repo;
  public UserService(IUserRepository repo){
    this.repo = repo;
  }

  public String Fetch(String userId){
    return repo.FetchByUserId(userId);
  }
}
