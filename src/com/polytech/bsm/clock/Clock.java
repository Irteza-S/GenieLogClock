package com.polytech.bsm.clock;

import com.polytech.bsm.observer.Observer;
import com.polytech.bsm.strategy.Strategy;
import com.polytech.bsm.subject.Subject;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;

public class Clock implements Subject, Runnable {

	// Attributes
    private LocalTime time;
    private TimeZone timeZone;
    private HashMap<String, Integer> timeMap = new HashMap<>();
    private ArrayList<Observer> observerList = new ArrayList<>();
    private Strategy strategy;

    // Constructors
    public Clock(Strategy strategy) {
    	this.strategy = strategy;
    	time = strategy.getTime();
        timeMap = new HashMap<>();
        observerList = new ArrayList<>();
    }

    // Getters and setters
    public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public HashMap<String, Integer> getTimeMap() {
		return timeMap;
	}
	public void setTimeMap(HashMap<String, Integer> timeMap) {
		this.timeMap = timeMap;
	}
	public ArrayList<Observer> getObserverList() {
		return observerList;
	}
	public void setObserverList(ArrayList<Observer> observerList) {
		this.observerList = observerList;
	}
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	// Manage observers
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }
    
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }
    
    public void notifyObservers() {
    	// To be sure we send the good time values
        updateTimeMap();

        for(Observer obs: observerList) {
            obs.update(timeMap);
        }
    }

    // Updating time with the appropriate strategy
    private void updateTimeMap() {
        time = strategy.getTime();
        
        timeMap.put("hours", time.getHour());
        timeMap.put("minutes", time.getMinute());
        timeMap.put("seconds", time.getSecond());
    }

    @Override
    public void run() {
    	
    	while(true) {
    		
    		notifyObservers(); 
    		
    		// Wait a second before notifying again
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }
}
