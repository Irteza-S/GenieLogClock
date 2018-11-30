package com.polytech.bsm.observer;

import java.util.HashMap;

public abstract class View implements Observer {
	
	// Attributes
	private Integer hours, minutes, seconds;
	
	// Constructors
	public View() {
		hours = 0;
		minutes = 0;
		seconds = 0;
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

	// Implementing the update from Observer interface
	public void update(HashMap<String, Integer> timeMap) {
		this.hours = timeMap.get("hours");
		this.minutes = timeMap.get("minutes");
		this.seconds = timeMap.get("seconds");
		
		display();
	}
	
	// Displaying default time
	public void display() {	
		System.out.println(hours + "h" + minutes + "min" + seconds + "s");
	}
}
