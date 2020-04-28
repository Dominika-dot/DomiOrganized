package com.dominikawebsite.pluralsight.flight;

import java.sql.SQLOutput;

public class CargoFlight extends Flight{
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    int seats = 12;

    public CargoFlight(int flightNumber){
    super(flightNumber); //calling the constructor from Flight class
    }
    public CargoFlight(int flightNumber, float maxCargoSpace){
        this(flightNumber); //calling constructor from CargoFlight (this) class
        this.maxCargoSpace = maxCargoSpace;
    }
    public CargoFlight(){ }
    public CargoFlight(float maxCargoSpace){
        this.maxCargoSpace = maxCargoSpace; //this calls base no-parameter Flight constructor
        //derived class must always call one of the base class constructors
        //by default base class' no-argument constructor is called
    }

    @Override
    public int getSeats(){return 12;}

    public final void add1Package(float h, float w, float d){ //final means that you cannot override this method
        double size = h*w*d;
        if(hasCargoSpace((float) size))
            usedCargoSpace+=size;
        else
            handleNoSpace();
    }

    private boolean hasCargoSpace(float size){
        return usedCargoSpace+size<=maxCargoSpace;
    }
    private void handleNoSpace(){
        System.out.println("Not enough space");
    }
}
