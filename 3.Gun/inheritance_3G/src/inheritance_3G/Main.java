package inheritance_3G;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer gürkan = new IndividualCustomer();
		gürkan.setFirstName("Gürkan");
		gürkan.setLastName("Þentürk");
		gürkan.setId(1);
		gürkan.setCustomerNumber("12345");
		
		SendikaCustomer isci = new SendikaCustomer();
		isci.sendikaBiseyi = 9999;
		isci.setCustomerNumber("888888");
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setcompanyName("HepsiBurada");
		hepsiBurada.setCustomerNumber("45678");
		CustomerManager customermanager = new CustomerManager();
		
		
		
//		customermanager.add(hepsiBurada);
//		customermanager.add(gürkan);
//		customermanager.add(isci);
		
		Customer[] customers = {gürkan, isci, hepsiBurada};     //teker teker eklemek yerine multiple þekilde eklendi
		
		customermanager.addMultiple(customers);
		
		
	}

}
