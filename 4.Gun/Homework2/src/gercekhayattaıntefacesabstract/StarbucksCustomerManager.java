package gercekhayattaýntefacesabstract;

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
			//System.out.println("Müþteri eklendi : " + customer.getFirstName());
			super.save(customer);
		}
		else {
			System.out.println("Kullanýcý eklenemedi !!!");
		}
		
		
	}	
		
		
		
			
	}
	
	
	
	
	


