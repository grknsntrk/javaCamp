package homework34G;

public class PlayerManager implements PlayerService {
	
	private IPlayerCheckService aaaplayerCheckService;

	public PlayerManager() {
		
	}
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		this.aaaplayerCheckService = playerCheckService;
	}

	@Override
	public void add(BasePlayer player) {
		
		if(aaaplayerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName()+ " kullan�c�s� eklendi...");
		}
		else
			System.out.println("Do�rulanmad� eklenmedi...");
		
	}

	@Override
	public void delete(BasePlayer player) {
		System.out.println(player.getFirstName()+ " kullan�c�s� silindi");
	}
	
	


//	boolean yass�n�r = true ; 
//	
//	@Override
//	public void add(BasePlayer player) {
//		
//		if(player.age >= 12) {
//			System.out.println(player.getFirstName().toUpperCase() + " oyun sistemine eklendi");
//			yass�n�r = true;
//			
//		}
//		else {
//			System.out.println("!!! 12 YA�INDAN B�Y�K OLMALISINIZ !!!");
//		    yass�n�r = false;
//		}
//		
//	}
//
//	@Override
//	public void delete(BasePlayer player) {
//
//		System.out.println(player.getFirstName().toUpperCase() + " oyun sisteminden silindi !!!");
//		
//		
//	}

	
	
	
}
