package com.message_exchange;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class setGetMessage implements Callable
{
	String message;
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		
		message=eventContext.getMessageAsString();
		
		
		return message;
	}



}
