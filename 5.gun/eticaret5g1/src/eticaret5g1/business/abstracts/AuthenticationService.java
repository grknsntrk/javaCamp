package eticaret5g1.business.abstracts;

public interface AuthenticationService {
	
	boolean firstNameCheck(String firstName);
	boolean lastNameCheck(String lastName);
	boolean emailCheck(String email);
	boolean passwordCheck(String password);

}
