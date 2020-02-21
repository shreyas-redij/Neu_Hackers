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
public class CustomerDirectory {
    
    
    private ArrayList<Customer>customerList;

     public CustomerDirectory() {
        
        customerList = new ArrayList<>();
        
    }
     
    public ArrayList<Customer> getCustomerDirectory() {
        return customerList;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerList = customerDirectory;
    }

   public Customer addCustomer(String customerName,long customerContact, String customerEmail,String flightNumber, String seatNumber) {
       Customer customer = new Customer(customerName , customerContact , customerEmail, flightNumber, seatNumber );
       customerList.add(customer);
       return customer;
   }
   
   public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
    }
}
