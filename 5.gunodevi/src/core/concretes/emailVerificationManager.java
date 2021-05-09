package core.concretes;

import core.abstracts.EmailVerificationService;
import entities.concretes.user;

public class emailVerificationManager implements EmailVerificationService{

	@Override
	public void verifyemail(user user) {
      System.out.println(user.getEmail() + " adresine gönderdiğimiz doğrulama linkine tıklayınız");		
	}

	@Override
	public boolean isverified(user user) {
	      System.out.println(user.getFirstname() + " eposta adresiniz başarıyla doğrulandı");		
	      return true;
	}

}
