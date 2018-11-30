package com.polytech.bsm.clock;

import com.polytech.bsm.observer.Observer;
import com.polytech.bsm.strategy.Strategy;
import com.polytech.bsm.subject.Subject;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Clock implements Subject, Runnable
{

    private LocalTime time;
    private HashMap<String, Integer> timeMap = new HashMap<>();
    private ArrayList<Observer> observerList = new ArrayList<>();
    private Strategy strategy;

    public Clock(Strategy strategy)
    {
    	this.time = LocalTime.now();
    	this.strategy = strategy;
        timeMap = new HashMap<>();
        observerList = new ArrayList<>();
    }

    public void attachObserver(Observer observer)
    {
        observerList.add(observer);
    }
    public void detachObserver(Observer observer)
    {
        observerList.remove(observer);
    }
    public void notifyObservers()
    {
        updateTimeMap();

        for(int i=0; i<observerList.size(); i++)
        {
            observerList.get(i).update(timeMap);
        }

    }

    private void updateTimeMap()
    {
        time = strategy.getTime();
        timeMap.put("hours", time.getHour());
        timeMap.put("minutes", time.getMinute());
        timeMap.put("seconds", time.getSecond());
    }

    public void run()
    {

    }
}
