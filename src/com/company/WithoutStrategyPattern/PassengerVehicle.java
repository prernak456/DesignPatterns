package com.company.WithoutStrategyPattern;

public class PassengerVehicle extends Vehicle{
    @Override
    public void drive(){

        //different drive logic
        System.out.println("This is the drive code of passenger vehicle");

    }
}
