package demoBuyukSay�Bulma;

public class enBuyukSayi {

	public static void main(String[] args) {

		int a = 50;
		int b = 1850;
		int c = 150;
		int enbuyuk = a;

		/*
		 * if(a>b && a>c) {
		 * 
		 * System.out.println("a say�s� en b�y�k");
		 * 
		 * } else if(b>a && b>c) {
		 * 
		 * System.out.println("b say�s� en b�y�k"); } else
		 * System.out.println("c says�s� en b�y�k");
		 */

		if (enbuyuk < b) {

			enbuyuk = b;

		}
		if (enbuyuk < c) {
			enbuyuk = c;

		}

		System.out.println("en b�y�k say� :" + enbuyuk);

	}

}
