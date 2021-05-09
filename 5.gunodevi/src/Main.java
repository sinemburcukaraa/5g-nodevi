
import business.abstracts.userService;
import business.concretes.LoginManager;
import business.concretes.userManager;
import core.adapters.GoogleLoginManagerAdapter;
import core.concretes.checkManager;
import core.concretes.emailVerificationManager;
import dataAccess.concretes.inMemoryUserDao;
import entities.concretes.user;

public class Main {

	public static void main(String[] args) {
		userService userService = new userManager(new LoginManager(new inMemoryUserDao(), new checkManager(), new emailVerificationManager()), 
				  new GoogleLoginManagerAdapter());
		inMemoryUserDao inMemoryUserDao=new inMemoryUserDao();
		user users=new user();
		users.setFirstname("burcu");
		users.setLastName("kara");
		users.setEmail("burcu@gmail.com");
		users.setPassword("123456");
		userService.register(users);
		System.out.println("------------------------------------------");
		
		user users1=new user();
		users1.setFirstname("sinem");
		users1.setLastName("kara");
		users1.setEmail("sinem@gmail.com");
		users1.setPassword("12345678");
		userService.register(users1);
		System.out.println("------------------------------------------");
		
		
		
		userService.login("burcukara@gmail.com", "123456");
		userService.login("sinemkara@gmail.com", "12345678");
		System.out.println("------------------------------------------");
		
		
		userService.loginWithService();
		userService.registerWithService();
		
		System.out.println("------------------------------------------");

		inMemoryUserDao.add(users1);
		inMemoryUserDao.delete(users);
		
	}

}


