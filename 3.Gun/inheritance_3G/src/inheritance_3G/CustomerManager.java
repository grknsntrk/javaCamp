package inheritance_3G;


public class CustomerManager {
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : "+customer.getCustomerNumber());
	}
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer : customers) {
			add(customer);
			
		}
			
		
	}
	

}
