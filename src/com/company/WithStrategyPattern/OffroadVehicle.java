package com.company.WithStrategyPattern;

import com.company.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{
    OffroadVehicle(){
        super(new SportsDriveStrategy());
    }
}
