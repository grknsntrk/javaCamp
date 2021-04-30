package demoBuyukSayýBulma;

public class Dizidesayibulma {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
		int search = 17;
		boolean check = false;
		
		for (int i=0;i<10;i++) {
			if(numbers[i]==search) {
				check = true;
			}
			
		}
		if(check == true)
			System.out.println("Aranan sayý BULUNDU");
		else 
			System.out.println("öyle bir sayý YOK");
	}

}
