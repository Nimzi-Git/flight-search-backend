package com.nirman.rest.webservices.flightsearchwebservices.serviceImpl;

import com.nirman.rest.webservices.flightsearchwebservices.model.BookingDetails;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.StoreBookingDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class StoreBookingDetailsImpl implements StoreBookingDetails {
    private List<BookingDetails> completeBookingDetails = new LinkedList<>();
    @Override
    public ResponseEntity storeBookingDetails(BookingDetails bookingDetails) {
        completeBookingDetails.add(bookingDetails);
        return null;
    }

    public List<BookingDetails> getCompleteBookingDetails() {
        return completeBookingDetails;
    }
}
