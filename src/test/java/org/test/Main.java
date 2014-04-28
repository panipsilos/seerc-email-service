package org.test;

import org.cloudservice.emailservice.mailgun.MailgunOperations;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MailgunOperations mop = new MailgunOperations();
		String response = mop.sendEmail("Ioannis Arampatzis <iarampatzis@gmail.com>", "iarampatzis@seerc.org", "Johny", "Geia sou re Johny");
		System.out.println(response);
	}

}
