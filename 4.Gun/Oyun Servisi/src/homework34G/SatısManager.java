package homework34G;

public class Sat�sManager implements Sat�sManagerService{
	

	@Override
	public void sale(BasePlayer player , Game game, PlayerManager playerManager ) {
		
		System.out.println(player.getFirstName() + " kullan�c�s� " + game.name + " oyununu " + game.fiyat +" Tl'ye sat�n ald�. " );
		
	}

	
	@Override
	public void sale(BasePlayer player, Game game, KampanyaManager kampanya, PlayerManager playerManager) {
			
		System.out.println(player.getFirstName() + " kullan�c�s� " + game.name + " oyununu " + kampanya.kampanyal�fiyat +" Tl'ye sat�n ald�. " );
		System.out.println("*** %" + kampanya.kampanyay�zdesi + " KAMPANYA ***");
	
		
	}
	
	
	
	

}
