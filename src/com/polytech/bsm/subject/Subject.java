package com.polytech.bsm.subject;

import com.polytech.bsm.observer.Observer;

public interface Subject {
	
	// Method to attach an observer to the subject
    public void attachObserver(Observer observer);
	// Method to detach an observer to the subject
    public void detachObserver(Observer observer);
	// Method to notify observers to the subject
    public void notifyObservers();
}
