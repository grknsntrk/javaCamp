package gercekhayatta�ntefacesabstract;

public class NeroCustomerManager extends CustomerManager{
	
	@Override 
	public void save (Customer customer) {
		System.out.println("Nero m��teri eklendi : " + customer.getFirstName());
	}
	
	
	

}
