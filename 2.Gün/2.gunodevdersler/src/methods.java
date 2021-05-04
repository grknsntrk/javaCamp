public class methods {
	

	public static void main(String[] args) {
		
		sayiBulmaca();
		
	}
	public static void sayiBulmaca() {
		
		int[] sayilar = {1,2,5,7,9,0,6};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar)
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		
		
		
		if(varMi)
//			System.out.println("BULUNDU");
			mesaj(aranacak);
		else 
			System.out.println("YOK");
		
	
		

	}
	
	public static void mesaj(int aranacak) {		// parametreli method
		
		System.out.println("Aranan bulundu : "+ aranacak);		
		
		
	}

}

