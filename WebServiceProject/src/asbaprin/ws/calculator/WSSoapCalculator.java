/**
 * WSSoapCalculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package asbaprin.ws.calculator;

public interface WSSoapCalculator extends java.rmi.Remote {
    public int sub(asbaprin.ws.calculator.Sub sub) throws java.rmi.RemoteException;
    public int mul(asbaprin.ws.calculator.Mul mul) throws java.rmi.RemoteException;
    public int div(asbaprin.ws.calculator.Div div) throws java.rmi.RemoteException;
    public int add(asbaprin.ws.calculator.Add add) throws java.rmi.RemoteException;
}
