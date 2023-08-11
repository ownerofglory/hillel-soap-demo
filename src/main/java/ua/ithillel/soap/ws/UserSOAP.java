package ua.ithillel.soap.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import ua.ithillel.soap.model.User;
import ua.ithillel.soap.model.UserList;

import java.util.ArrayList;
import java.util.List;

@WebService(targetNamespace = "http://ithillel.ua/soap")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UserSOAP {
    private List<User> users = new ArrayList<>();

    @WebMethod
    public String addUser(@WebParam(name = "user") User user) {
        users.add(user);
        return "User successfully added";
    }

    @WebMethod
    public UserList getUsers() {
        return new UserList(users);
    }

}
