package com.company.WithStrategyPattern.Strategy;

import com.company.WithStrategyPattern.Strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {

        //some drive logic
        System.out.println("sports drive strategy");
    }
}
