package asbaprin.ws.soap.test;

import java.rmi.RemoteException;

import org.oorsprong.www.websamples_countryinfo.CountryInfoServiceSoapTypeProxy;
import org.oorsprong.www.websamples_countryinfo.TCurrency;

public class ContryTest {

	public static void main(String[] args) {
		CountryInfoServiceSoapTypeProxy countryInfoServiceSoapTypeProxy = new CountryInfoServiceSoapTypeProxy();
		try {
			TCurrency currency = countryInfoServiceSoapTypeProxy.countryCurrency("MX");
			System.out.println("La divisa demanada és: " + currency.getSName());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
	}
	
}
