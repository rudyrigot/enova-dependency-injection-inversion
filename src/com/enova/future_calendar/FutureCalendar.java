package com.enova.future_calendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.enova.future_calendar.loggers.StdoutLogger;

public class FutureCalendar {
	
	private Calendar cal;
	private IFutureCalendarLogger logger;
	
	public FutureCalendar() {
		this.cal = Calendar.getInstance();
		this.logger = new StdoutLogger();
	}
	
	public void setLogger(IFutureCalendarLogger logger) {
		this.logger = logger;
	}

	public Calendar getTomorrow() {
		this.logger.log("Calendar.getTomorrow() called");
		this.cal.add(Calendar.DAY_OF_MONTH, 1);
		return cal;
	}

	public Calendar getInAMonth() {
		this.logger.log("Calendar.getTomorrow() called");
		this.cal.add(Calendar.MONTH, 1);
		return cal;
	}
	
	public static void main(String[] args) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		FutureCalendar futureCalendar = new FutureCalendar();

		futureCalendar.setLogger(new StdoutLogger());

		System.out.println(f.format(futureCalendar.getTomorrow().getTime()));
		System.out.println(f.format(futureCalendar.getInAMonth().getTime()));
	}

}
