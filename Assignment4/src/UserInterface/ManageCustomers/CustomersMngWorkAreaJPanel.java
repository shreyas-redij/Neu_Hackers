/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;


import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class CustomersMngWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    public CustomersMngWorkAreaJPanel(JPanel cardSequenceJPanel,TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
 
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageCustomers = new javax.swing.JLabel();
        btnBookFlights = new javax.swing.JButton();

        setBackground(new java.awt.Color(22, 72, 128));
        setPreferredSize(new java.awt.Dimension(1111, 765));

        lblManageCustomers.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCustomers.setText("MANAGE CUSTOMERS");

        btnBookFlights.setBackground(new java.awt.Color(245, 245, 246));
        btnBookFlights.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBookFlights.setForeground(new java.awt.Color(78, 114, 175));
        btnBookFlights.setText("Book Flights");
        btnBookFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblManageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBookFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblManageCustomers)
                .addGap(283, 283, 283)
                .addComponent(btnBookFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightsActionPerformed
        // TODO add your handling code here:
        BookFlightWorkAreaJPanel panel = new BookFlightWorkAreaJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("BookFlightWorkAreaJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);

    }//GEN-LAST:event_btnBookFlightsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookFlights;
    private javax.swing.JLabel lblManageCustomers;
    // End of variables declaration//GEN-END:variables
}