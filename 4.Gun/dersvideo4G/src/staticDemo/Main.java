package staticDemo;

public class Main {

	public static void main(String[] args) {

		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.name="Laptop";
		product.id=1;
		product.price=2500;
		productManager.add(product);
		
		
	}

}
