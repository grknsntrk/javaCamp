package polymorphism_3G;

public class Main {

	public static void main(String[] args) {

		EmailLogger logger = new EmailLogger();

		logger.Log("T�m veriler");
		
		
		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(),new FileLogger(),new EmailLogger()};
		
		for (BaseLogger fulllogger : loggers) {
			fulllogger.Log("Log mesaj�");
			
		}
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());	
		customerManager.add();
		
		

	}

}
