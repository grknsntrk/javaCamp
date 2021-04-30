package demoBuyukSayıBulma;

public class arkadassayilardeneme {

	public static void main(String[] args) {
		
		int number = 220;
		int number1 = 284;
		int total = 0;
		int total1=0;
		
		for (int i = 1; i<number ; i++)
			if(number%i == 0)
				total = total +i;
		
		System.out.println(total);
		
		for (int i = 1; i<number1 ; i++)
			if(number1%i == 0)
				total1 = total1 +i;
		
		System.out.println(total1);
		
		if(total == 284 && total1 == 220)
			System.out.println("ARKADAŞ");
		else
			System.out.println("DÜŞMAN");
		
	}

}
