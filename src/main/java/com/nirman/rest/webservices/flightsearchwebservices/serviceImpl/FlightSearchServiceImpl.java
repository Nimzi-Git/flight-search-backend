package com.nirman.rest.webservices.flightsearchwebservices.serviceImpl;

import com.nirman.rest.webservices.flightsearchwebservices.model.FlightDetails;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.FlightSearchServiceI;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Component
public class FlightSearchServiceImpl implements FlightSearchServiceI{
    private static String fromCity1 = "Luton";

    private static FlightDetails flight1 = new FlightDetails(fromCity1,"Paris", dateConvertion("30-04-2018")
                                    ,2,100,200.00);
    private static FlightDetails flight2 = new FlightDetails(fromCity1,"Berlin", dateConvertion("10-04-2018")
            ,2,100,200.00);
    private static FlightDetails flight3 = new FlightDetails(fromCity1,"Paris", dateConvertion("10-04-2018")
            ,2,100,200.00);
    private static FlightDetails flight4 = new FlightDetails(fromCity1,"Berlin", dateConvertion("01-05-2018")
            ,2,100,200.00);

    private static List<FlightDetails> flights = new LinkedList<>(Arrays.asList(flight1,flight2,flight3,flight4));

    public static List<FlightDetails> getFlights() {
        return flights;
    }

    public static void setFlights(List<FlightDetails> flights) {
        FlightSearchServiceImpl.flights = flights;
    }

    @Override
    public List<FlightDetails> getAllFlights() {
        return flights;
    }

    @Override
    public List<FlightDetails> searchedFlightDetails(String fromCity, String toCity, String dateVal) {
        List<FlightDetails> searchedFlightList = new LinkedList<>();
        LocalDate formattedDate = dateConvertion(dateVal);
        getTheFlight(fromCity, toCity, searchedFlightList, formattedDate);

        return searchedFlightList;
    }

    private void getTheFlight(String fromCity, String toCity, List<FlightDetails> searchedFlightList, LocalDate formattedDate) {
        Iterator iterator = flights.iterator();
        while (iterator.hasNext()){
            FlightDetails flightDetails = (FlightDetails) iterator.next();
            if((flightDetails.getFromCity().equals(fromCity))
                    &&(flightDetails.getToCity().equals(toCity))
                    &&(flightDetails.getTravelDate().isAfter(formattedDate))){
                searchedFlightList.add(flightDetails);
            }
        }
    }

    public void reduceAvailableSeats(String fromCity, String toCity, String dateVal, int bookedSeats){
        System.out.println("--"+fromCity+"--"+toCity+"--"+dateVal+"--"+bookedSeats);

        Iterator iterator = flights.iterator();
        LocalDate formattedDate = dateConvertion(dateVal);
        while (iterator.hasNext()){
            FlightDetails flightDetails = (FlightDetails) iterator.next();
            if((flightDetails.getFromCity().equals(fromCity))
                    &&(flightDetails.getToCity().equals(toCity))
                    &&(flightDetails.getTravelDate().isAfter(formattedDate))){
                flightDetails.setTotalFlightSeats(flightDetails.getTotalFlightSeats()-bookedSeats);
            }
        }
    }


    private static LocalDate dateConvertion(String dateVal){
        LocalDate formattedDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        formattedDate = LocalDate.parse(dateVal,formatter);

        return formattedDate;
    }

}
