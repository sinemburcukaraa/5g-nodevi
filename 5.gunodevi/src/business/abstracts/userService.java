package business.abstracts;

import entities.concretes.user;

public interface userService {
  
  void register(user user);
	void login(String email, String password);
	void registerWithService();
	void loginWithService();
}
