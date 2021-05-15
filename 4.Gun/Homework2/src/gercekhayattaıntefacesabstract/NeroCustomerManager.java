package gercekhayattaıntefacesabstract;

public class NeroCustomerManager extends CustomerManager{
	
	@Override 
	public void save (Customer customer) {
		System.out.println("Nero müşteri eklendi : " + customer.getFirstName());
	}
	
	
	

}
