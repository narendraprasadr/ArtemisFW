package com.keystone;
import java.lang.reflect.*;

public class Reflect {
	Class obj;
	public void ref()
	{
		//Class<Test> obj=Test.class; 
		//The below steps or the above commented one can be used for loading the class
		try {
			obj = Class.forName("com.keystone.Test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] mth=obj.getMethods();
		
		for(Method m:mth)
		{
			System.out.println(m.getName());
		}
		
	}
	public static void main(String[] args)
	{
		Reflect obj= new Reflect();
		obj.ref();
	}

}

/*output
	 First_Method
	second_Method
	wait
	wait
	wait
	equals
	toString
	hashCode
	getClass
	notify
	notifyAll*/

