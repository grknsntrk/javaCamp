package polymorphism_3G;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		
		this.logger = logger;
		
	}
	
	
	public void add() {
		System.out.println("M�steri Eklendi");
		this.logger.Log("log mesaj�");
		
	}
	
	

}
