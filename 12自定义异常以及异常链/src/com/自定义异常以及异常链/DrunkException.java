package com.自定义异常以及异常链;

@SuppressWarnings("serial")
public class DrunkException extends Exception{
	
	public DrunkException(){
		
	}
	
	public DrunkException(String message){
		super(message);
	}
	
}
