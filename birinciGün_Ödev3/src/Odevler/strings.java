package demoBuyukSayýBulma;

public class strings {

	public static void main(String[] args) {
	
		String hava = "Bugün hava çok güzel";
//
//		System.out.println(hava.length());       //metin uzunluðunu verir
//		System.out.println("------------------");		//
//		System.out.println(hava.charAt(11));			//konuma göre karakter 
//		System.out.println("-------------------");
//		System.out.println(hava.startsWith("b"));			//ne ile baþladýðýný kontrol eder
//		System.out.println("----------------");
//		System.out.println(hava.concat("..... çokkkk"));		//metin birleþtirme
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
		
		System.out.println(hava.replace(' ', '-')); // karakteri local olarak deðiþtirme
		System.out.println("-------------------");
		System.out.println(hava.substring(2));		//verilen indexten itibaren kes
		System.out.println("-------------------");
		System.out.println(hava.substring(2,4)); 		//verilen aralýkta parçalar
		
		System.out.println("-------------------");
		
		for(String kelime:hava.split(" ")) {          // split verilen karakter için ayýrma yapar
			System.out.println(kelime);
			
		}
		
		System.out.println("-------------------");
		
		System.out.println(hava.toUpperCase()); // tüm mesajý büyük harfe çevirir
		
		System.out.println("-------------------");
		System.out.println(hava.toLowerCase()); 		//tüm mesajý küçük harfe çevirir

		System.out.println("-------------------");
		
		String bosluk = "            naber          ";
		
		System.out.println(bosluk.trim());			//baþtaki ve sondaki boþluklarý budar				
		
		
		System.out.println("-------------------");
		
		System.out.println("-------------------");

		
		
		

		
		
	}

	
	
}
