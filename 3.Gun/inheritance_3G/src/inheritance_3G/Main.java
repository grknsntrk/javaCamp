package inheritance_3G;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer g�rkan = new IndividualCustomer();
		g�rkan.setFirstName("G�rkan");
		g�rkan.setLastName("�ent�rk");
		g�rkan.setId(1);
		g�rkan.setCustomerNumber("12345");
		
		SendikaCustomer isci = new SendikaCustomer();
		isci.sendikaBiseyi = 9999;
		isci.setCustomerNumber("888888");
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setcompanyName("HepsiBurada");
		hepsiBurada.setCustomerNumber("45678");
		CustomerManager customermanager = new CustomerManager();
		
		
		
//		customermanager.add(hepsiBurada);
//		customermanager.add(g�rkan);
//		customermanager.add(isci);
		
		Customer[] customers = {g�rkan, isci, hepsiBurada};     //teker teker eklemek yerine multiple �ekilde eklendi
		
		customermanager.addMultiple(customers);
		
		
	}

}
