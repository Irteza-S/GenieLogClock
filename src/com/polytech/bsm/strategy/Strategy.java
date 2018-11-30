package com.polytech.bsm.strategy;

import com.polytech.bsm.clock.FullTime;

public interface Strategy {
	
	// Method to get the time value, will depend of the strategy used
    public FullTime getTime();
}
