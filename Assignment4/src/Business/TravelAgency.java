/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author shrey
 */
public class TravelAgency {
    private AirlinerDirectory airlinerDirectory;
    private CustomerDirectory customerDirectory;
    

    
  public TravelAgency()
  {
      this.airlinerDirectory = new AirlinerDirectory();
      this.customerDirectory = new CustomerDirectory();
  }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
}
