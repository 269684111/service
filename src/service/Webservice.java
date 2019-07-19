package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Webservice {
@WebMethod
String sayHello(String name);

}
