package asbaprin.ws.soap;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import asbaprin.ws.soap.data.GenericData;

@WebService
@SOAPBinding
interface WSSoap {

	@WebMethod
	int potencia(@WebParam(name="intA") int a, @WebParam(name="intB") int b);
	
	@WebMethod
	Date timeNow();
	
	@WebMethod
	int factorial(int number);
	
	@WebMethod
	List<GenericData> getAll();
	
	@WebMethod
	GenericData getById(@WebParam(name="id") int id);
	
	@WebMethod
	String save(@WebParam(name="genericData") GenericData toSave);
	
	@WebMethod
	String remove(@WebParam(name="id") int id);
}
