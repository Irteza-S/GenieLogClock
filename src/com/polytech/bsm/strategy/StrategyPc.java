package com.polytech.bsm.strategy;

import java.time.LocalTime;
import java.util.TimeZone;

import com.polytech.bsm.clock.FullTime;

public class StrategyPc implements Strategy {
	
	public FullTime getTime() {

		FullTime fullTime = new FullTime(LocalTime.now(), TimeZone.getDefault());
		return fullTime;
    }
}
