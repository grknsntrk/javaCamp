package staticDemo;

public class ProductManager {

	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();  // static eklediðimiz için new yapmamýza gerek yok
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");

		}
		else
			System.out.println("ürün bilgileri geçersiz...");
	}
	
	
}
