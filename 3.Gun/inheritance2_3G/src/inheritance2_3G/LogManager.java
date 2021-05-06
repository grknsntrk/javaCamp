package inheritance2_3G;

public class LogManager {
	
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabaný loglandý ...");
		}
		else if (logType == 2)
			System.out.println("File loglandý ...");
		else
			System.out.println("Email loglandý ...");
	}
	

}

	// 1- Database
	// 2- File
	// 3- Email