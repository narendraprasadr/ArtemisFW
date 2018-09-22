package com.keystone;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTesty {
	
	public void get_Request()
	{
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";		
			
		RequestSpecification httpRequest = RestAssured.given();
		
		Response respones=httpRequest.request(Method.GET, "/Bangalore", null);
		
		System.out.println(respones.body());
		
		
	}
	
	/*public static void main(String[] args)
	{
		SimpleGetTesty get = new SimpleGetTesty();
		get.get_Request();
	}*/

}
