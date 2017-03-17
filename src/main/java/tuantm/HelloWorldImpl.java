package tuantm; /**
 * Created by tuantmtb on 3/14/17.
 */

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "tuantm.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(int a, int b) {
        return "Output:  " + (a + b);
    }

}