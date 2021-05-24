package CoffeShop.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomersCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		boolean result; 
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
		try { 
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					customer.getNationalIdentity(),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getTimeOfBirth()
					); 
		}
	    catch (RemoteException e) { 
			result = false; 
			e.printStackTrace(); 
		}
	    return result;
		
		/*
		
//		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
//		
//		var result = true;
//		
//		try {
//			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(new Locale("tr")), 
//					customer.getLastName().toUpperCase(new Locale("tr")),customer.getTimeOfBirth());
//		
//		}  catch (RemoteException e) {
//
//			e.printStackTrace();
//		}
//		
//		return result;
//	}
	
	*/
	
	}
}
