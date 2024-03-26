package com.company.WithStrategyPattern;

import com.company.WithStrategyPattern.Strategy.DriveStrategy;
import com.company.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
