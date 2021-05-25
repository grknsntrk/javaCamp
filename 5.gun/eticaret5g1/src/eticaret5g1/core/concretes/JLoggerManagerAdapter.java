package eticaret5g1.core.concretes;

import eticaret5g1.core.abstracts.JLoggerService;

public class JLoggerManagerAdapter implements JLoggerService {

	@Override
	public void logToSystem(String message) {

		System.out.println("JLogger ile eklendi : " + message);
		
	}

}
