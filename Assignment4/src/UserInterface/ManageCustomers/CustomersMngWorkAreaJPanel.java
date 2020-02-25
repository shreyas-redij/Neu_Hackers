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
        btnViewPastBookings = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        lblManageCustomers.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(51, 51, 51));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCustomers.setText("MANAGE CUSTOMERS");

        btnBookFlights.setBackground(new java.awt.Color(245, 245, 246));
        btnBookFlights.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBookFlights.setForeground(new java.awt.Color(102, 102, 255));
        btnBookFlights.setText("Book Flights");
        btnBookFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightsActionPerformed(evt);
            }
        });

        btnViewPastBookings.setBackground(new java.awt.Color(245, 245, 246));
        btnViewPastBookings.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnViewPastBookings.setForeground(new java.awt.Color(78, 114, 175));
        btnViewPastBookings.setText("View Past Bookings");
        btnViewPastBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPastBookingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnBookFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(lblManageCustomers)))
                .addContainerGap(328, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(btnViewPastBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnBookFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(561, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(371, 371, 371)
                    .addComponent(btnViewPastBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(372, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightsActionPerformed
        // TODO add your handling code here:
        BookFlightWorkAreaJPanel panel = new BookFlightWorkAreaJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("BookFlightWorkAreaJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);

    }//GEN-LAST:event_btnBookFlightsActionPerformed

    private void btnViewPastBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPastBookingsActionPerformed
        // TODO add your handling code here:
        ManagePastBookingsJPanel panel = new ManagePastBookingsJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("ManagePastBookingsJPanel" , panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnViewPastBookingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookFlights;
    private javax.swing.JButton btnViewPastBookings;
    private javax.swing.JLabel lblManageCustomers;
    // End of variables declaration//GEN-END:variables
}
