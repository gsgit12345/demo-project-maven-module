package com.demo.project.runner;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class wsdltojavarunner {

    public static void main(String str[]) throws MalformedURLException {
       final String endpoint="https://www.dataaccess.com/webservicesserver/numberconversion.wso";
       final NumberConversion  conversion=new NumberConversion();
       final NumberConversionSoapType port=conversion.getPort(NumberConversionSoapType.class);
       final URL url= URI.create(endpoint).toURL();
       final ObjectFactory factory=new ObjectFactory() ;
     System.out.println("number to doller "+ port.numberToDollars(BigDecimal.valueOf(15.99)));
        System.out.println("number to integer "+ port.numberToWords(BigInteger.valueOf(34)));


    }
}
