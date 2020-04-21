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
import Business.Mail.EmailVariables;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Validations.ValidateEmailTextField;
import Business.Validations.ValidatePasswords;
import Business.Validations.ValidateStrings;
import Business.WorkQueue.BirthMotherToCounselor;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.stage.FileChooser;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
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
        addInputVerifiers();
    }
    
     private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateStrings();
        nameTxt.setInputVerifier(stringValidation);
        userNameTxt.setInputVerifier(stringValidation);
        InputVerifier passwordValidation = new ValidatePasswords();
        InputVerifier emailValidation = new ValidateEmailTextField();
        
        passwordTxt.setInputVerifier(passwordValidation);
        confirmPassTxt.setInputVerifier(passwordValidation);
        emailTxt.setInputVerifier(emailValidation);
        
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
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 122, 183));
        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("First Name*:");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        UsrNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UsrNameLabel.setText("Username*:");

        emailIdLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        emailIdLbl.setText("Email*:");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordLabel.setText("Password*:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Confirm Password*:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Select Hospital:");

        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Hospital", "Item 2", "Item 3", "Item 4" }));
        hospitalJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalJComboBoxActionPerformed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Birth Mother Registration");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 278, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(53, 53, 53))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(37, 37, 37)))
                    .addComponent(UsrNameLabel)
                    .addComponent(emailIdLbl)
                    .addComponent(passwordLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(447, 447, 447))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsrNameLabel))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
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
            
            Random rand1 = new Random(); 
            Counsellor c1 = new Counsellor();
            
            for (Organization o1 : hospital.getOrganizationDirectory().getOrganizationList()){
                   if (o1.getName().equals(Organization.Type.Counselor.getValue())){
                   int size = o1.getEmployeeDirectory().getCounselorlist().size();
                   c1 = o1.getEmployeeDirectory().getCounselorlist().get(rand1.nextInt(size)); 
                   
                   if(c1.getName().equals(null) || c1.equals(null)){
                       JOptionPane.showMessageDialog(null, "No Counselors available at this hospital, Please select another hospital!");
                        throw new RuntimeException("No Counselor available");
                       
                   
                   }
                   }
            }
            
            //for(Organization o2 : hospital.getOrganizationDirectory().getOrganizationList()){
                //if(o2.getName().equals("BirthMother Organization")){
                    //if (!o2.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
                        //JOptionPane.showMessageDialog(this, "Username already exists. Please select another username!");
                        //return;
                    
                    //}
                //}
            //}
            
            for (Network n : system.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                    for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getUsername().equals(username)){
                            JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                            for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList()){
                                if(ua1.getUsername().equals(username)){
                                    JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                        }

                    }
                }
            }
        }
            
           
      // BirthMother in people created
            birthMother.setEmailId(emailId);
            birthMother.setHospital(hospital.getName());
            birthMother.setPassword(password);
            birthMother.setUsername(username);
            birthMother.setFirstName(name);
            JOptionPane.showMessageDialog(null, "BirthMother Profile Created and Email has been sent");
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
            sendMail(c);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed
// Validation part
    
  /*  private boolean emailIdPatternCorrect(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
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
     */
     public void sendMail(Counsellor c){
         
        String toAddress = emailTxt.getText();;
        String subject = "Birth Mother Registration";
        EmailVariables eVar = new EmailVariables();
        String start = eVar.getStart();
        String footer = eVar.getFooter();
        
        FileChooser filePicker = new FileChooser();
        
        String content =  " <table cellspacing=\"0\" cellpadding=\"0\" align=\"center\"><tbody><tr><td>\n <h3>Your Registration is successful <br>You have been alloted Counselor :"
                + c.getName() + "</br></td></tr>"+"<tr><td><h3>Your Patient ID is " + birthMother.getId()
                + "</h3></td></tr></br><tr><td><h3> Kindly wait for your Counselor to contact you for your appointment details!</h3></br></td></tr></tbody>  <h2> Thank you! </h2>";
        
        String message = start + content + footer;
        File[] attachFiles = null;
        
        //File selectedFile = new File("..\\images\\adopt.jpg");
        //attachFiles = new File[] {selectedFile};
  
        try {
            Properties smtpProperties = configUtil.loadProperties();
            emailUtil.sendEmail(smtpProperties, toAddress, subject, message, attachFiles);

             
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
    private javax.swing.JButton jButton1;
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
