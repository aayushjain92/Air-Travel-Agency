/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author info
 */
public class BookingDirectory {
    
    private ArrayList<Booking> bookingDirectory;
    
    public BookingDirectory(){
        bookingDirectory = new ArrayList<Booking>();
    }

    public ArrayList<Booking> getBookingDirectory() {
        return bookingDirectory;
    }

    public void setBookingDirectory(ArrayList<Booking> bookingDirectory) {
        this.bookingDirectory = bookingDirectory;
    }
    
    public Booking addBooking(){
        Booking newBooking = new Booking();
        bookingDirectory.add(newBooking);
        return newBooking;
    }
    
    public void deleteBooking(Booking booking){
        bookingDirectory.remove(booking);
    }
    
    public Booking searchBooking(String email){
    for(Booking booking : this.bookingDirectory){
        if(booking.getCustomerEmail().equalsIgnoreCase(email)){
            return booking;
        }
    }
    return null;
    }
    
    public Booking searchBookingbyFlightSeat(String flight, String seat){
    for(Booking booking : this.bookingDirectory){
        if(booking.getAircraftName().equalsIgnoreCase(flight) && 
                booking.getSeat().equalsIgnoreCase(seat)){
            return booking;
        }
    }
    return null;
    }
    
    public Booking searchBookingbyAirline(String airline){
    for(Booking booking : this.bookingDirectory){
        if(booking.getAirlineName().equalsIgnoreCase(airline) ){
            return booking;
        }
    }
    return null;
    }
}
