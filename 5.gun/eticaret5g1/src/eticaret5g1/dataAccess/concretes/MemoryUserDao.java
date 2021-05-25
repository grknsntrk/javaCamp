package eticaret5g1.dataAccess.concretes;

import java.util.ArrayList;

import eticaret5g1.dataAccess.abstracts.UserDao;
import eticaret5g1.entities.concretes.User;

public class MemoryUserDao implements UserDao {
	
	ArrayList<User> users;
	
	public MemoryUserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Eklendi ** : " + user.getFirstName());
		
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
