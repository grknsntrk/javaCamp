package dersvideo4G;

public abstract class  GameCalculater {
	
	public GameCalculater() {
		System.out.println("100");
	}
	
	public abstract void hesapla(); // default bir kodu olmasýn (abstract)
	/*
	{
	System.out.println("Puanýnýz: 100");
}
*/
	
	public final void gameOver() {
		System.out.println("Oyun bitti...");
	}
	

}
