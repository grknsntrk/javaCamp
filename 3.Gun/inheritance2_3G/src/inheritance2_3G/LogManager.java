package inheritance2_3G;

public class LogManager {
	
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritaban� logland� ...");
		}
		else if (logType == 2)
			System.out.println("File logland� ...");
		else
			System.out.println("Email logland� ...");
	}
	

}

	// 1- Database
	// 2- File
	// 3- Email