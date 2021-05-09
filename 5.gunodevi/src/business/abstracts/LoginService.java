package business.abstracts;

import entities.concretes.user;

public interface LoginService {
	
	  void sameemail(String email);
	  void register(user user);
	  void login(String email,String password);
}
