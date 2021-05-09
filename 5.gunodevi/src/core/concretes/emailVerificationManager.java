package core.concretes;

import core.abstracts.EmailVerificationService;
import entities.concretes.user;

public class emailVerificationManager implements EmailVerificationService{

	@Override
	public void verifyemail(user user) {
      System.out.println(user.getEmail() + " adresine g�nderdi�imiz do�rulama linkine t�klay�n�z");		
	}

	@Override
	public boolean isverified(user user) {
	      System.out.println(user.getFirstname() + " eposta adresiniz ba�ar�yla do�ruland�");		
	      return true;
	}

}
