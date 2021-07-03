/**
 * Mul.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package asbaprin.ws.calculator;

public class Mul  implements java.io.Serializable {
    private int intA;

    private int intB;

    public Mul() {
    }

    public Mul(
           int intA,
           int intB) {
           this.intA = intA;
           this.intB = intB;
    }


    /**
     * Gets the intA value for this Mul.
     * 
     * @return intA
     */
    public int getIntA() {
        return intA;
    }


    /**
     * Sets the intA value for this Mul.
     * 
     * @param intA
     */
    public void setIntA(int intA) {
        this.intA = intA;
    }


    /**
     * Gets the intB value for this Mul.
     * 
     * @return intB
     */
    public int getIntB() {
        return intB;
    }


    /**
     * Sets the intB value for this Mul.
     * 
     * @param intB
     */
    public void setIntB(int intB) {
        this.intB = intB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mul)) return false;
        Mul other = (Mul) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.intA == other.getIntA() &&
            this.intB == other.getIntB();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getIntA();
        _hashCode += getIntB();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mul.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://calculator.ws.asbaprin/", "mul"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
