package com.company.WithStrategyPattern.Strategy;

import com.company.WithStrategyPattern.Strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("normal drive strategy");
    }
}
