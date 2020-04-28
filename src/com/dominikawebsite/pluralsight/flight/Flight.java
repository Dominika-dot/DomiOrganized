package com.dominikawebsite.pluralsight.flight;

public class Flight {

    //private fields (cannot get or set them from outside the class)
    private int passengers, seats=150, flightNumber;
    private char flightClass;
    private boolean [] isSeatAvailable;//initially it is set to false, but we want true
    int totalCheckedBags;
    int maxCarryOns = seats * 2, totalCarryOns;

    //INITIALIZATION BLOCK - shared across all constructors
    //executed as if the code were placed at the start of each constructor {} - in brackets
    {
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }

    //public constructor (empty)
    public Flight(){
     //   seats = 150; //not necessary because we can set seats to 150 in declaration
     //   passengers = 0; //not necessary because all numeric values are set to null
        //isSeatAvailable = new boolean[seats]; we could put it in this no parameter constructor
        //we could also use initialization blocks for that
        //for (int i =0; i<seats; i++){
        //    isSeatAvailable[i]=true;}
    }

    public Flight(int flightNumber){this.flightNumber=flightNumber;}

    //method
    public void add1Passenger(){
        if (hasSeating())//(passengers<seats) - we've created a new method hasSeating
            passengers+=1;
        else
            handleTooMany();
    }
    //overloaded add1Passenger method
    public void add1Passenger(int bags){
        if(hasSeating()){
            add1Passenger(); //call existing add1Passenger method
            totalCheckedBags+=bags;
        }
    }

    public void add1Passenger(int bags, int carryOns){
        if(hasSeating() && hasCarryOnSpace(carryOns)){
            add1Passenger(bags);
            totalCarryOns+=carryOns;
        }
    }

    public void add1Passenger(Passenger p, int carryOns){add1Passenger(p.getCheckedBags(),carryOns);}

    public void add1Passenger(Passenger p){
        add1Passenger(p.getCheckedBags());
    }

    boolean hasSeating(){return passengers<seats;}

    boolean hasCarryOnSpace(int carryOns){ //maximum carry ons eq 2* seats
        return totalCarryOns + carryOns <= maxCarryOns;
    }

    private void handleTooMany(){
        System.out.println("Too many");
    }

    private boolean hasSeating (int count){return passengers +count<=seats;}

    public void addPassengers(Passenger...list){
        if (hasSeating(list.length)) {
            passengers+=list.length;
            for (Passenger passenger:list)
                totalCheckedBags=passenger.getCheckedBags();
        }
        else handleTooMany();
    }

    public boolean hasRoom(Flight f2){
        int total = this.passengers + f2.passengers;
        System.out.println("hasRoom method: "+total);
        return total<=seats;
        /* instead of:
        if(total <= seats
        return true:
        else
         return false;         */
    }

    public Flight createNewWithBoth (Flight f2){
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        System.out.println("createNewWithBoth: "+newFlight.passengers+" "+newFlight.seats);
        return newFlight;
    }

    public void creatingNewFlight(){
        //udawanie metody main
        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        lax1.passengers = 30;
        lax2.passengers = 85;
        Flight lax3; //creating a reference to an object
        if (lax1.hasRoom(lax2)){ //lax1 w metodzie hasRoom to "seats" i "passengers"
            // metoda hasRoom jest wywołana na instancji lax1
            // lax2 jest podane jako parametr wiec w naszym przypadku to f2.passengers
            lax3 = lax1.createNewWithBoth(lax2);
            //metoda createNewWithBoth zwraca nowa instancje Flight (obiekt) z lax1 i lax2
            //referencje juz wczesnej stworzylismy
        }
    }

    void anotherCalls(){
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        flight2.add1Passenger();
        System.out.println(flight2.passengers); // 1 passenger
        // not possible to get variables from outside the class (were inside now)
        flight2=flight1;
        /*if I assign flight1 to flight2 that doesn't copy the entire object pointed to
        flight1 and flight2, all that does is reassigned the reference. flight2 points to the same object
        as flight1
         */
        System.out.println(flight2.passengers); // 0 passengers
        flight1.add1Passenger();
        flight1.add1Passenger();
        System.out.println(flight2.passengers); // 2 passengers in flight1 and flight2
    }

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
    }
}