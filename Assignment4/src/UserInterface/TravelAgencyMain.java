/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.TravelAgency;
import UserInterface.ManageAirliners.AirlinersMngWorkAreaJPanel;
import UserInterface.ManageCustomers.CustomersMngWorkAreaJPanel;
import UserInterface.ManageTravelAgency.TravelAgencyMngWorkAreaJPanel;
import java.awt.CardLayout;

/**
 *
 * @author shrey
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    
    /**
     * Creates new form TravelAgencyMainJFrame
     */
    private TravelAgency travelAgency;
    public TravelAgencyMain() {
        initComponents();
        this.travelAgency = new TravelAgency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnTravelAgency = new javax.swing.JButton();
        btnAirliners = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        cardSequenceJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTravelAgency.setText("Travel Agency");
        btnTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravelAgencyActionPerformed(evt);
            }
        });
        jPanel1.add(btnTravelAgency, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 30));

        btnAirliners.setText("Airlines");
        btnAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlinersActionPerformed(evt);
            }
        });
        jPanel1.add(btnAirliners, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 30));

        btnCustomers.setText("Customers");
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });
        jPanel1.add(btnCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        cardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(cardSequenceJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelAgencyActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        TravelAgencyMngWorkAreaJPanel panel = new TravelAgencyMngWorkAreaJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("TravelAgencyMngWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnTravelAgencyActionPerformed

    private void btnAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlinersActionPerformed
        // TODO add your handling code here:
        AirlinersMngWorkAreaJPanel panel = new AirlinersMngWorkAreaJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("AirlinersMngWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnAirlinersActionPerformed

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        // TODO add your handling code here:
        CustomersMngWorkAreaJPanel panel = new CustomersMngWorkAreaJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("CustomersMngWorkAreaJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnCustomersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAirliners;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnTravelAgency;
    private javax.swing.JPanel cardSequenceJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
