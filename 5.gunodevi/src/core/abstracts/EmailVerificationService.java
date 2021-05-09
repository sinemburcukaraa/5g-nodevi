package core.abstracts;

import entities.concretes.user;

public interface EmailVerificationService {
  void verifyemail(user user);
  boolean isverified(user user);
}
