package eticaret5g1.business.concretes;



import eticaret5g1.business.abstracts.AuthenticationService;
import eticaret5g1.business.abstracts.UserService;
import eticaret5g1.core.abstracts.JLoggerService;
import eticaret5g1.dataAccess.abstracts.UserDao;
import eticaret5g1.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private AuthenticationService authenticationService;
	private JLoggerService jLoggerService;
	
	public UserManager(UserDao userDao, AuthenticationService authenticationService, JLoggerService jLoggerService) {
		this.userDao = userDao;
		this.authenticationService = authenticationService;
		this.jLoggerService = jLoggerService;
	}
	
	@Override
	public void register(User user) {
		if(authenticationService.firstNameCheck(user.getFirstName()) &&
		authenticationService.lastNameCheck(user.getLastName()) &&
		authenticationService.emailCheck(user.getEmail()) &&
		authenticationService.passwordCheck(user.getPassword())
		) {
			userDao.add(user);
			jLoggerService.logToSystem("mail gönderildi");
		}
		
	
		
	}

	@Override
	public void signIn(String email, String password) {
		
		
	}

}
