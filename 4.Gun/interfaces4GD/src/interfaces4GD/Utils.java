package interfaces4GD;

public class Utils {

	public static void runLoggers(Logger[] loggers, String message) {  // static new yapmadan kullan�m� sa�l�yor
		for (Logger logger: loggers) {
			logger.log(message);	
		}

	}
	
}
