package staticDemo;

public class ProductManager {

	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();  // static ekledi�imiz i�in new yapmam�za gerek yok
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");

		}
		else
			System.out.println("�r�n bilgileri ge�ersiz...");
	}
	
	
}
