/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BirthMotherRole;

import Business.Directory.BirthMother;
import Business.Directory.Parents;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Joy
 */
public class BirthMotherWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Organization organization;
    private BirthMother BirthMother;
    private Parents parent;
    
    /**
     * Creates new form CounselorWorkArea
     */
    public BirthMotherWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;
        this.system = system;
        this.BirthMother = account.getBirthmother();
        
        if(BirthMother.getFinalizedParent() != null){
        this.parent = BirthMother.getFinalizedParent();
        
        populateParentDetails();
        }
        chart();
    }
    
    public void chart(){
        try{
        int self = BirthMother.getOwnFunds();
        int parent = BirthMother.getParentAidfund();
        int help;
        int loan = BirthMother.getLoanAmountApproved();
        //int insurance = BirthMother.getInsuranceAmount();
        int counselor = BirthMother.getRequiredFund();
        if(loan != 0){
            help = loan;
        }
        else{
            //help = insurance;
            help = 0;
        }
        int extra = counselor - (self+parent+help);
        
        if(self+parent+help +extra== counselor){
            
        DefaultPieDataset dataset = new DefaultPieDataset();
   
        dataset.setValue("Parents", (((float)parent/counselor)*100));
        dataset.setValue("Self", (((float)self/counselor)*100));
        dataset.setValue("Loan/Insurance", ((float)help/counselor)*100);
        dataset.setValue("Extra",((float)extra/counselor)*100);
        
        JFreeChart chart = ChartFactory.createPieChart("BIRTH MOTHER FUNDS", dataset, true, true, false);
        
        //chart.getPlot().setBackgroundPaint(Color.white);
        //ChartJPanel = new ChartPanel(chart);
        //ChartJPanel.add(pieChart2);
        
        java.awt.image.BufferedImage image = chart.createBufferedImage(400,350);
        ImageIcon icon = new ImageIcon(image); 
        lblChart.setIcon(icon);
        
        

        
        }
        else{
        DefaultPieDataset dataset = new DefaultPieDataset();
            dataset.setValue("TBD", 100);
            
            JFreeChart chart = ChartFactory.createPieChart("FUNDS to fill", dataset, true, true, false);
        
        chart.getPlot().setBackgroundPaint(Color.white);
        //ChartJPanel = new ChartPanel(chart);
        //ChartJPanel.add(pieChart2);
        
        java.awt.image.BufferedImage image = chart.createBufferedImage(400,350);
        ImageIcon icon = new ImageIcon(image); 
        lblChart.setIcon(icon);


        }
        
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error");
        }
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
        chkBankAccount = new javax.swing.JRadioButton();
        chkInsurance = new javax.swing.JRadioButton();
        updateProfile = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        viewParentsJButton = new javax.swing.JButton();
        viewBankDetails = new javax.swing.JButton();
        btnCreateLoan = new javax.swing.JButton();
        btnCreateInsurance = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        parentImg = new javax.swing.JLabel();
        lblChart = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Birth Work Area");

        chkBankAccount.setText("Loan Request");
        chkBankAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBankAccountActionPerformed(evt);
            }
        });

        chkInsurance.setText("Insurance");
        chkInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInsuranceActionPerformed(evt);
            }
        });

        updateProfile.setText("View/Update Profile");
        updateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setText("<value>");

        viewParentsJButton.setText("View Parent Directory");
        viewParentsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewParentsJButtonActionPerformed(evt);
            }
        });

        viewBankDetails.setText("View Bank Details");
        viewBankDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBankDetailsActionPerformed(evt);
            }
        });

        btnCreateLoan.setText("Create Loan Request");
        btnCreateLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLoanActionPerformed(evt);
            }
        });

        btnCreateInsurance.setText("Insurance ");
        btnCreateInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateInsuranceActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PARENT PROFILE :");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 151, 182));
        jLabel3.setText("NAME:");

        lblName.setText("TBP");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 151, 182));
        jLabel4.setText("ADDRESS:");

        lblAddress.setText("TBP");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 151, 182));
        jLabel5.setText("CONTACT:");

        lblContact.setText("TBP");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 151, 182));
        jLabel6.setText("EMAIL:");

        lblEmail.setText("TBP");

        parentImg.setBackground(new java.awt.Color(102, 255, 102));
        parentImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lblName)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(lblAddress)
                    .addComponent(lblContact)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(lblContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblChart.setMaximumSize(new java.awt.Dimension(350, 350));
        lblChart.setMinimumSize(new java.awt.Dimension(350, 350));
        lblChart.setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(enterpriseLabel)
                                .addGap(46, 46, 46)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewParentsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCreateLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(chkBankAccount)
                                .addGap(159, 159, 159)
                                .addComponent(chkInsurance))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(viewBankDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChart, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewParentsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkBankAccount)
                            .addComponent(chkInsurance))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(viewBankDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblChart, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkBankAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBankAccountActionPerformed
       if(BirthMother.getLoanaccount().getBankAccountNumber() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Bank Manager to accept the bank account req");
            return;
        }
        if(BirthMother.getParentAidfund() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Parent to add aid amount");
            return;
        }
        if(BirthMother.getOwnFunds() == 0){
            JOptionPane.showMessageDialog(this, "Please add your contribution in View Bank Acccount page");
            return;

        }

        if (chkBankAccount.isSelected()){
            btnCreateLoan.setEnabled(true);
            btnCreateInsurance.setEnabled(false);
            chkInsurance.setSelected(false);
        }

    }//GEN-LAST:event_chkBankAccountActionPerformed

    private void chkInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInsuranceActionPerformed
        if(BirthMother.getLoanaccount().getBankAccountNumber() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Bank Manager to accept the bank account req");
            return;
        }
        if(BirthMother.getParentAidfund() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Parent to add aid amount");
            return;
        }
        if(BirthMother.getOwnFunds() == 0){
            JOptionPane.showMessageDialog(this, "Please add your contribution in View Bank Acccount page");
            return;

        }
        if (chkInsurance.isSelected()){
            btnCreateLoan.setEnabled(false);
            btnCreateInsurance.setEnabled(true);
            chkBankAccount.setSelected(false);
        }
    }//GEN-LAST:event_chkInsuranceActionPerformed

    private void updateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        BirthMotherProfile birthProfile = new BirthMotherProfile(userAccount,organization, userProcessContainer);
        userProcessContainer.add(birthProfile);
        layout.next(userProcessContainer);

    }//GEN-LAST:event_updateProfileActionPerformed
    
    private void populateParentDetails(){
        lblName.setText(parent.getFirstName() +" "+ parent.getLastName());
        lblAddress.setText(parent.getAddress());
        lblEmail.setText(parent.getEmail());
        lblContact.setText(parent.getContactParent());
        parentImg.setIcon(new ImageIcon(parent.getImgPath()));
    }
    
    private void viewParentsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewParentsJButtonActionPerformed
        if(BirthMother.getAddress() == null){
            JOptionPane.showMessageDialog(this, "Please update the profile before viewing Parents");
            return;
        }
        else{
            if(BirthMother.getFinalizedParent() == null)
            {

                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("ViewParentDirectory", new ViewParentDirectory(userProcessContainer, userAccount, BirthMother,enterprise));
                layout.next(userProcessContainer);
            }
            else{
                JOptionPane.showMessageDialog(this, "You are already set, cant view Parents. \n Please contact your Counselor!");
                return;
            }
       }
    }//GEN-LAST:event_viewParentsJButtonActionPerformed


    
    private void viewBankDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBankDetailsActionPerformed
        if(BirthMother.getLoanaccount().getBankAccountNumber() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Bank Manager to accept the bank account req");
            return;
        }
        else{
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            UpdateBankInformation bankAcc = new UpdateBankInformation(userAccount, userProcessContainer, system);
            userProcessContainer.add(bankAcc);
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewBankDetailsActionPerformed

    private void btnCreateLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLoanActionPerformed
        if(userAccount.getBirthmother().getTypeL() != 2){
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //LoanCreation bankAcc = new LoanCreation();
            LoanCreation bankAcc = new LoanCreation(userAccount, userProcessContainer, system);
            userProcessContainer.add(bankAcc);
            layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "Cant select Loan as your Bank account is not ready or else you have opted for Insurance");
            return;
        }
    }//GEN-LAST:event_btnCreateLoanActionPerformed

    private void btnCreateInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInsuranceActionPerformed
        if(userAccount.getBirthmother().getTypeL() != 1){
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            InsuranceViewPage bankAcc = new InsuranceViewPage(userAccount, userProcessContainer, enterprise, system);
            userProcessContainer.add(bankAcc);
            layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "Cant select Insurance as your Bank account is not ready or else you have opted for Loan");
            return;
        }
    }//GEN-LAST:event_btnCreateInsuranceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateInsurance;
    private javax.swing.JButton btnCreateLoan;
    private javax.swing.JRadioButton chkBankAccount;
    private javax.swing.JRadioButton chkInsurance;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblChart;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel parentImg;
    private javax.swing.JButton updateProfile;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewBankDetails;
    private javax.swing.JButton viewParentsJButton;
    // End of variables declaration//GEN-END:variables
}
