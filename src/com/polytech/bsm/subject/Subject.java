package com.polytech.bsm.subject;

import com.polytech.bsm.observer.Observer;

public interface Subject
{
    public void attachObserver(Observer observer);
    public void detachObserver(Observer observer);
    public void notifyObservers();
}
