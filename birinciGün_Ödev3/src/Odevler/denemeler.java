package demoBuyukSay�Bulma;

public class denemeler {

	public static void main(String[] args) {
			 
//		int number = 25;
//		int remainder = number % 2;
//		
//		System.out.println(remainder);
//		
//		if(number%2 == 0) {
//			System.out.println("asal de�il");
//			
//		}
//		else if (number%3 == 0 ) {
//			System.out.println("asal de�il");
//			
//		}
//		
//		else if(number % 5 == 0) {
//			
//			System.out.println("asal de�il");
//		}
//		

		
		int number = 25;
		boolean isPrime = false;
		
		for (int i =2 ; i< number;i++) {
			
			if (number % i == 0) {
				isPrime = false;
					
			}
			
		}
		
		if(isPrime)
			System.out.println("say� ASAL");
		else
			System.out.println("ASAL DE��L");
		
		
		
		
		

	}

}
