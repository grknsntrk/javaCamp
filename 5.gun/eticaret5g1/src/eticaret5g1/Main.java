package eticaret5g1;

import eticaret5g1.business.concretes.AuthenticationManager;
import eticaret5g1.business.concretes.UserManager;
import eticaret5g1.core.concretes.JLoggerManagerAdapter;
import eticaret5g1.dataAccess.concretes.MemoryUserDao;
import eticaret5g1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		MemoryUserDao memoryUserDao = new MemoryUserDao();
		
		UserManager userManager = new UserManager(new MemoryUserDao(), new AuthenticationManager(), new JLoggerManagerAdapter());
		
		User user = new User(1, "Ali", "Bey", "abcdefgk@gmail.com", "182457");
		User user2 = new User(2, "s", "gürses", "naber123@gmail.com", "555578");
		
		//System.err.println(user.getFirstName());
		
		//memoryUserDao.add(user);
		
		userManager.register(user);
		userManager.register(user2);
		
		
	}

}
