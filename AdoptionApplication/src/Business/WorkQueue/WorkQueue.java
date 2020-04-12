/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Shreyas
 */
public class WorkQueue {
    
    private ArrayList<BirthMotherToCounselor> birthMotherToCounselor;
    private ArrayList<CounselorToAdmin> counselorToAdmin;
    private ArrayList<HospitalAdminToBank> hospitalAdminToBank;


    public WorkQueue() {
        birthMotherToCounselor = new ArrayList();
        counselorToAdmin = new ArrayList();
        hospitalAdminToBank = new ArrayList();

               
    }  

    public ArrayList<BirthMotherToCounselor> getBirthMotherToCounsellor() {
        return birthMotherToCounselor;
    }

    public void setBirthMotherToCounselor(ArrayList<BirthMotherToCounselor> birthMotherToCounselor) {
        this.birthMotherToCounselor = birthMotherToCounselor;
    }
    
    public void addBirthMotherToCounselor(BirthMotherToCounselor bMC) {
       birthMotherToCounselor.add(bMC);

    }
    
    public void setCounselorToAdmin(ArrayList<CounselorToAdmin> counselorToAdmin) {
        this.counselorToAdmin = counselorToAdmin;
    }

    public ArrayList<CounselorToAdmin> getCounselorToAdmin() {
        return counselorToAdmin;
    }
    
    public ArrayList<HospitalAdminToBank> getHospitalAdminToBank() {
        return hospitalAdminToBank;
    }

    public void setHospitalAdminToBank(ArrayList<HospitalAdminToBank> hospitalAdminToBank) {
        this.hospitalAdminToBank = hospitalAdminToBank;
    }

}