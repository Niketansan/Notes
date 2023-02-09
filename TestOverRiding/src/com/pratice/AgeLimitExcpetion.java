package com.pratice;

public class AgeLimitExcpetion extends RuntimeException {  
	
	
	/*extends  Exception class then come under checked exception
	extends RunExcpetionClass then it come under uncehcked excetpion*/

	String msg;

	AgeLimitExcpetion(String msg) {
		this.msg = msg;
        System.out.println(msg);
	}

}
