package edu.fit.soa; /**
 * Created by tuantmtb on 3/14/17.
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = SOAPBinding.Use.LITERAL) //optional
public interface ICalculator {

    @WebMethod
    String getHelloWorldAsString(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

}