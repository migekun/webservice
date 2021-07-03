package asbaprin.ws.soap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import asbaprin.ws.soap.data.GenericData;

@WebService(endpointInterface="asbaprin.ws.soap.WSSoap")
public class WSSoapImpl implements WSSoap {
	
	public WSSoapImpl() {
		super();
	}
	
	@Override 
	public int potencia(int a, int b) {
		return Double.valueOf(Math.pow(a, b)).intValue();
	}

	@Override
	public Date timeNow() {
		return new Date();
	}

	@Override
	public int factorial(int number) {
		int i,fact=1;  
		for (i=1;i<=number;i++){    
			fact = fact*i;    
		}    
		return fact;
	}

	private static List<GenericData> allGenericData = new ArrayList<>();
	
	@Override
	public List<GenericData> getAll() {
		return allGenericData;
	}

	@Override
	public GenericData getById(int id) {
		for (GenericData data: allGenericData) {
			if (data.getId() == id) return data;
		}
		return null;
	}

	@Override
	public String save(GenericData toSave) {
		for (GenericData data: allGenericData) {
			if (data.getId() == toSave.getId()) {
				data.setNom(toSave.getNom());
				return toSave.getId() + " actualitzat";
			};
		}
		allGenericData.add(toSave);
		return toSave.getId() + " creat";
	}

	@Override
	public String remove(int id) {
		for (int i = 0; i < allGenericData.size(); i++) {
			if (allGenericData.get(i).getId() == id) {
				allGenericData.remove(i);
				return id + " eliminat";
			}
		}
		
		return id + " no eliminat";
	}

	

}
