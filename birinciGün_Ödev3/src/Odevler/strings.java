package demoBuyukSay�Bulma;

public class strings {

	public static void main(String[] args) {
	
		String hava = "Bug�n hava �ok g�zel";
//
//		System.out.println(hava.length());       //metin uzunlu�unu verir
//		System.out.println("------------------");		//
//		System.out.println(hava.charAt(11));			//konuma g�re karakter 
//		System.out.println("-------------------");
//		System.out.println(hava.startsWith("b"));			//ne ile ba�lad���n� kontrol eder
//		System.out.println("----------------");
//		System.out.println(hava.concat("..... �okkkk"));		//metin birle�tirme
//		System.out.println("-------------------");
//		System.out.println(hava.endsWith("k"));					//biten karekteri kontrol
//		System.out.println("-------------------");
//		char[] deneme = new char[6];
//		hava.getChars(0, 4, deneme, 0);
//		System.out.println(deneme);
//		System.out.println("-------------------");
//		System.out.println(hava.indexOf("g"));
//		System.out.println("-------------------");
//
//		System.out.println("-------------------");
		
		System.out.println(hava.replace(' ', '-')); // karakteri local olarak de�i�tirme
		System.out.println("-------------------");
		System.out.println(hava.substring(2));		//verilen indexten itibaren kes
		System.out.println("-------------------");
		System.out.println(hava.substring(2,4)); 		//verilen aral�kta par�alar
		
		System.out.println("-------------------");
		
		for(String kelime:hava.split(" ")) {          // split verilen karakter i�in ay�rma yapar
			System.out.println(kelime);
			
		}
		
		System.out.println("-------------------");
		
		System.out.println(hava.toUpperCase()); // t�m mesaj� b�y�k harfe �evirir
		
		System.out.println("-------------------");
		System.out.println(hava.toLowerCase()); 		//t�m mesaj� k���k harfe �evirir

		System.out.println("-------------------");
		
		String bosluk = "            naber          ";
		
		System.out.println(bosluk.trim());			//ba�taki ve sondaki bo�luklar� budar				
		
		
		System.out.println("-------------------");
		
		System.out.println("-------------------");

		
		
		

		
		
	}

	
	
}
