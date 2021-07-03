package asbaprin.ws.calculator.client;

import java.rmi.RemoteException;

import asbaprin.ws.calculator.Add;
import asbaprin.ws.calculator.WSSoapCalculatorProxy;

public class CalculatorTest {

	public static void main(String[] args) {
		Add parametreAdd = new Add();
		parametreAdd.setIntA(2);
		parametreAdd.setIntB(43);
		
		WSSoapCalculatorProxy calculatorProxy = new WSSoapCalculatorProxy();
		try {
			int resultat = calculatorProxy.add(parametreAdd);
			
			System.out.println("El resultat de lasuma és: " + resultat);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
