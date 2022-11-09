package demo.providers;

import interfaces.MessageProvider;

public class FileMessageProvider implements MessageProvider{

	@Override
	public String getMessage() {
		// logic to read a file
		return "This is from a file";
	}

}
