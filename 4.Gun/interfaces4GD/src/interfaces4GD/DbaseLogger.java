package interfaces4GD;

public class DbaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Database loglandý " + message);		
	}

	
	
}
