package com.message_exchange;

import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

public class setGetName implements Callable
{
	 
	 String nmsg;

	@Override
	public String onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		
		
		 String msg=  eventContext.getMessageAsString();
		
        StringBuilder sb= new StringBuilder(msg);
		 
		 sb.replace(0, 7, "Malay");
		 
		 nmsg=sb.toString();
		 return nmsg;
		
	}

	

	
}
