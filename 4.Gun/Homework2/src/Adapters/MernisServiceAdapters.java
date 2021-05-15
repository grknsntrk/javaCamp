package Adapters;

import gercekhayattaýntefacesabstract.Customer;
import gercekhayattaýntefacesabstract.ICustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
		result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNatioanlityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toLowerCase(),
				customer.getDateOfBirthday().getYear());

		}
		catch (Exception e){
			System.out.println("Not valid a person");
		}
		return result;
	
	}

}
