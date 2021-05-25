package eticaret5g1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaret5g1.business.abstracts.AuthenticationService;

public class AuthenticationManager implements AuthenticationService {

	@Override
	public boolean firstNameCheck(String firstName) {
		if(firstName.length() < 2) {
			System.out.println("Ýsim 2 karakterden uzun olmalý");
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(String lastName) {
		if(lastName.length() < 2) {
			System.out.println("Soyisim 2 karakterden uzun olmalý");
			return false;
		}
		return true;
	}

	@Override
	public boolean emailCheck(String email) {
		 String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);
	        if(matcher.matches()) {
	            return true;
	        }else if(email.isEmpty()) {
	            System.out.println("mail boþ býrakýlamaz");
	            return false;
	        }else{
	            System.out.println("Geçersiz mail adresi");
	            return false;
	        }
	}

	@Override
	public boolean passwordCheck(String password) {
		if(password.length() < 6) {
			System.out.println("parola 6 karakterden uzun olmalý");
			return false;
		}
		return true;
	}


}
