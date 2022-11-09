package com.bootcamp.demo;

public class MessageRendererTest {

		public static void main(String[] args) {
/*			MessageRenderer messageRenderer = new MessageRenderer("Hello World");
			messageRenderer.render();
			
			messageRenderer.setMessage("Exit application");
			messageRenderer.render();
*/
			
			MessageConsoleRenderer mcr = new MessageConsoleRenderer("Console FTW!");
			mcr.render();
			
			MessageBoxRenderer mbr = new MessageBoxRenderer("Dialog FTW!");
			mbr.render();
		}
}
