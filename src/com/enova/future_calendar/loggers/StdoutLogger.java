package com.enova.future_calendar.loggers;

import com.enova.future_calendar.IFutureCalendarLogger;

public class StdoutLogger implements IFutureCalendarLogger {

	@Override
	public void log(String s) {
		System.out.print("Log: ");
		System.out.println(s);
	}

}
