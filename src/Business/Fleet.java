/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.Date;
/**
 *
 * @author info
 */
public class Fleet {
    private String fleetId;
    private String airline;
    private String departureTime;
    private String source;
    private String destination;
    private Date flightDate;
    private int seatLeft;

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }
    
    
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
    
    public String getFleetId() {
        return fleetId;
    }

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeatLeft() {
        return seatLeft;
    }

    public void setSeatLeft(int seatLeft) {
        this.seatLeft = seatLeft;
    }
    
    @Override
    public String toString() {
        return this.getFleetId(); //To change body of generated methods, choose Tools | Templates.
    }
}
