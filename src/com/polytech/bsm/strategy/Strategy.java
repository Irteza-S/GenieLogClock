package com.polytech.bsm.strategy;

import java.time.LocalTime;

public interface Strategy {
	
	// Method to get the time value, will depend of the strategy used
    public LocalTime getTime();
}
