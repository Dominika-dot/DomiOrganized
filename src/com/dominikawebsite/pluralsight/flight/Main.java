package com.dominikawebsite.pluralsight.flight;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Flight f = new Flight();
        Passenger p1 = new Passenger(0,1);
        Passenger p2 = new Passenger(0,2);
        f.add1Passenger();//bez parametrów
        f.add1Passenger(2); //int bags
        f.add1Passenger(p2); //Passenger p
        short threeBags = 3; // no overload that accepts the short
        // system knows how to convert short to int, so it will bw int bags, int carryOns
        f.add1Passenger(threeBags,3); //int bags, int carryOns
        f.add1Passenger(p2,1); //Passenger p, int carryOns

        Passenger janet = new Passenger (0,1);
        Passenger john = new Passenger (0,2);
        f.addPassengers(new Passenger[]{janet,john});
        Passenger fred = new Passenger(0,2);
        Passenger sarah = new Passenger(0,2);
        Passenger susie = new Passenger(0,0);
        f.addPassengers(fred,sarah,susie);
        f.addPassengers(); // mozna tez z pusta lista, ale to nic nie zmieni

        //inheritance exercises
        Flight f1 = new Flight();
        System.out.println(f1.getSeats());// seats = 150
        CargoFlight cf = new CargoFlight();
        System.out.println(cf.getSeats());// seats = 12
        Flight f2 = new CargoFlight();
        System.out.println(f2.getSeats());// seats = 150
        f2.add1Passenger();
        cf.add1Passenger();
//inheritance - object class || All classes inherit from Object class ||  \\
        Object []stuff = new Object[3];
        stuff[0]=new Flight();
        stuff[1]=new Passenger(0,2);
        stuff[2]=new CargoFlight();
        //stuff[2].add1Package(1,2,3); not possible
        CargoFlight stuff2 = (CargoFlight)stuff[2];
        stuff2.add1Package(1,2,3);
        //equals method and "super"

    }
}
