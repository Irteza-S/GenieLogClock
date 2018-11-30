package com.polytech.bsm.clock;

import com.polytech.bsm.observer.Observer;
import com.polytech.bsm.subject.Subject;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Clock implements Subject
{

    private LocalTime time;
    private HashMap<String, Integer> timeMap = new HashMap<>();
    private ArrayList<Observer> observerList = new ArrayList<>();


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
    	
        for(int i=0; i<observerList.size(); i++)
        {
            observerList.get(i).notify();
        }

    }


}
