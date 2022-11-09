package com.bootcamp.demo;

import javax.swing.JOptionPane;

public class MessageBoxRenderer extends MessageRenderer{
	public MessageBoxRenderer(String message) {
		super(message);
	}
	
	// Parent tells HOW?
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, getFormattedMessage());
	}
}
