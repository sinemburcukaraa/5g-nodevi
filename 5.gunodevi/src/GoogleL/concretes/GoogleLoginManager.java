package GoogleL.concretes;

import GoogleL.abstracts.GoogleLoginService;

public class GoogleLoginManager implements GoogleLoginService{

	@Override
	public void register() {
      System.out.println("google hesabýnýz ile kayýt oldunuz");		
	}

	@Override
	public void login() {
	      System.out.println("google hesabýnýz ile giriþ yaptýnýz");		
		
	}

}
