package com.monda.manageshop;

import com.opensymphony.xwork2.ActionSupport;

public class ProfitAction extends ActionSupport{
	
	private String name;
	
	public String execute() throws Exception {
		
	    System.out.println("Inside action....");
	    return "success";
	} 
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
}