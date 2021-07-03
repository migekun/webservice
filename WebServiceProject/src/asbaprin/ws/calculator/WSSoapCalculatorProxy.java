package asbaprin.ws.calculator;

public class WSSoapCalculatorProxy implements asbaprin.ws.calculator.WSSoapCalculator {
  private String _endpoint = null;
  private asbaprin.ws.calculator.WSSoapCalculator wSSoapCalculator = null;
  
  public WSSoapCalculatorProxy() {
    _initWSSoapCalculatorProxy();
  }
  
  public WSSoapCalculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSSoapCalculatorProxy();
  }
  
  private void _initWSSoapCalculatorProxy() {
    try {
      wSSoapCalculator = (new asbaprin.ws.calculator.WSSoapCalculatorImplServiceLocator()).getWSSoapCalculatorImplPort();
      if (wSSoapCalculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSSoapCalculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSSoapCalculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSSoapCalculator != null)
      ((javax.xml.rpc.Stub)wSSoapCalculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public asbaprin.ws.calculator.WSSoapCalculator getWSSoapCalculator() {
    if (wSSoapCalculator == null)
      _initWSSoapCalculatorProxy();
    return wSSoapCalculator;
  }
  
  public int sub(asbaprin.ws.calculator.Sub sub) throws java.rmi.RemoteException{
    if (wSSoapCalculator == null)
      _initWSSoapCalculatorProxy();
    return wSSoapCalculator.sub(sub);
  }
  
  public int mul(asbaprin.ws.calculator.Mul mul) throws java.rmi.RemoteException{
    if (wSSoapCalculator == null)
      _initWSSoapCalculatorProxy();
    return wSSoapCalculator.mul(mul);
  }
  
  public int div(asbaprin.ws.calculator.Div div) throws java.rmi.RemoteException{
    if (wSSoapCalculator == null)
      _initWSSoapCalculatorProxy();
    return wSSoapCalculator.div(div);
  }
  
  public int add(asbaprin.ws.calculator.Add add) throws java.rmi.RemoteException{
    if (wSSoapCalculator == null)
      _initWSSoapCalculatorProxy();
    return wSSoapCalculator.add(add);
  }
  
  
}