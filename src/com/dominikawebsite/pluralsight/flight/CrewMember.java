package com.dominikawebsite.pluralsight.flight;

public class CrewMember {
//using enum types in classes
    private FlightCrewJob job;

    public CrewMember(FlightCrewJob job){
        this.job = job;
    }
    public void setJob(FlightCrewJob job){
        this.job = job;
    }
}
