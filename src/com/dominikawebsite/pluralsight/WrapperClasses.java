package com.dominikawebsite.pluralsight;

import com.dominikawebsite.pluralsight.flight.Flight;
import com.dominikawebsite.pluralsight.flight.Passenger;

public class WrapperClasses {

    //capabilities and overhead of classes
    //hold primitive values
    //all wrapper class instances are immutable (just like Strings)
    Integer a = 100;
    int b = a;
    Integer c =b;
    Integer d = Integer.valueOf(200);
    int e = d.intValue();
    Integer f = Integer.valueOf(e);
    Float g = Float.valueOf(18.125f);
    float h = g.floatValue();
    char x = 'f';
    Character y = Character.valueOf(x);
    char z = y.charValue();

    //conversion between primitive types and Strings
    String s = "87.44";
    double s1 = Double.parseDouble(s);//it returns primitive type
    Double s2 = Double.valueOf(s);//it returns reference to Double wrapper class


    public static void main(String[] args) {
        //treating int as object
        Object[] stuffs = new Object[3];
        stuffs[0] = new Flight();
        stuffs[1] = new Passenger(0, 2);
        stuffs[2] = 100;
        Integer i1000A=10*10*10;
        Integer i1000B=10*100;
        if(i1000A ==i1000B)
            System.out.println("i1000A == i1000B");
        else
            System.out.println("i1000A != i1000B");

        if(i1000A.equals(i1000B))
            System.out.println("i1000A.equals(i1000B)");
        else
            System.out.println("i1000A.equals(i1000B)=false");

        Integer i8A=4*2;
        Integer i8B=2*2*2;
        if(i8A==i8B)
            System.out.println("i8A == i8B");
    }
    }
