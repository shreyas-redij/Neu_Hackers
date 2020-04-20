/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Joy
 */
public class LoginOptions extends javax.swing.JPanel {

    /**
     * Creates new form LoginOptions
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Organization.Type type;
            
    
    public LoginOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCounselor = new javax.swing.JButton();
        btnBirthMother = new javax.swing.JButton();
        btnParent = new javax.swing.JButton();
        btnBank = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnInsurance = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 122, 183));
        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        btnCounselor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCounselor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/counselor.png"))); // NOI18N
        btnCounselor.setText("Counselor");
        btnCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCounselorActionPerformed(evt);
            }
        });

        btnBirthMother.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBirthMother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maternity.png"))); // NOI18N
        btnBirthMother.setText("Birth Mother");
        btnBirthMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBirthMotherActionPerformed(evt);
            }
        });

        btnParent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnParent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/family.png"))); // NOI18N
        btnParent.setText("Parent");
        btnParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentActionPerformed(evt);
            }
        });

        btnBank.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bank.png"))); // NOI18N
        btnBank.setText("Bank");
        btnBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBankActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnInsurance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnInsurance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insurance.png"))); // NOI18N
        btnInsurance.setText("Insurance");
        btnInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsuranceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCounselor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBirthMother, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(btnParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsurance, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBirthMother, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCounselor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(499, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        LoginPage ls = new LoginPage(userProcessContainer, system, type.HospitalAdmin);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCounselorActionPerformed
        // TODO add your handling code here:
        LoginPage ls = new LoginPage(userProcessContainer, system, type.Counselor);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCounselorActionPerformed

    private void btnBirthMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBirthMotherActionPerformed
        // TODO add your handling code here:
        LoginPage ls = new LoginPage(userProcessContainer, system, type.BirthMotherOrg);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBirthMotherActionPerformed

    private void btnParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentActionPerformed
        // TODO add your handling code here:
        LoginPage ls = new LoginPage(userProcessContainer, system, type.ParentsOrg);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnParentActionPerformed

    private void btnInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsuranceActionPerformed
        // TODO add your handling code here:
        LoginPage ls = new LoginPage(userProcessContainer,system, type.InsuranceManager);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInsuranceActionPerformed

    private void btnBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBankActionPerformed
        // TODO add your handling code here:
        LoginPage ls = new LoginPage(userProcessContainer,system, type.BankManager);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBankActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBank;
    private javax.swing.JButton btnBirthMother;
    private javax.swing.JButton btnCounselor;
    private javax.swing.JButton btnInsurance;
    private javax.swing.JButton btnParent;
    // End of variables declaration//GEN-END:variables
}
