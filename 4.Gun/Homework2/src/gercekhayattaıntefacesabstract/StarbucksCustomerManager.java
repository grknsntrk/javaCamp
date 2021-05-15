package gercekhayatta�ntefacesabstract;

public class StarbucksCustomerManager extends CustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager() {
		
	}
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			//System.out.println("M��teri eklendi : " + customer.getFirstName());
			super.save(customer);
		}
		else {
			System.out.println("Kullan�c� eklenemedi !!!");
		}
		
		
	}	
		
		
		
			
	}
	
	
	
	
	


