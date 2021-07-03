/**
 * WSSoapCalculatorImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package asbaprin.ws.calculator;

public class WSSoapCalculatorImplServiceLocator extends org.apache.axis.client.Service implements asbaprin.ws.calculator.WSSoapCalculatorImplService {

    public WSSoapCalculatorImplServiceLocator() {
    }


    public WSSoapCalculatorImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSSoapCalculatorImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSSoapCalculatorImplPort
    private java.lang.String WSSoapCalculatorImplPort_address = "http://localhost:8080/CalculatorSoap/WSSoapCalculatorImplService";

    public java.lang.String getWSSoapCalculatorImplPortAddress() {
        return WSSoapCalculatorImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSSoapCalculatorImplPortWSDDServiceName = "WSSoapCalculatorImplPort";

    public java.lang.String getWSSoapCalculatorImplPortWSDDServiceName() {
        return WSSoapCalculatorImplPortWSDDServiceName;
    }

    public void setWSSoapCalculatorImplPortWSDDServiceName(java.lang.String name) {
        WSSoapCalculatorImplPortWSDDServiceName = name;
    }

    public asbaprin.ws.calculator.WSSoapCalculator getWSSoapCalculatorImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSSoapCalculatorImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSSoapCalculatorImplPort(endpoint);
    }

    public asbaprin.ws.calculator.WSSoapCalculator getWSSoapCalculatorImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            asbaprin.ws.calculator.WSSoapCalculatorImplPortBindingStub _stub = new asbaprin.ws.calculator.WSSoapCalculatorImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWSSoapCalculatorImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSSoapCalculatorImplPortEndpointAddress(java.lang.String address) {
        WSSoapCalculatorImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (asbaprin.ws.calculator.WSSoapCalculator.class.isAssignableFrom(serviceEndpointInterface)) {
                asbaprin.ws.calculator.WSSoapCalculatorImplPortBindingStub _stub = new asbaprin.ws.calculator.WSSoapCalculatorImplPortBindingStub(new java.net.URL(WSSoapCalculatorImplPort_address), this);
                _stub.setPortName(getWSSoapCalculatorImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSSoapCalculatorImplPort".equals(inputPortName)) {
            return getWSSoapCalculatorImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://calculator.ws.asbaprin/", "WSSoapCalculatorImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://calculator.ws.asbaprin/", "WSSoapCalculatorImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSSoapCalculatorImplPort".equals(portName)) {
            setWSSoapCalculatorImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
