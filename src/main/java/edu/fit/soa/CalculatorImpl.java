package edu.fit.soa; /**
 * Created by tuantmtb on 3/14/17.
 */

import javax.jws.WebParam;
import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "edu.fit.soa.ICalculator")
public class CalculatorImpl implements ICalculator {

    public String getHelloWorldAsString(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {


        System.out.println(a + " " + b);
        return "Output:  " + (a + b);
    }

}