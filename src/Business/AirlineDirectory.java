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
public class AirlineDirectory {
    
    private ArrayList<Airline> airlineDirectory;
    
    public AirlineDirectory(){
        airlineDirectory = new ArrayList<Airline>();
    }

    public ArrayList<Airline> getAirlineDirectory() {
        return airlineDirectory;
    }

    public void setAirlineDirectory(ArrayList<Airline> airlineDirectory) {
        this.airlineDirectory = airlineDirectory;
    }
    
    public Airline addAirline(){
        Airline newAirline = new Airline();
        airlineDirectory.add(newAirline);
        return newAirline;
    }
    
    public void deleteAirline(Airline airline){
        airlineDirectory.remove(airline);
    }
    
    public Airline searchAirline(String name){
        for(Airline airline : this.airlineDirectory){
            if(airline.getName().equalsIgnoreCase(name)){
                return airline;
            }
        }
        return null;
    }
}
