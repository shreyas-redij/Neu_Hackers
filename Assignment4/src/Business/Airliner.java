/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class Airliner {
    
    private String airlinerName;
    private String airlinerHeadquaters;
    private int airlinerFleetSize;
    public ArrayList<Flight> flightList; 
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirlinerHeadquaters() {
        return airlinerHeadquaters;
    }

    public void setAirlinerHeadquaters(String airlinerHeadquaters) {
        this.airlinerHeadquaters = airlinerHeadquaters;
    }

    public int getAirlinerFleetSize() {
        return airlinerFleetSize;
    }

    public void setAirlinerFleetSize(int airlinerFleetSize) {
        this.airlinerFleetSize = airlinerFleetSize;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public void deleteFlight(Flight flight) {
        flightList.remove(flight);
    }
     
     
    @Override
    public String toString() {
        return airlinerName;
    }
    
    
    public Airliner(String airlinerName, String airlinerHeadquaters)
    {
       flightList = new ArrayList<Flight>();
       this.airlinerName = airlinerName;
       this.airlinerHeadquaters = airlinerHeadquaters;
       
       Flight flight1 = new Flight("Jet Blue","EM-1283", "DUBAI", "BOSTON", "20:00", "23:00", 450, 25);
       Flight flight2 = new Flight("Air India","Q-328", "MUMBAI", "BOSTON", "08:00", "23:00", 650, 250);
       Flight flight3 = new Flight("Air India","J-3243", "DOHA", "NEWYORK", "10:00", "20:00", 500, 150);
       Flight flight4 = new Flight("Air India","BA-233", "DUBAI", "CHICAGO", "06:00", "04:00", 450, 200);
       Flight flight5 = new Flight("Air India","AI-3242", "DELHI", "CHICAGO", "12:00", "17:00", 600, 250);
       Flight flight6 = new Flight("Jet Blue","EM-7533", "MUMBAI", "LOSANGELES", "10:00", "20:00", 500, 150);
       Flight flight7 = new Flight("Jet Blue","J-8466", "NAGPUR", "BOSTON", "07:00", "18:00", 550, 160);
       Flight flight8 = new Flight("Jet Blue","AC-4832", "BANGALORE", "ATLANTA", "13:00", "22:00", 700, 250);
       Flight flight9 = new Flight("Jet Blue","D-4736", "HYDERABAD", "SAN FRANCISCO", "15:00", "25:00", 800, 450);
       Flight flight10 = new Flight("Jet Blue","AA-2376", "JAIPUR", "NEWYORK", "04:00", "20:00", 250, 350);
       
       flightList.add(flight1);
       flightList.add(flight2);
       flightList.add(flight3);
       flightList.add(flight4);
       flightList.add(flight5);
       flightList.add(flight6);
       flightList.add(flight7);
       flightList.add(flight8);
       flightList.add(flight9);
       flightList.add(flight10);

    }
    
}
