package dersvideo4G;

public abstract class  GameCalculater {
	
	public GameCalculater() {
		System.out.println("100");
	}
	
	public abstract void hesapla(); // default bir kodu olmas�n (abstract)
	/*
	{
	System.out.println("Puan�n�z: 100");
}
*/
	
	public final void gameOver() {
		System.out.println("Oyun bitti...");
	}
	

}
