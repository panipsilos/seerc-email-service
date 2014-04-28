package org.cloudservice.emailservice.mailgun;

import java.util.HashMap;
import java.util.Map;

import org.cloudservice.utils.Http;
import org.cloudservice.utils.RequestMethod;

public class MailgunOperations {
	
	Map<String, String> requestData;
	
	Http http;
	
	String response;

	public String sendEmail(String from, String to, String subject, String text) {

		requestData = new HashMap<String, String>();
		
		requestData.put("from", from);
		requestData.put("to", to);
		requestData.put("subject", subject);
		requestData.put("text", text);
		
		http = new Http("api", "key-99757yh3icy8j3sq96wrmf-epa8v9e24");
		response = http.httpRequest(RequestMethod.POST, "https://api.mailgun.net/v2/sandboxe3eec0dbe1474b76a284a9da57e0dee1.mailgun.org/messages", null, requestData);
		
		return response ;
	}

}
