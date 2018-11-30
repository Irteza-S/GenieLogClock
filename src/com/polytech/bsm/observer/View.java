package com.polytech.bsm.observer;

import java.util.HashMap;
import java.util.TimeZone;

public abstract class View implements Observer {
	
	// Attributes
	protected Integer hours, minutes, seconds;
	protected TimeZone timeZone;
	
	// Constructors
	public View() {
		hours = 0;
		minutes = 0;
		seconds = 0;
		timeZone = TimeZone.getDefault();
	}
	
	// Getters and setters
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
	public Integer getSeconds() {
		return seconds;
	}
	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}
	public TimeZone getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	// Implementing the update from Observer interface
	public void update(HashMap<String, Integer> timeMap, TimeZone timeZone) {
		this.hours = timeMap.get("hours");
		this.minutes = timeMap.get("minutes");
		this.seconds = timeMap.get("seconds");
		
		this.timeZone = timeZone;
	}
	
	// Displaying default time
	public void display() {	
		System.out.println(hours + "h" + minutes + "min" + seconds + "s" + " " + timeZone.getID());
	}
}
