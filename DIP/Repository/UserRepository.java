package DIP.Repository;

import DIP.Service.Interface.IUserRepository;

public class UserRepository implements IUserRepository {
  public String FetchByUserId(String userId){
    // connect db
    return String.format("%s is you.", userId);
  }
}
