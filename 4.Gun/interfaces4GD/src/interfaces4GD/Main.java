package interfaces4GD;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = new Logger[] {new FileLogger(), new DbaseLogger(),new EmailLogger(),new SmsLogger()};

		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer gürkan = new Customer(1,"Gürkan","Þentürk");
		
		customerManager.add(gürkan);
		customerManager.delete(gürkan);
		
		
		
		
		
		
	}

}
