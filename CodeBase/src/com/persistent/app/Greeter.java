package com.persistent.app;

public class Greeter {
	
	String Name;
	
	public void Greeter(String Name)
	{
		this.Name = Name;
		
	}
	
	public String SayHello(String msg)
	{
		return msg;
	}
	
	public void GoodBye()
	{
	System.out.println("GoodBye" + this.Name);	
	}

}
