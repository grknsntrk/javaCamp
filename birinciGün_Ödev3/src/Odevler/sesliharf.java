package demoBuyukSayýBulma;


public class sesliharf {

	public static void main(String[] args) {
		
		
//		
//		String harf = "k";
//				boolean check = true;
//		String[] sesliharf = new String[10];
//		sesliharf [0] = "a";
//				sesliharf [1] = "e"; 
//				sesliharf [2] = "ý"; 
//				sesliharf [3] = "i"; 
//				sesliharf [4] = "o"; 
//				sesliharf [5] = "ö"; 
//				sesliharf [6] = "u"; 
//				sesliharf [7] = "ü"; 
//				
//				for (int i=0; i<7;i++) {
//					if(harf == sesliharf[i])
//						check = true;
//					else
//						check = false;
//				}				
//					
//					
//					if (check == true)
//						System.out.println("SESLÝ");
//					else
//						System.out.println("SESSÝZ");
//					
//					
//				for (int i=0 ; i<7 ; i++) {
//					System.out.println(sesliharf[i]);
				
		
		char harf = 'K';
		
		switch (harf) {
		
		case 'A' : 
		case 'E' : 	
		case 'I' : 
		case 'Ý' : 
		case 'O' : 
		case 'Ö' : 
		case 'U' : 
		case 'Ü' : 	
			System.out.println("SESLÝ");
			break;
			default:
				System.out.println("SESSÝZ");
			
			
		}
		
		
				
				
	}		
}
