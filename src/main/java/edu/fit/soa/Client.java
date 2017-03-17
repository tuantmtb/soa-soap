package edu.fit.soa;

/**
 * Created by tuantmtb on 3/14/17.
 */

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/calculator?wsdl");
        QName qname = new QName("http://soa.fit.edu/", "CalculatorImplService");

        Service service = Service.create(url, qname);

        ICalculator hello = service.getPort(ICalculator.class);

        System.out.println(hello.getHelloWorldAsString(6, 7));

    }
}
