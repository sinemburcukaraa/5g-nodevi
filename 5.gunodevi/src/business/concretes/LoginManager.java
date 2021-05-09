package business.concretes;

import business.abstracts.LoginService;
import core.abstracts.EmailVerificationService;
import core.abstracts.checkService;
import dataAccess.abstracts.userDao;
import entities.concretes.user;

public class LoginManager implements LoginService {
    private userDao userDao;
    private checkService checkService;
    private EmailVerificationService verifycationEmail;
    
	public LoginManager(dataAccess.abstracts.userDao userDao, checkService checkService,
			EmailVerificationService verifycationEmail) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.verifycationEmail = verifycationEmail;
	}

	@Override
	public void sameemail(String email) {
		for (user user : userDao.getAll()) {
			if (user.getEmail() == email) {
				throw new ArithmeticException("Bu E-Posta adresi mevcut.");
			}
		}
	}

	@Override
	public void register(user user) {
   		
   		if(!checkService.Email(user.getEmail())){
   			System.out.println("email kontrolü baþarýlý");
   			return;
   		}
   		if(!checkService.FirstName(user.getFirstname())){
   			System.out.println("isim kontrolü baþarýlý");
   			return;
   		}
   		if(!checkService.LastName(user.getLastName())){
   			System.out.println("soyisim kontrolü baþarýlý");
   			return;
   		}
   		if(!checkService.Password(user.getPassword())){
   			System.out.println("þifre kontrolü baþarýlý");
   			return;
   		}
   		verifycationEmail.verifyemail(user);
		verifycationEmail.isverified(user);
		userDao.add(user);
		System.out.println("kayýt iþlemi baþarýlý");
	}

	@Override
	public void login(String email, String password) {
		if (!checkService.Email(email)) {
			return;
		}
		if (!checkService.Password(password)) {
			return;
		}
		for (user user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				System.out.println(user.getFirstname() + " " + user.getLastName() + " Baþarýyla giriþ yaptýnýz.");
				return;
			}
		}
		throw new ArithmeticException("Hatalý eposta adresi veya parola girdiniz. Lütfen tekrar deneyin.");
	}
	
	
}
