
public class Methods2_parametreli {

	public static void main(String[] args) {
		System.out.println("*******************************");
		ekle();
		çýkar();
		System.out.println("*******************************");
		
		topla(50, 200, 100);
		System.out.println(topla(50, 100, 50));
		System.out.println("*******************************");
		System.out.println(sehir());

		int sayi = topla(1, 3, 5);
		System.out.println(sayi);
		
		String bulundugunSehir = sehir();
		System.out.println(bulundugunSehir);
		
		int toplamaislemi = topla2(1,3,5,7,9,11,15,35,78);
		System.out.println(toplamaislemi);
		
		
		

	}

	public static void ekle() {

		System.out.println("EKLENDÝ");
	}

	public static void çýkar() {
		System.out.println("ÇIKARILDI");
	}

	public static int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
	
	public static String sehir() {
		return "Ankara";
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
			
	}

}










