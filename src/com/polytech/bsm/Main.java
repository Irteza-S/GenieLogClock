package com.polytech.bsm;

import com.polytech.bsm.clock.Clock;
import com.polytech.bsm.observer.DefaultView;
import com.polytech.bsm.strategy.StrategyPc;
import com.polytech.bsm.strategy.StrategyServer;

public class Main {

	public static void main(String[] args)
	{
		StrategyServer strat2 = new StrategyServer("time-a.nist.gov");
		System.out.println(strat2.getTime());
		System.out.println("ok");
		StrategyPc strat = new StrategyPc();
		Clock clock = new Clock(strat);
		DefaultView defView = new DefaultView();
		
		clock.attachObserver(defView);
		clock.notifyObservers();
		
		Thread thread = new Thread(clock);
		thread.start();
	}

}
