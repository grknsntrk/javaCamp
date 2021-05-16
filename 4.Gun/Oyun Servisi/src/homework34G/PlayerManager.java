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
			System.out.println(player.getFirstName()+ " kullanýcýsý eklendi...");
		}
		else
			System.out.println("Doðrulanmadý eklenmedi...");
		
	}

	@Override
	public void delete(BasePlayer player) {
		System.out.println(player.getFirstName()+ " kullanýcýsý silindi");
	}
	
	


//	boolean yassýnýr = true ; 
//	
//	@Override
//	public void add(BasePlayer player) {
//		
//		if(player.age >= 12) {
//			System.out.println(player.getFirstName().toUpperCase() + " oyun sistemine eklendi");
//			yassýnýr = true;
//			
//		}
//		else {
//			System.out.println("!!! 12 YAÞINDAN BÜYÜK OLMALISINIZ !!!");
//		    yassýnýr = false;
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
