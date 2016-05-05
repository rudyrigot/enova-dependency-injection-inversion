package com.enova.loggers;

public class StdoutLogger implements ILogger {

	@Override
	public void log(String s) {
		System.out.print("Log: ");
		System.out.println(s);
	}

}
