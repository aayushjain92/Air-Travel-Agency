/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kesha
 */
public class TravelAgencyMain {

    private AirlineDirectory airlineDir;
    private BookingDirectory bookingDir;
    private CustomerDirectory customerDir;
    private FleetDirectory fleetDir;
    
     public TravelAgencyMain()
     {
         airlineDir = new AirlineDirectory();
         bookingDir = new BookingDirectory();
         customerDir = new CustomerDirectory();
         fleetDir = new FleetDirectory();
     }

    public FleetDirectory getFleetDir() {
        return fleetDir;
    }

    public void setFleetDir(FleetDirectory fleetDir) {
        this.fleetDir = fleetDir;
    }

    public AirlineDirectory getAirlineDir() {
        return airlineDir;
    }

    public void setAirlineDir(AirlineDirectory airlineDir) {
        this.airlineDir = airlineDir;
    }

    public BookingDirectory getBookingDir() {
        return bookingDir;
    }

    public void setBookingDir(BookingDirectory bookingDir) {
        this.bookingDir = bookingDir;
    }

    public CustomerDirectory getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDirectory customerDir) {
        this.customerDir = customerDir;
    }
     
     
}
