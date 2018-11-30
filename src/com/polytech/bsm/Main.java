package com.polytech.bsm;

import com.polytech.bsm.clock.Clock;
import com.polytech.bsm.observer.DefaultView;

public class Main {

	public static void main(String[] args) {
		
		Clock clock = new Clock();
		DefaultView defView = new DefaultView();
		
		clock.attachObserver(defView);
		clock.notifyObservers();
	}

}
