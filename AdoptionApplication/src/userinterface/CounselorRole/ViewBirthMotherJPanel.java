/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounselorRole;

import Business.Directory.BirthMother;
import Business.Directory.BirthMotherDirectory;
import Business.Directory.Parents;
import Business.Enterprise.Enterprise;
import Business.Mail.ConfigUtility;
import Business.Mail.EmailUtility;
import Business.Mail.EmailVariables;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BirthMotherToCounselor;
import Business.WorkQueue.CounselorToAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.Date;
import java.util.Properties;
import javafx.stage.FileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Joy
 */
public class ViewBirthMotherJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBirthMotherJPanel
     */
    public BirthMotherDirectory birthMotherDirectory;
    public BirthMother birthMother;
    public BirthMotherToCounselor bmWorkQueue;
    private Enterprise enterprise;
    private UserAccount account;
    private BirthMotherToCounselor request;
    private ConfigUtility configUtil;
    private EmailUtility emailUtil;
    

    /**
     * Creates new form registerMother
     */
    JPanel userProcessContainer;
    

    public ViewBirthMotherJPanel(JPanel userProcessContainer, BirthMotherToCounselor bmc, UserAccount account, Enterprise enterprise) {
        
        initComponents();
        this.emailUtil = new EmailUtility();
        this.configUtil = new ConfigUtility();
        this.userProcessContainer = userProcessContainer;
        this.request = bmc;
        this.account = account;
        this.enterprise = enterprise;
        populateComponents();

    }
    
    private void populateComponents() {
        //hospitalJComboBox.removeAllItems();
        String msg = new String();
        userNameTxt.setText(request.getBirthMother().getUsername());
        emailTxt.setText(request.getBirthMother().getEmailId());
        patientIDTxt.setText(String.valueOf(request.getBirthMother().getId()));
       
  
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
        userNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        patientID = new javax.swing.JLabel();
        patientIDTxt = new javax.swing.JTextField();
        patientID1 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        patientID2 = new javax.swing.JLabel();
        txtFundsRequired = new javax.swing.JTextField();
        btnReject = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        jLabel1.setText("Username:");

        jLabel4.setText("Email:");

        patientID.setText("Patient ID");

        patientIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDTxtActionPerformed(evt);
            }
        });

        patientID1.setText("Message:");

        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });

        patientID2.setText("Total Funds:");

        txtFundsRequired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsRequiredActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Birth Mother Approval");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(btnBack))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseLabel)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientID)
                            .addComponent(patientID1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientID2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFundsRequired, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(patientIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(262, 262, 262))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientID)
                    .addComponent(patientIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientID1)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientID2)
                    .addComponent(txtFundsRequired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(311, 311, 311))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDTxtActionPerformed

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed

    private void txtFundsRequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsRequiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsRequiredActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        request.setReceiver(account);
        request.setResolveDate(new Date());
        request.setRequestResult("Rejected by " + account.getCounselor().getName());
        
        String msg = messageTxt.getText();
        if(msg.equals("")){
              JOptionPane.showMessageDialog(null, "Please input your message for the patient ");
              throw new NullPointerException("Enter message");
        }
        request.setStatus("Rejected");
        request.setCounsellorFeeback(msg);
        request.setMessage(msg);
        request.setSender(account);
        
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BirthMotherRequestWorkAreaJPanel birthMotherRequestWorkAreaJPanel = (BirthMotherRequestWorkAreaJPanel) component;
        birthMotherRequestWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        request.setReceiver(account);
        request.setResolveDate(new Date());
        request.setRequestResult("Completed by Counselor" + account.getCounselor().getName());
     
        String msg = messageTxt.getText();
        if(msg.equals("")){
              JOptionPane.showMessageDialog(null, "Please input your message for the patient ");
              throw new NullPointerException("Enter message");
        }

        request.setStatus("Completed");
        int totalfund;
        try{
        totalfund = Integer.parseInt(txtFundsRequired.getText());
        if(totalfund == 0){
              JOptionPane.showMessageDialog(null, "Please input the total fund required by the patient ");
              throw new NullPointerException("Enter funds");
        }
        }
        catch( NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Please input the total fund required by the patient in number format");
              throw new NullPointerException("Enter funds");
        }
        
        request.setCounsellorFeeback(msg);
        request.setMessage(msg);
        request.getBirthMother().setRequiredFund(totalfund);

        
        CounselorToAdmin counselorReq = new CounselorToAdmin(messageTxt.getText(), request.getBirthMother());
        
        counselorReq.setStatus("Processing");
        counselorReq.setSender(account);
        
        enterprise.getWorkQueue().getCounselorToAdmin().add(counselorReq);
        
        birthMother = request.getBirthMother();
        sendMail(birthMother);
        JOptionPane.showMessageDialog(null, "Acount Approved Successfully");
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BirthMotherRequestWorkAreaJPanel birthMotherRequestWorkAreaJPanel = (BirthMotherRequestWorkAreaJPanel) component;
        birthMotherRequestWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
        
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    public void sendMail(BirthMother birthmother){
         
        String toAddress = birthmother.getEmailId();
        String subject = "Counselor Approval";
        EmailVariables eVar = new EmailVariables();
        String start = eVar.getStart();
        String footer = eVar.getFooter();
        
        //FileChooser filePicker = new FileChooser();
        
        String content =  " <table cellspacing=\"0\" cellpadding=\"0\" align=\"center\"><tbody><tr><td><h3>Hi "+ birthmother.getUsername() +"! </td></tr><tr><td>\n Your Profile ID  " + birthmother.getId()
                + " and your Userid: "+birthmother.getUsername()+" has been approved by"+birthmother.getCounselor()+"</br></td></tr>"+"</br><tr><td><h3> Approval sent to the hospital admin for account creation!</h3></br></td></tr></tbody>  <h2> Thank you! </h2>";
        
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
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JLabel patientID;
    private javax.swing.JLabel patientID1;
    private javax.swing.JLabel patientID2;
    private javax.swing.JTextField patientIDTxt;
    private javax.swing.JTextField txtFundsRequired;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
