package demoBuyukSayýBulma;

public class switchDemo {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Geçtin");
			break;
		case 'B':
			System.out.println("Ýyi");
			break;

		case 'C':
			System.out.println("Orta");	
			break;
		case 'D':
			System.out.println("Kötü");
			break;

		default:
			System.out.println("geçersiz not giriþi");

		}

	}

}
