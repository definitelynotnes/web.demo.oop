package com.bootcamp.demo;

import static com.bootcamp.demo.util.StringValidator.isNullOrEmpty;;

//import javax.swing.JOptionPane;

// NOTE: YOU CANNOT DEFINE CLASS AS AN ABSTRACT AND FINAL AT THE SAME TIME!
// final means there will be no inheritance while abstract promotes inheritance
// abstraction is a template that is overriden by children classes
public abstract class MessageRenderer {
	private String message;
	
	public MessageRenderer(String message) {
		this.message = message;
	}
	
	/*public void render() { pop up dialog box
		JOptionPane.showMessageDialog(null, message);
	}*/
	
	// The parent tells WHAT
	public abstract void render(); /* {
		System.out.println(String.format("Message: %s", message));
	} */

	public String getMessage() {
		return message;
	}

	public String getFormattedMessage() {
		if (isNullOrEmpty(getMessage())) {
			return "No message set.";
		}
		return String.format("Message: %s", getMessage());
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
