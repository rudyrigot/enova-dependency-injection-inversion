package com.enova.future_calendar.loggers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import com.enova.future_calendar.IFutureCalendarLogger;

public class FileLogger implements IFutureCalendarLogger {
	
	private PrintWriter writer;
	
	public FileLogger(String filePath, String encoding) throws FileNotFoundException, UnsupportedEncodingException{
		this.writer = new PrintWriter(filePath, encoding);
	}

	@Override
	public void log(String s) {
		this.writer.print("Log: ");
		this.writer.write(s);
		this.writer.print("\n");
		this.writer.flush();
	}

}
