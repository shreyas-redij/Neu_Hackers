/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shrey
 */
public class ViewFlightJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJpanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    private Flight flight;
    public ViewFlightJpanel(JPanel cardSequenceJpanel,Flight flight) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJpanel;
        this.flight=flight;
        populateFlightDetails();
        btnSave.setEnabled(false);
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
        txtAirlinerName = new javax.swing.JTextField();
        txtFlightNumber = new javax.swing.JTextField();
        txtFlightDestination = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFlightSource = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtFlightDeparture = new javax.swing.JTextField();
        txtFlightArrival = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotalSeats = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW FLIGHT DETAILS");

        txtAirlinerName.setEditable(false);
        txtAirlinerName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAirlinerName.setForeground(new java.awt.Color(78, 114, 175));
        txtAirlinerName.setEnabled(false);
        txtAirlinerName.setPreferredSize(new java.awt.Dimension(200, 30));

        txtFlightNumber.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightNumber.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightNumber.setEnabled(false);
        txtFlightNumber.setPreferredSize(new java.awt.Dimension(200, 30));

        txtFlightDestination.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightDestination.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightDestination.setEnabled(false);
        txtFlightDestination.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Destination:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Flight Number:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Airliner Name :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Total Seats :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Departure Time:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Source:");

        txtFlightSource.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightSource.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightSource.setEnabled(false);
        txtFlightSource.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Arrival Time:");

        txtprice.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtprice.setForeground(new java.awt.Color(78, 114, 175));
        txtprice.setEnabled(false);
        txtprice.setPreferredSize(new java.awt.Dimension(200, 30));

        btnBack.setBackground(new java.awt.Color(245, 245, 246));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(78, 114, 175));
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(245, 245, 246));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(78, 114, 175));
        btnUpdate.setText("Update Flight");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtFlightDeparture.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightDeparture.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightDeparture.setEnabled(false);
        txtFlightDeparture.setPreferredSize(new java.awt.Dimension(200, 30));

        txtFlightArrival.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightArrival.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightArrival.setEnabled(false);
        txtFlightArrival.setPreferredSize(new java.awt.Dimension(200, 30));
        txtFlightArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightArrivalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Price Of Seat :");

        txtTotalSeats.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTotalSeats.setForeground(new java.awt.Color(78, 114, 175));
        txtTotalSeats.setEnabled(false);
        txtTotalSeats.setPreferredSize(new java.awt.Dimension(200, 30));

        btnSave.setBackground(new java.awt.Color(245, 245, 246));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(78, 114, 175));
        btnSave.setText("Save Details");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtFlightArrival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtFlightDeparture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtFlightDestination, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtFlightSource, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtAirlinerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFlightSource, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlightDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFlightDeparture, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFlightArrival, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateFlightDetails(){
        txtAirlinerName.setEnabled(false);
        txtAirlinerName.setText(flight.getAirlinerName());
        txtFlightNumber.setText(flight.getFlightNumber());
        txtFlightSource.setText(flight.getSource());
        txtFlightDestination.setText(flight.getDestination());
        txtFlightDeparture.setText(flight.getDepartureTime());
        txtFlightArrival.setText(flight.getArrivalTime());
        txtprice.setText(String.valueOf(flight.getFlightPrice()));
        txtTotalSeats.setText(String.valueOf(flight.getTotalSeats()));
    }
    
    public boolean checkString(String string){
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(string);
        boolean b = m.matches();
        return b;
    }
    
    public boolean checkFlightNumber(String string){
        Pattern p = Pattern.compile("^[\\w]+-[\\w]+$");
        Matcher m = p.matcher(string);
        boolean b = m.matches();
        return b;
    }
    
    public boolean checkTimePattern(String string){
       Pattern p = Pattern.compile("^[0-9]+:[0-9]+$");
       Matcher m = p.matcher(string);
       boolean b = m.matches();
       return b;
    }
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
        Component[] comps= cardSequenceJPanel.getComponents();
        for(Component c:comps)
        {
            if(c instanceof TravelAgencyMngWorkAreaJPanel)
            {
                TravelAgencyMngWorkAreaJPanel panel=(TravelAgencyMngWorkAreaJPanel) c;
                panel.populateTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtFlightNumber.setEnabled(true);
        txtFlightSource.setEnabled(true);
        txtFlightDestination.setEnabled(true);
        txtFlightDeparture.setEnabled(true);
        txtFlightArrival.setEnabled(true);
        txtprice.setEnabled(true);
        txtTotalSeats.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String flightNumber = txtFlightNumber.getText();
        String source = txtFlightSource.getText();
        String destination = txtFlightDestination.getText();
        String departure = txtFlightDeparture.getText();
        String arrival = txtFlightArrival.getText();
        try{
            Double price = Double.parseDouble(txtprice.getText());
            int totalSeats = Integer.parseInt(txtTotalSeats.getText());
            flight.setFlightPrice(price);
            flight.setTotalSeats(totalSeats);
            
        if(!checkFlightNumber(flightNumber)){
            JOptionPane.showMessageDialog(null, "Please enter valid flight number : XX-XXXX");
        }
        else if(!checkTimePattern(departure)){
            JOptionPane.showMessageDialog(null, "Please enter valid departure time : XX:XX");
        }
        else if(!checkTimePattern(arrival)){
            JOptionPane.showMessageDialog(null, "Please enter valid arrival time : XX:XX");
        }
        else if(!checkString(source)){
            JOptionPane.showMessageDialog(null, "Please enter valid source");
        }
        else if(!checkString(destination)){
            JOptionPane.showMessageDialog(null, "Please enter valid destination");
        }
        else {
            flight.setFlightNumber(flightNumber);
            flight.setSource(source);
            flight.setDestination(destination);
            flight.setArrivalTime(arrival);
            flight.setDepartureTime(departure);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            txtFlightNumber.setEnabled(false);
            txtFlightSource.setEnabled(false);
            txtFlightDestination.setEnabled(false);
            txtFlightDeparture.setEnabled(false);
            txtFlightArrival.setEnabled(false);
            txtprice.setEnabled(false);
            txtTotalSeats.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Fligh details successfully updated");
        }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Price and Total seats should be a number");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtFlightArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightArrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightArrivalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtFlightArrival;
    private javax.swing.JTextField txtFlightDeparture;
    private javax.swing.JTextField txtFlightDestination;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtFlightSource;
    private javax.swing.JTextField txtTotalSeats;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
