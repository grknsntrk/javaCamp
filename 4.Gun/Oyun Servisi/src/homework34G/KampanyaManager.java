package homework34G;

public class KampanyaManager {
	
	public KampanyaManager() {
		
	}
	
	double kampanyal�fiyat;
	double kampanyay�zdesi;
		
	public KampanyaManager(Game game, int kampanyayuzdesi) {
		
		
		double kampanyal�fiyat = game.fiyat - (game.fiyat/100 * kampanyayuzdesi);
		this.kampanyal�fiyat = kampanyal�fiyat;
		this.kampanyay�zdesi = kampanyayuzdesi;
				
		
	}
	
	

}
