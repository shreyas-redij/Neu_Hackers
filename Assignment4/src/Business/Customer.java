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
public class Customer {
    
    String customerName; // Name of the Customer
    long customerContact; // Customer Contact Number
    String customerEmail; // Customer Email Id
    private String seatNumber; // Customer Seat No
    private String flightNumber; // Customer Filght Number
    private ArrayList<AirlinerDirectory> airlinerDirectory;
    private String arrivalTime;
    private String departureTime;
    private String flightDate;

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    Customer(String customerName, long customerContact, String customerEmail, String flightNumber, String seatNumber, String arrivalTime, String departureTime, String flightDate) {
        this.customerName =customerName ;
        this.customerEmail = customerEmail;
        this.customerContact = customerContact;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.flightDate = flightDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public ArrayList<AirlinerDirectory> getAirlinerdirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerdirectory(ArrayList<AirlinerDirectory> airlinerdirectory) {
        this.airlinerDirectory = airlinerdirectory;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(long customerContact) {
        this.customerContact = customerContact;
    }

    

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

   
    @Override
    public String toString() {
        return customerName;
    }

}
