package com.polytech.bsm.strategy;

import java.time.LocalTime;

public class StrategyPc implements Strategy {
    
	// TODO
	public LocalTime getTime() {
        return LocalTime.now();
    }
}
