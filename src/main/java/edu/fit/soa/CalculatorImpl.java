package edu.fit.soa; /**
 * Created by tuantmtb on 3/14/17.
 */

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "edu.fit.soa.ICalculator")
public class CalculatorImpl implements ICalculator {

    public String getHelloWorldAsString(int a, int b) {
        return "Output:  " + (a + b);
    }

}