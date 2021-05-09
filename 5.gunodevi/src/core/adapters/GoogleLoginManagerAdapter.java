package core.adapters;

import GoogleL.concretes.GoogleLoginManager;
import core.abstracts.outsourceservice;

public class GoogleLoginManagerAdapter implements outsourceservice {
	@Override
	public void register() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.register();
	}

	@Override
	public void login() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.login();
	}
}
