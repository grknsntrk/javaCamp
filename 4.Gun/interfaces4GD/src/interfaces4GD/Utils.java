package interfaces4GD;

public class Utils {

	public static void runLoggers(Logger[] loggers, String message) {  // static new yapmadan kullanýmý saðlýyor
		for (Logger logger: loggers) {
			logger.log(message);	
		}

	}
	
}
