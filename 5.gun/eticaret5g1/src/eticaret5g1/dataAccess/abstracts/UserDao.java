package eticaret5g1.dataAccess.abstracts;

import java.util.ArrayList;

import eticaret5g1.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	User get(int id);
	ArrayList<User> getAll();
	

}
