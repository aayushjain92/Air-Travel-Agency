/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author info
 */
public class Airline {
    private int airlineId;
    private String name;
    private String airlinePrefix;
    private int fleetCount;

    public int getFleetCount() {
        return fleetCount;
    }

    public void setFleetCount(int fleetCount) {
        this.fleetCount = fleetCount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlinePrefix() {
        return airlinePrefix;
    }

    public void setAirlinePrefix(String airlinePrefix) {
        this.airlinePrefix = airlinePrefix;
    }
    
    
    
    @Override
    public String toString() {
        return this.getName(); //To change body of generated methods, choose Tools | Templates.
    }
}
