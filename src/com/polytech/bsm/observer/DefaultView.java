package com.polytech.bsm.observer;

import java.util.HashMap;
import java.util.TimeZone;

public class DefaultView extends View {

	// Using methods as declared in the abstract class View
	public DefaultView() {
		super();
	}
	
	@Override
	public void update(HashMap<String, Integer> timeMap, TimeZone timeZone) {
		super.update(timeMap, timeZone);
		super.display();
	}
}
