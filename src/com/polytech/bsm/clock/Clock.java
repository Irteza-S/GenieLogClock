package com.polytech.bsm.clock;

import com.polytech.bsm.observer.Observer;
import com.polytech.bsm.strategy.Strategy;
import com.polytech.bsm.subject.Subject;

import java.util.ArrayList;
import java.util.HashMap;

public class Clock implements Subject, Runnable {

	// Attributes
    private FullTime time;
    private HashMap<String, Integer> timeMap = new HashMap<>();
    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    private Strategy strategy;

    // Constructors
    public Clock(Strategy strategy) {
    	this.strategy = strategy;
    	this.time = strategy.getTime();
        timeMap = new HashMap<>();
        observerList = new ArrayList<Observer>();
    }

    // Managing observers
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }
    
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }
    
    public void notifyObservers()  {
    	// To be sure to send the right time values
        updateTimeMap();

        for(Observer obs : observerList)  {
            obs.update(timeMap, time.getTimeZone());
        }
    }

    // Updating time with the appropriate strategy
    private void updateTimeMap() {
        time = strategy.getTime();
        timeMap.put("hours", time.getLocalTime().getHour());
        timeMap.put("minutes", time.getLocalTime().getMinute());
        timeMap.put("seconds", time.getLocalTime().getSecond());
    }

    // What the thread will do
    public void run() {
    	
    	while(true) {
    		
    		notifyObservers();
    		System.out.println();
    		
    		// Wait a second before notifying again
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }
}
