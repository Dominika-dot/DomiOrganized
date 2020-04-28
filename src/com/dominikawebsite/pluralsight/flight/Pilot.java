package com.dominikawebsite.pluralsight.flight;

public abstract class Pilot { // abstract class because it has at least one abstract method
    private Flight currentFlight;
    public void fly(Flight f){
        if(canAccept(f))
            currentFlight=f;
        else
            handleCantAccept();
    }
    public abstract boolean canAccept(Flight f); //we dont implement this class, so it has no method body

    private void handleCantAccept(){
        System.out.println("Can't accept");
    }
}
