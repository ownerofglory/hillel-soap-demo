package ua.ithillel.soap.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://ithillel.ua/soap")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloSoap {
    @WebMethod
    public String hello(String name) {
        return "Hello " +  name;
    }
}
