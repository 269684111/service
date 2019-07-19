package service;

import javax.jws.WebService;

@WebService
public class WebserviceImpl implements Webservice {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		String aString=name+"success";
		return aString;
	}

}
