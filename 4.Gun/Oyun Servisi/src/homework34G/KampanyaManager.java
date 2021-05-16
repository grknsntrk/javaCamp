package homework34G;

public class KampanyaManager {
	
	public KampanyaManager() {
		
	}
	
	double kampanyalıfiyat;
	double kampanyayüzdesi;
		
	public KampanyaManager(Game game, int kampanyayuzdesi) {
		
		
		double kampanyalıfiyat = game.fiyat - (game.fiyat/100 * kampanyayuzdesi);
		this.kampanyalıfiyat = kampanyalıfiyat;
		this.kampanyayüzdesi = kampanyayuzdesi;
				
		
	}
	
	

}
