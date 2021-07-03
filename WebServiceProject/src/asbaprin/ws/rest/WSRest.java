package asbaprin.ws.rest;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Random;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.oorsprong.www.websamples_countryinfo.CountryInfoServiceSoapTypeProxy;
import org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName;

import asbaprin.ws.rest.data.Dia;

@Path("/temps")
public class WSRest {

	@GET
	@Path("/avui")
	public String diaMes() {
		Calendar now = Calendar.getInstance();
		return "Avui es: dia " + now.get(Calendar.DAY_OF_MONTH) +
				" mes " + (now.get(Calendar.MONTH) + 1) +
				" any " + now.get(Calendar.YEAR);
	}
	
	@GET
	@Path("/avuiJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public JsonObject diaMesJson() {
		Dia avui = new Dia();
		return avui.getJson().build();
	}
	
	@GET
	@Path("/randomCountry")
	public String randomCountry() {
		Random random = new Random();
		try {
			CountryInfoServiceSoapTypeProxy countryInfoServiceSoapTypeProxy = new CountryInfoServiceSoapTypeProxy();
			TCountryCodeAndName[] countrylist = countryInfoServiceSoapTypeProxy.listOfCountryNamesByName();
			return countrylist[random.nextInt(countrylist.length)].getSName();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return "Algo malo pasó";
	}
	
}
