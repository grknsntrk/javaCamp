package gercekhayatta�ntefacesabstract;

import java.time.LocalDate;

import Adapters.MernisServiceAdapters;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
	//	CustomerManager customerManager1 = new NeroCustomerManager();
		
	
		Customer customer = new Customer();
		
		customer.setFirstName("g�rkan");
		customer.setLastName("�ent�rk");
		customer.setDateOfBirthday(LocalDate.of(1999, 07, 20));
		customer.setId(1);
		customer.setNatioanlityId("32389257324");
		
		//customerManager.save(customer);
		
		customerManager.save(new Customer("32389257324","G�rkan","�ent�rk",LocalDate.of(1999, 07, 20)));
	//	customerManager1.save(customer);
	
		
		
		
		
	}

}
