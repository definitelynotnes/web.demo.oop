package com.bootcamp.demo;

public class MessageConsoleRenderer extends MessageRenderer {
	public MessageConsoleRenderer(String message) {
		super(message);
	}
	
	@Override
	public void render() {
		System.out.println(getFormattedMessage());
	}
}
