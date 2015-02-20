package za.ac.cput.Chapter3Q2.AirlineImpl;

import za.ac.cput.Chapter3Q2.AirlineInterface;

public class AirlineInterfaceImpltwo implements AirlineInterface{
    @Override
    public String airlineDetails(String name, String location){
        return "Airline name: " + name + "\nAirline location: " + location + "\nEnjoy the rest of your day.";
    }

}
