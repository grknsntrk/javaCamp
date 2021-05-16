package homework34G;

public class SatýsManager implements SatýsManagerService{
	

	@Override
	public void sale(BasePlayer player , Game game, PlayerManager playerManager ) {
		
		System.out.println(player.getFirstName() + " kullanýcýsý " + game.name + " oyununu " + game.fiyat +" Tl'ye satýn aldý. " );
		
	}

	
	@Override
	public void sale(BasePlayer player, Game game, KampanyaManager kampanya, PlayerManager playerManager) {
			
		System.out.println(player.getFirstName() + " kullanýcýsý " + game.name + " oyununu " + kampanya.kampanyalýfiyat +" Tl'ye satýn aldý. " );
		System.out.println("*** %" + kampanya.kampanyayüzdesi + " KAMPANYA ***");
	
		
	}
	
	
	
	

}
