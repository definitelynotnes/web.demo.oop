package demo;

import demo.providers.DefaultMessageProvider;

public class MessageTest {
	public static void main(String[] args) {
		DefaultMessageProvider messageProvider = new DefaultMessageProvider();
		ConsoleMessageRenderer messageRenderer = new ConsoleMessageRenderer(messageProvider);
		messageRenderer.render();
	}
}
