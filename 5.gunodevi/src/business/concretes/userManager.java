package business.concretes;

import business.abstracts.LoginService;
import business.abstracts.userService;
import core.abstracts.outsourceservice;
import entities.concretes.user;

public class userManager implements userService{

	private LoginService loginService;
	private outsourceservice outService;
	
	public userManager(LoginService loginService, outsourceservice outService) {
		super();
		this.loginService = loginService;
		this.outService = outService;
	}
	@Override
	public void register(user user) {
		loginService.register(user);
	}
	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
	}
	@Override
	public void registerWithService() {
		outService.register();
	}

	@Override
	public void loginWithService() {
		outService.login();
	}

}
