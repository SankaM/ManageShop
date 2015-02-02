package com.monda.manageshop;

import com.opensymphony.xwork2.ActionSupport;

class MyAction extends ActionSupport{
   public static String GOOD = SUCCESS;
   public static String BAD = ERROR;
}

public class RetailsAction extends ActionSupport {
	private String name;
	
	public String execute() throws Exception {
		
		if ("SECRET".equals(name))
		{
		return MyAction.GOOD;
		}else{
		return MyAction.BAD; 
		}
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}

}

