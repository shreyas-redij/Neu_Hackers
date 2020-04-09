/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.BankManagerRole;
import Business.Role.InsuranceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Joy
 */
public class FinancialEnterprise extends Enterprise {
    
    public FinancialEnterprise(String name){
        super(name,EnterpriseType.FinancialEnterprise);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
