package demo.providers;

import interfaces.MessageProvider;

public class DefaultMessageProvider implements MessageProvider {
	public String getMessage() {
		return "Hello World";
	}
}
