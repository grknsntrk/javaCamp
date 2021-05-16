package homework34G;

import java.time.LocalDate;

import homework34G.Adapters.MernisServiceAdapters;

public class Main {

	public static void main(String[] args) {
		
		BasePlayer player = new BasePlayer("00000000000", "G�rkan", "�ent�rk", LocalDate.of(1999, 07, 20));
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManger());
//		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapters());		
		
		playerManager.add(player);
		
		Game game = new Game();
		game.name = "CallofDuty";
		game.fiyat = 40;
		
		KampanyaManager ogrenci = new KampanyaManager(game, 20);
		
		Sat�sManager sat�sManager = new Sat�sManager();
		
		sat�sManager.sale(player, game, ogrenci, playerManager);
		
		
		
		
//		
//		BasePlayer player = new BasePlayer();
//		BasePlayer player1 = new BasePlayer();
//		
//		Game game = new Game();
//		game.name = "LOL";
//		game.fiyat = 50;
//		
//		Game game1 = new Game();
//		game1.name = "CS:GO";
//		game1.fiyat = 7.5;
//		
//		
//		Game game2 = new Game();
//		game2.name ="Call of Duty";
//		game2.fiyat = 67;
//		
//		player.firstName = "Arya";
//		player.age = 20;
//		
//		player1.firstName = "Ahmet";
//		player1.age = 8;
//		
//		PlayerManager playerManager = new PlayerManager();
//		
//		playerManager.add(player);
//		playerManager.delete(player);
//		
//		playerManager.add(player1);
//		
//		KampanyaManager kampanyaManager = new KampanyaManager(game, 20);
//		KampanyaManager ogrenci = new KampanyaManager(game2,50);
//		
//		Sat�sManager sat�sManager = new Sat�sManager();
//		
//	//	sat�sManager.sale(player,game);
////		sat�sManager.sale(player, game1);
//		
//		System.out.println("*****************");
//		sat�sManager.sale(player1, game, playerManager);
//		
//		System.out.println("*****************");
//
//		sat�sManager.sale(player, game2, ogrenci, playerManager);
//	//	sat�sManager.sale(player, game, kampanyaManager);
//	//	sat�sManager.sale(player1, game2, ogrenci);
//		
		

		
		
		
	}

}
