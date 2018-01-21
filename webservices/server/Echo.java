package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface Echo {

    @WebResult(name = "echoResponse")
    @WebMethod(operationName = "reply")
    String reply(@WebParam(name = "msg") String msg);

    @WebResult(name = "addResponse")
    @WebMethod(operationName = "add")
    int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b);
}
