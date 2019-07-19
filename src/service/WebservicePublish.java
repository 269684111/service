package service;

import javax.xml.ws.Endpoint;

public class WebservicePublish {
public static void main(String args[]){
	//访问的URL地址
	String address="http://localhost:90/webservice";
	Endpoint.publish(address, new WebserviceImpl());
	System.out.println("service发布成功");
} 

}
