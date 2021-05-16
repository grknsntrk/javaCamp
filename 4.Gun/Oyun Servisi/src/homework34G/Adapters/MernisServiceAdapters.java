package homework34G.Adapters;

import homework34G.BasePlayer;
import homework34G.IPlayerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements IPlayerCheckService {


	@Override
	public boolean checkIfRealPerson(BasePlayer basePlayer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
		result = proxy.TCKimlikNoDogrula(Long.parseLong(basePlayer.getNatioanlityId()),
				basePlayer.getFirstName(),
				basePlayer.getLastName().toLowerCase(),
				basePlayer.getDateOfBirthday().getYear());

		}
		catch (Exception e){
			System.out.println("Not valid a person");
		}
		return result;
	
	}
	
	
}
