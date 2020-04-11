/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Directory.BirthMother;
import Business.Directory.BirthMotherDirectory;
import Business.Directory.Counsellor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.BirthMotherToCounselor;
import Business.WorkQueue.WorkQueue;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Joy
 */
public class MotherRegister extends javax.swing.JPanel {

    /**
     * Creates new form MotherRegister
     */
    public BirthMotherDirectory birthMotherDirectory;
    public BirthMother birthMother;
    public BirthMotherToCounselor bmWorkQueue;
    private EcoSystem system;
    

    /**
     * Creates new form registerMother
     */
    JPanel userProcessContainer;
    

    public MotherRegister(JPanel userProcessContainer, EcoSystem system) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.birthMother = new BirthMother(); 
        populateComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        confirmPassTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hospitalJComboBox = new javax.swing.JComboBox();
        btnConfirm = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));

        jLabel6.setText("First Name*:");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Username*:");

        jLabel4.setText("Email*:");

        jLabel2.setText("Password*:");

        jLabel3.setText("Confirm Password*:");

        jLabel5.setText("Select Hospital:");

        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Hospital", "Item 2", "Item 3", "Item 4" }));
        hospitalJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalJComboBoxActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(255, 153, 51));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1245, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(474, 474, 474)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(confirmPassTxt)
                                .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(475, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void hospitalJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalJComboBoxActionPerformed
    
    private void populateComboBox() {
        //hospitalJComboBox.removeAllItems();
        hospitalJComboBox.removeAllItems();
        for(Network n: system.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                    hospitalJComboBox.addItem(e);
                }    
            }
        }
    }
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        // TODO add your handling code here:
        try {
            
        
            String name = nameTxt.getText();
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Firstname");
                throw new RuntimeException("Please enter the Username");
            }
            
            String username = userNameTxt.getText();
            if (username.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Username");
                throw new RuntimeException("Please enter the Username");
            }
            
            String emailId = emailTxt.getText();
            if (emailId.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Email Id");
                throw new RuntimeException("Please enter the Email Id");
            }
            
            String password = passwordTxt.getText();
            String confpassword = confirmPassTxt.getText();
            if (password.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the password");
                throw new RuntimeException("Please enter the password");
            }
            
            if (!password.equals(confpassword)){
                JOptionPane.showMessageDialog(null, "Confirm Password and Password should match");
                throw new RuntimeException("Confirm Password and Password should match");
            }
            
            HospitalEnterprise hospital = (HospitalEnterprise) hospitalJComboBox.getSelectedItem();
            if (hospital == null){
                JOptionPane.showMessageDialog(null, "Please select the Hospital");
                throw new RuntimeException("Please enter the Hospital");
            }
      
      // BirthMother in people created
            birthMother.setEmailId(emailId);
            birthMother.setHospital(hospital.getName());
            birthMother.setPassword(password);
            birthMother.setUsername(username);
            birthMother.setFirstName(name);
      
        //Initiating work request for BMC
             BirthMotherToCounselor bmc = new BirthMotherToCounselor(birthMother);
     
       
       
            try {
        
                Random rand = new Random(); 
                Counsellor c = new Counsellor();
                for (Organization o : hospital.getOrganizationDirectory().getOrganizationList()){
                   if (o.getName().equals(Organization.Type.Counselor.getValue())){
                   int size = o.getEmployeeDirectory().getCounselorlist().size();
                   c = o.getEmployeeDirectory().getCounselorlist().get(rand.nextInt(size)); 
                   birthMother.setCounselor(c.getName());
                   o.getBirthMotherDirectory().addBirthMother(birthMother);
                   }
                }
            bmc.setCounsellor(c);
            bmc.setStatus("Pending");
            WorkQueue wq = hospital.getWorkQueue();
        
            wq.addBirthMotherToCounselor(bmc);
            nameTxt.setText("");
            userNameTxt.setText("");
            emailTxt.setText("");
            passwordTxt.setText("");
            confirmPassTxt.setText("");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "No Counselors available at this hospital, Please select another hospital!");
            
            }

        }
        catch(Exception e){
            e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Please enter valid data", "warning", JOptionPane.WARNING_MESSAGE);
          return;     
            
        }
       
        //Adding work request to current work queue

    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JTextField confirmPassTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
