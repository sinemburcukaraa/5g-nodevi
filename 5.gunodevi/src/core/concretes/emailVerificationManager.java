package core.concretes;

import core.abstracts.EmailVerificationService;
import entities.concretes.user;

public class emailVerificationManager implements EmailVerificationService{

	@Override
	public void verifyemail(user user) {
      System.out.println(user.getEmail() + " adresine gönderdiðimiz doðrulama linkine týklayýnýz");		
	}

	@Override
	public boolean isverified(user user) {
	      System.out.println(user.getFirstname() + " eposta adresiniz baþarýyla doðrulandý");		
	      return true;
	}

}
