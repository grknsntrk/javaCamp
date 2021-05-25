package eticaret5g1.business.abstracts;

import eticaret5g1.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void signIn(String email, String password);
	
	
	
	

}
