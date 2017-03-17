package tuantm;

/**
 * Created by tuantmtb on 3/14/17.
 */

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://tuantm/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString(6, 7));

    }
}
