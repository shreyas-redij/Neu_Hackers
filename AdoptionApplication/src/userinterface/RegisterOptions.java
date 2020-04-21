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
import userinterface.LoginPage;

/**
 *
 * @author Joy
 */
public class RegisterOptions extends javax.swing.JPanel {

    /** Creates new form LoginOptions */
   JPanel userProcessContainer;
    EcoSystem system;
    Organization.Type type;
            
    
    public RegisterOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnParent = new javax.swing.JButton();
        btnBirthMother = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        btnParent.setBackground(new java.awt.Color(255, 153, 0));
        btnParent.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnParent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/family.png"))); // NOI18N
        btnParent.setText("Parent");
        btnParent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentActionPerformed(evt);
            }
        });

        btnBirthMother.setBackground(new java.awt.Color(255, 255, 255));
        btnBirthMother.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnBirthMother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maternity.png"))); // NOI18N
        btnBirthMother.setText("Birth Mother");
        btnBirthMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBirthMotherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBirthMother, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(btnParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(btnBirthMother)
                .addGap(85, 85, 85)
                .addComponent(btnParent)
                .addGap(517, 517, 517))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBirthMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBirthMotherActionPerformed
        // TODO add your handling code here:
        MotherRegister ls = new MotherRegister(userProcessContainer, system);
        userProcessContainer.add("MotherRegister", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBirthMotherActionPerformed

    private void btnParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentActionPerformed
        // TODO add your handling code here:
        ParentRegister ls = new ParentRegister(userProcessContainer, system);
        userProcessContainer.add("ParentRegister", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnParentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBirthMother;
    private javax.swing.JButton btnParent;
    // End of variables declaration//GEN-END:variables

}
