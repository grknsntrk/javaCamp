package interfaces4GD;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = new Logger[] {new FileLogger(), new DbaseLogger(),new EmailLogger(),new SmsLogger()};

		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer g�rkan = new Customer(1,"G�rkan","�ent�rk");
		
		customerManager.add(g�rkan);
		customerManager.delete(g�rkan);
		
		
		
		
		
		
	}

}
