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
import Business.Mail.EmailUtility;
import Business.Mail.ConfigUtility;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.BirthMotherToCounselor;
import Business.WorkQueue.WorkQueue;
import java.awt.Color;
import java.io.File;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class MotherRegister extends javax.swing.JPanel {

    /**
     * Creates new form MotherRegister
     */
    public BirthMotherDirectory birthMotherDirectory;
    public BirthMother birthMother;
    public BirthMotherToCounselor bmWorkQueue;
    private EcoSystem system;
    private ConfigUtility configUtil;
    private EmailUtility emailUtil;
    

    /**
     * Creates new form registerMother
     */
    JPanel userProcessContainer;
    

    public MotherRegister(JPanel userProcessContainer, EcoSystem system) {
        
        initComponents();
        this.emailUtil = new EmailUtility();
        this.configUtil = new ConfigUtility();
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
        UsrNameLabel = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        emailIdLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        confirmPassTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hospitalJComboBox = new javax.swing.JComboBox();
        btnConfirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));

        jLabel6.setText("First Name*:");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        UsrNameLabel.setText("Username*:");

        emailIdLbl.setText("Email*:");

        passwordLabel.setText("Password*:");

        jLabel3.setText("Confirm Password*:");

        jLabel5.setText("Select Hospital:");

        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Hospital", "Item 2", "Item 3", "Item 4" }));
        hospitalJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalJComboBoxActionPerformed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Birth Mother Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(552, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailIdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UsrNameLabel)
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
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(397, 397, 397))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsrNameLabel)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
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
             if (usernamePatternCorrect()==false){
            UsrNameLabel.setForeground (Color.red);
            userNameTxt.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
            return;
            } else{
            UsrNameLabel.setForeground (Color.BLACK);
            userNameTxt.setBorder(BorderFactory.createEmptyBorder());
            
            }
             
            
            if (emailIdPatternCorrect()==false){
            emailIdLbl.setForeground (Color.red);
            emailTxt.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
            return;
            }else{
            emailIdLbl.setForeground (Color.BLACK);
            emailTxt.setBorder(BorderFactory.createEmptyBorder());
            }
            
            if (passwordPatternCorrect()==false){
            passwordLabel.setForeground (Color.red);
            passwordTxt.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter,"
                    + " one lower case letter, one digit and one special character $, *, # or &.");
            return;
            }else{
            passwordLabel.setForeground (Color.black);
            passwordTxt.setBorder(BorderFactory.createEmptyBorder());
                }
      
      // BirthMother in people created
            birthMother.setEmailId(emailId);
            birthMother.setHospital(hospital.getName());
            birthMother.setPassword(password);
            birthMother.setUsername(username);
            birthMother.setFirstName(name);
            JOptionPane.showMessageDialog(null, "BirthMother Profile Created Successfully");
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
            sendMail();
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
            //e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Please enter valid data", "warning", JOptionPane.WARNING_MESSAGE);
          return;     
            
        }
       
        //Adding work request to current work queue

    }//GEN-LAST:event_btnConfirmActionPerformed
// Validation part
    
    private boolean usernamePatternCorrect(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(userNameTxt.getText());
        boolean b=m.matches();
        return b;
    }
    
    private boolean emailIdPatternCorrect(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(emailTxt.getText());
        boolean b=m.matches();
        return b;
    }
    
     private boolean passwordPatternCorrect(){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(passwordTxt.getText());
        boolean b1=m1.matches();
        return b1;
    }
     
     public void sendMail(){
         
        String toAddress = "gomesjoy1696@gmail.com";
        String subject = "Test";
        String message = "Message delivered successfully";
        File[] attachFiles = null;
    /*    
        
         
        if (!filePicker.getSelectedFilePath().equals("")) {
            File selectedFile = new File(filePicker.getSelectedFilePath());
            attachFiles = new File[] {selectedFile};
        }
     */    
        try {
            Properties smtpProperties = configUtil.loadProperties();
            emailUtil.sendEmail(smtpProperties, toAddress, subject, message, attachFiles);
             
            JOptionPane.showMessageDialog(this,
                    "The e-mail has been sent successfully!");
             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error while sending the e-mail: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsrNameLabel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JTextField confirmPassTxt;
    private javax.swing.JLabel emailIdLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
