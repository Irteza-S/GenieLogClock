package com.polytech.bsm.observer;

import java.util.HashMap;
import java.util.TimeZone;

public class ViewHoursMinutes extends View {
	
	public void update(HashMap<String, Integer> timeMap, TimeZone timeZone) {
		
		super.update(timeMap, timeZone);
		
		if (seconds % 5 == 0) {
			display();
		}
	}
	
	public void display() {
		if (minutes <= 9) {
			System.out.println("Temps actuel : " + hours + ":0" + minutes);
		} else {			
			System.out.println("Temps actuel : " + hours + ":" + minutes);
		}
	}
}
