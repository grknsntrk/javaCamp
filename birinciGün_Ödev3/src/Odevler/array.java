package demoBuyukSayýBulma;

public class array {

	public static void main(String[] args) {

		/*
		 * String[] ad = new String[];
		 * 
		 * ad[0]="ali";
		 * 
		 * System.out.println(ad[0]);
		 */
		double[] mylist = { 1, 1.5, 7.2, 8.3 };
		double toplam = 0;
		double max = 0;
		for (double a : mylist) {
			if (max < a) {
				max = a;
			}

			toplam = toplam + a;

			System.out.println(a);

		}
		System.out.println(toplam);
		System.out.println("en büyük sayý : " + max);
		
		System.out.println("------------------------------------------------------------");

		
		String[] [] sehirler = new String[2][2];
		
		sehirler [0][0] = "istanbul";
		sehirler [0][1] = "çanakkale";
		sehirler [1][0] = "izmir";
		sehirler [1][1] = "bursa";
		
		for(int i=0; i<=1 ;i++) {
			System.out.println("-------------------------------");
			for(int j=0; j<=1; j++) {
				System.out.println(sehirler[i][j]);
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
