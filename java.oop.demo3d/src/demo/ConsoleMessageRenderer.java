package demo;

import interfaces.MessageProvider;
import interfaces.MessageRenderer;

public class ConsoleMessageRenderer implements MessageRenderer{
	private MessageProvider messageProvider;
	
	public ConsoleMessageRenderer(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	public void render() {
		System.out.println(String.format("Message: %s", messageProvider.getMessage()));
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
		
	}
	
	
}
