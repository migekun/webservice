package asbaprin.ws.rest.data;

import java.util.Calendar;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

public class Dia {

	int diaMes;
	int mes;
	int any;
	
	public Dia() {
		Calendar now = Calendar.getInstance();
		diaMes = now.get(Calendar.DAY_OF_MONTH);
		mes = now.get(Calendar.MONTH) + 1;
		any = now.get(Calendar.YEAR);
	}

	public int getDiaMes() {
		return diaMes;
	}

	public void setDiaMes(int diaMes) {
		this.diaMes = diaMes;
	}
	
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}
	
	public JsonObjectBuilder getJson() {
		JsonObjectBuilder p1 = Json.createObjectBuilder();
		p1.add("dia", diaMes);
		p1.add("mes", mes);
		p1.add("any", any);
		return p1;
	}
	
}
