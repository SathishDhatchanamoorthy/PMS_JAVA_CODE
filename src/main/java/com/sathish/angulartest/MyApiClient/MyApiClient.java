package com.sathish.angulartest.MyApiClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyApiClient {
	
	 	@Value("${target.application.ip}")
	    private String targetIpAddress;
	 
	 	@Value("${target.application.port}")
	    private int targetPort;

}
