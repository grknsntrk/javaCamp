package demoBuyukSayýBulma;

public class enBuyukSayi {

	public static void main(String[] args) {

		int a = 50;
		int b = 1850;
		int c = 150;
		int enbuyuk = a;

		/*
		 * if(a>b && a>c) {
		 * 
		 * System.out.println("a sayýsý en büyük");
		 * 
		 * } else if(b>a && b>c) {
		 * 
		 * System.out.println("b sayýsý en büyük"); } else
		 * System.out.println("c saysýsý en büyük");
		 */

		if (enbuyuk < b) {

			enbuyuk = b;

		}
		if (enbuyuk < c) {
			enbuyuk = c;

		}

		System.out.println("en büyük sayý :" + enbuyuk);

	}

}
