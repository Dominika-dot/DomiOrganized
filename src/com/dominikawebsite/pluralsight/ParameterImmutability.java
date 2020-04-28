package com.dominikawebsite.pluralsight;

public class ParameterImmutability {
    int flightNumber;
    int getFlightNumber(){return flightNumber;}
    void setFlightNumber(int flightNumber){this.flightNumber=flightNumber;}

    ParameterImmutability(){}
    ParameterImmutability(int flightNumber){this.flightNumber=flightNumber;}
    //passing by-value (copy of the actual value) to a method
    void swap (int i, int j){
        int k = i;
        i=j;
        j=k;
        System.out.println("i = "+i+"\nj = "+j);
    }
    //passing reference to an object to a method
    static void swapObjects(ParameterImmutability i, ParameterImmutability j){
        ParameterImmutability k = i;
        i=j;
        j=k;
        System.out.println("i = "+i.flightNumber+"\nj = "+j.flightNumber);
    }
    void swapNumbers(ParameterImmutability i, ParameterImmutability j){
        int k =i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println("i = "+i.flightNumber+"\nj = "+j.flightNumber);
    }

    public static void main(String[] args) {
        int val1=10;
        int val2=20;
        ParameterImmutability parameterImmutability = new ParameterImmutability();
        parameterImmutability.swap(val1,val2);//i and j (method parameters will be changed)
        //but val1 and val2 will not change, because their values are copied to i and j
        // i an j don't have any reference to val1 and val2 values
        System.out.println("val1 = "+val1+"\nval2 = "+val2);
        ParameterImmutability valObj1 = new ParameterImmutability(10);
        ParameterImmutability valObj2 = new ParameterImmutability(20);
        ParameterImmutability.swapObjects(valObj1, valObj2);
        System.out.println("val1 = "+valObj1.flightNumber+"\nval2 = "+valObj2.flightNumber);
    }
}
