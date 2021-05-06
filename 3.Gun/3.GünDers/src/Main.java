// variables
// intelisense
// 	conditionals


// steak heap
  

public class Main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product(1, "Pavalion 15", 6000, "16 GB Ram",10); // örnek oluþturma referans oluþturma, intance class oluþturma
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setUnitPrice(1600);
		product2.setDiscount(10);
		product2.getUnitpriceAfterDiscount();
		
		System.out.println(product2.getUnitpriceAfterDiscount());
		
		Category category1 = new Category();
		Category category2 = new Category();	
	
		category1.setId(10);
		category1.setName("deneme1");		
		category2.setId(20);
		category2.setName("deneme2");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());



//		Product product3 = new Product(); 
//		product3.id = 3;
//		product3.name = "Toshiba 15";
//		product3.unitPrice= 9050;
//		product3.detail = "32 GB Ram";
//		
//		Product[] products = {product1,product2,product3};
//		
//		for (Product product : products) {
//			System.out.println(product.name);
//		}
//		
//		System.out.println(products.length);
//		
//		Category category1 = new Category();
//		
//		category1.id = 1;
//		category1.name = "Elektronik";
//		category1.tür= "depolama";
//		
//		Category category2 = new Category();
//		
//		category2.id = 2;
//		category2.name = "Ev/Bahçe";
//		
//		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
//		
//		productManager.addToCart(product2);
//		
//		

	}

}
