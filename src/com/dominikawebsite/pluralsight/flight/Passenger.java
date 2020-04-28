package com.dominikawebsite.pluralsight.flight;
public class Passenger{

    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public int getCheckedBags(){return checkedBags;}

    public Passenger (){ }
    public Passenger(int freeBags){
        this(freeBags>1?25.0d:50.0d); //make a call to perBagFee and calculate that
        this.freeBags=freeBags;
    }
    public Passenger (int freeBags, int checkedBags){
        //this.freeBags = freeBags;
        this(freeBags);//call to the another constructor must be the first line
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee){ //private, it cant be called from the outside
        this.perBagFee=perBagFee; //per bag fee to a passenger
    }


}

