package com.polytech.bsm.clock;

import java.time.LocalTime;
import java.util.TimeZone;

public class FullTime {

	// Attributes
	private LocalTime localTime;
	private TimeZone timeZone;
	
	// Constructors
	public FullTime (LocalTime localTime, TimeZone timeZone) {
		this.localTime = localTime;
		this.timeZone = timeZone;
	}

	// Getters and setters
	public LocalTime getLocalTime() {
		return localTime;
	}
	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}
	public TimeZone getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}
	
}
