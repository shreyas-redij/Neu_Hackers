/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BankAccount.LoanAccountDirectory;
import Business.Directory.BirthMotherDirectory;
import Business.Directory.ParentsDirectory;
import Business.Directory.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Joy
 */
public abstract class Organization {

    private String name;

    private WorkQueue workQueue;
    private ParentsDirectory parentDirectory;
    private BirthMotherDirectory birthMotherDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private LoanAccountDirectory loanDirectory;
    //private InsuranceAccountDirectory insuranceAccountDirectory;
    private int organizationID;
    private static int counter=0;

    public ParentsDirectory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(ParentsDirectory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public BirthMotherDirectory getBirthMotherDirectory() {
        return birthMotherDirectory;
    }

    public void setBirthMotherDirectory(BirthMotherDirectory birthMotherDirectory) {
        this.birthMotherDirectory = birthMotherDirectory;
    }
    //private LoanAccountDirectory loanDirectory;
    //private InsuranceAccountDirectory insuranceAccountDirectory;

    public LoanAccountDirectory getLoanDirectory() {
        return loanDirectory;
    }

    public void setLoanDirectory(LoanAccountDirectory loanDirectory) {
        this.loanDirectory = loanDirectory;
    }
    
    
    public enum Type{
        HospitalAdmin("HospitalAdmin Organization"), 
        Counselor("Counselor Organization"), 
        BankManager("BankManager Organization"),
        InsuranceManager("InsuranceManager Organization"),
        FinanceAdmin("FinanceAdmin Organization"),
        BirthMotherOrg("BirthMother Organization"),
        ParentsOrg("Parents Organization");
                
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
      
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        parentDirectory = new ParentsDirectory();
        birthMotherDirectory = new BirthMotherDirectory();
        userAccountDirectory = new UserAccountDirectory();
        //loanDirectory = new LoanAccountDirectory();
        //insuranceAccountDirectory = new InsuranceAccountDirectory();
        
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
