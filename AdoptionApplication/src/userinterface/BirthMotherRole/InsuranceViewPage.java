/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BirthMotherRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Insurance.Insurance;
import Business.Insurance.InsuranceAccountDirectory;
import Business.Network.Network;
import Business.Directory.BirthMother;
import Business.UserAccount.UserAccount;
import Business.Validations.ValidateEmailTextField;
import Business.Validations.ValidatePasswords;
import Business.Validations.ValidatePhoneNumber;
import Business.Validations.ValidatePolicyNumber;
import Business.Validations.ValidateStrings;
import Business.WorkQueue.BirthMotherToInsuranceManager;
import java.awt.CardLayout;
import java.io.File;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class InsuranceViewPage extends javax.swing.JPanel {

    /**
     * Creates new form BirthMotherProfile
     */
    
    private BirthMother BirthMother;
    private Insurance insurance; 
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private String documentUpload;
    private String firstName;
    private String lastName;
    private String emailId;
    private String requestedFunds;
    private int policynumber;
    private String address;
    private InsuranceAccountDirectory insuranceDirectory;
    private boolean flagC;
    private String username;
    private EcoSystem system;
    private Network network;
    private Enterprise enterprise;
    
    
    public InsuranceViewPage(UserAccount userAccount, JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.BirthMother = userAccount.getBirthmother();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
       // this.Ins
        
        txtUsername.setText(BirthMother.getUsername());
        txtEmail.setText(BirthMother.getEmailId());
        txtFirstName.setText(BirthMother.getFirstName());
        txtLastName.setText(BirthMother.getLastName());
        
        
//        
//        for(Network n : system.getNetworkList()){
//            if(n.getName().equals(userAccount.getNetwork())){
//                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
//                    if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.FinancialEnterprise)){
//                       insuranceDirectory =  e.getInsuranceAccountDirectory();
//                    
//                    }
//                
//                }
//            
//            }
//        
//        }
        this.system = system;
        addInputVerifiers();
        btnConfirm.setEnabled(true);
        
    }
    
    // Validations 
    
        private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateStrings();
        txtFirstName.setInputVerifier(stringValidation);
        txtUsername.setInputVerifier(stringValidation);
        txtAddress.setInputVerifier(stringValidation);
        InputVerifier passwordValidation = new ValidatePasswords();
        InputVerifier emailValidation = new ValidateEmailTextField();
        InputVerifier number = new ValidatePolicyNumber();
        txtPolicyNumber.setInputVerifier(number);
        txtLastName.setInputVerifier(stringValidation);
        txtEmail.setInputVerifier(emailValidation);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        agreeCheckBox = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(51, 122, 183));
        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("INSURANCE DETAILS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME:");
        jLabel2.setPreferredSize(new java.awt.Dimension(699, 595));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("FIRST NAME:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("LAST NAME:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("EMAIL ID:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("POLICY NUMBER:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("ADDRESS:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        btnBrowse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("UPLOAD DOCUMENT:");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        agreeCheckBox.setText("*I agree the above information is correct to the best of knowledge.");
        agreeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(433, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agreeCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)))
                .addGap(305, 305, 305))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnBack)
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel10)
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(385, 385, 385)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(16, 16, 16)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel12))))))
                                        .addGap(8, 8, 8))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(393, 393, 393)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(txtFirstName)
                                .addComponent(txtLastName)
                                .addComponent(txtEmail)
                                .addComponent(txtPolicyNumber)
                                .addComponent(txtAddress))
                            .addComponent(txtDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBrowse)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(agreeCheckBox)
                .addGap(35, 35, 35)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed

         JFileChooser file = new JFileChooser();
         file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter extensionfilter =  new FileNameExtensionFilter("*.Images", "jpg","png");
        file.addChoosableFileFilter(extensionfilter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            this.documentUpload = path;
            txtDoc.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        this.firstName = txtFirstName.getText();
        this.lastName = txtLastName.getText();
        this.emailId = txtEmail.getText();
        this.policynumber = Integer.parseInt(txtPolicyNumber.getText());
        this.address = txtAddress.getText();
        //this.requestedFunds= txtreqfunds.getText();
        
        
       if (flagC == true){
        Insurance nw = new Insurance();
        for(Network network: system.getNetworkList()){
            if(network.getName().equals(userAccount.getNetwork()))
            {
                for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.FinancialEnterprise))
                    {
                            this.enterprise = e;
                               nw.setHospital(userAccount.getBirthmother().getHospital());
                               nw.setAddress(this.address);
                               nw.setEmailId(this.emailId);
                               nw.setLastName(lastName);
                               nw.setFirstName(firstName);
                               nw.setPolicyNumber(policynumber);
                               nw.setUsername(userAccount.getUsername());
                               nw.setDocPath(txtDoc.getText());
                               

                                BirthMotherToInsuranceManager bminsure = new BirthMotherToInsuranceManager( this.BirthMother, userAccount, nw, insuranceDirectory);
                                bminsure.setStatus("Pending");
                                bminsure.setSender(userAccount);
                                bminsure.setRequestDate(new Date());
                               e.getWorkQueue().getBirthMotherToInsurance().add(bminsure);
                               e.getInsuranceAccountDirectory().addInsurance(nw);
                        
                    }
                }
            }
        }
       this.BirthMother.setTypeL(2);
       this.BirthMother.setInsurance(nw);
       JOptionPane.showMessageDialog(null, "Successfully updated Insurance Profile");
        
       }
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void agreeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeCheckBoxActionPerformed
        // TODO add your handling code here:
        boolean checked = agreeCheckBox.isSelected();
         if(checked == true)
         {
            flagC= true;
         }
         else 
             
        JOptionPane.showMessageDialog(null, "Please check for Declaration");
    }//GEN-LAST:event_agreeCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreeCheckBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
