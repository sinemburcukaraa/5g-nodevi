package core.concretes;

import core.abstracts.checkService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class checkManager implements checkService{

	@Override
	public boolean Email(String email) {
		Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Matcher m = p.matcher("burcukara@gmail.com");

		if (m.find() && !email.isEmpty()) {
		    return true;
		}
		else {
           System.out.println("lütfen geçerli bir email adresi giriniz!");            
           return false;
        }
	}

	@Override
	public boolean Password(String password) {
		if(password.length()>=6) {
			return true;
		}
		else {
            throw new ArithmeticException("þifreniz en az 6 karakterden oluþmalýdýr!");
		}
	}

	@Override
	public boolean FirstName(String firstname) {
        if(firstname.length()>=2) {
        	return true;
        }
        else {
            throw new ArithmeticException("adýnýz en az 2 karakterden oluþmalýdýr!");
		}
	}

	@Override
	public boolean LastName(String lastname) {
		 if(lastname.length()>=2) {
	        	return true;
	        }
	        else {
	            throw new ArithmeticException("soyadýnýz en az 2 karakterden oluþmalýdýr!");
			}	}

}
