package inheritance2_3G;

public class Main {

	public static void main(String[] args) {

//		LogManager logmanager = new LogManager();
//		
//		logmanager.log(1);
//		logmanager.log(2);
//		logmanager.log(3);

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());
		
		
		
	}

}
