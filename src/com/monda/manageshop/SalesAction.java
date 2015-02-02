package com.monda.manageshop;
import com.monda.manageshop.MyAction;
import com.opensymphony.xwork2.ActionSupport;

public class SalesAction extends ActionSupport{
	
private String name;

public String getName(){
	
	return name;
}

public void setName(String name) {
	
	this.name = name;
}

public String execute()
{
   return MyAction.GOOD;
}

}