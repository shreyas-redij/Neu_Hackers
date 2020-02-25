/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.CustomerDirectory;
import Business.Customer;
import Business.Flight;
import Business.Seats;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class BookFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightJPanel
     */
    private JPanel cardSequenceJPanel;
    private Flight flight;
    private TravelAgency travelAgency;
    
    public BookFlightJPanel(JPanel cardSequenceJPanel,Flight flight,TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flight = flight;
        this.travelAgency = travelAgency;
        txtFlightNumber.setEnabled(false);
        txtFlightNumber.setText(flight.getFlightNumber());
        
        populateSeats();
    }
    
     private boolean emailPattern() {
        Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher m = p.matcher(txtEmail.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean phoneNumberPattern() {
        Pattern p = Pattern.compile("[0-9]*");
        Matcher m = p.matcher(txtPhone.getText());
        boolean b = m.matches();
        return b;
    }
    
    public void populateSeats(){
        for(Seats seat : flight.getSeatList()){
            if(seat.isSeatAvailability() == true)
            comboSeat.addItem(seat.getSeatNumber());
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        lblFlightNumber = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        lblPastBookings = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSeat = new javax.swing.JLabel();
        comboSeat = new javax.swing.JComboBox<>();
        btnBookAFlight = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dtFlightDate = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        lblFlightNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFlightNumber.setForeground(new java.awt.Color(102, 102, 255));
        lblFlightNumber.setText("Flight Number :");

        txtFlightNumber.setBackground(new java.awt.Color(245, 245, 246));
        txtFlightNumber.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightNumberActionPerformed(evt);
            }
        });

        lblPastBookings.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblPastBookings.setForeground(new java.awt.Color(51, 51, 51));
        lblPastBookings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastBookings.setText("BOOK FLIGHT");

        btnBack.setBackground(new java.awt.Color(245, 245, 246));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(78, 114, 175));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPhone.setBackground(new java.awt.Color(245, 245, 246));
        txtPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblPhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(102, 102, 255));
        lblPhone.setText("Phone :");

        txtEmail.setBackground(new java.awt.Color(245, 245, 246));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(102, 102, 255));
        lblEmail.setText("Email :");

        lblSeat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSeat.setForeground(new java.awt.Color(102, 102, 255));
        lblSeat.setText("Seat :");

        comboSeat.setBackground(new java.awt.Color(245, 245, 246));
        comboSeat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeatActionPerformed(evt);
            }
        });

        btnBookAFlight.setBackground(new java.awt.Color(245, 245, 246));
        btnBookAFlight.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBookAFlight.setForeground(new java.awt.Color(78, 114, 175));
        btnBookAFlight.setText("Book Flight");
        btnBookAFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAFlightActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(245, 245, 246));
        txtName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 255));
        lblName.setText("Name :");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Flight Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(lblPastBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(251, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBookAFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmail)
                                        .addComponent(comboSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dtFlightDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFlightNumber)
                                .addGap(53, 53, 53)
                                .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(336, 336, 336))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblPastBookings)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnBookAFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
        Component[] comps= cardSequenceJPanel.getComponents();
        for(Component c:comps)
        {
            if(c instanceof BookFlightWorkAreaJPanel)
            {
                BookFlightWorkAreaJPanel panel=(BookFlightWorkAreaJPanel) c;
                panel.populateTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSeatActionPerformed

    private void btnBookAFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAFlightActionPerformed
        // TODO add your handling code here:
        
        String customerName = txtName.getText();
        String customerEmail = txtEmail.getText();
        String flightNumber = txtFlightNumber.getText();
        String seatNumber = (String)comboSeat.getSelectedItem();
        String arrivalTime = flight.getArrivalTime();
        String departureTime = flight.getDepartureTime();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        Date currentDate = new Date();
        String currentDateString = dateFormat.format(currentDate);
        String flightDate = dateFormat.format(dtFlightDate.getDate());
        
        long customerContact = 0;
        try{
            customerContact = Integer.parseInt(txtPhone.getText());
            
            for(Customer c : travelAgency.getCustomerDirectory().getCustomerDirectory()){
                if(c.getCustomerName().equalsIgnoreCase(customerName) && c.getCustomerEmail().equals(customerEmail) && c.getFlightDate().equals(flightDate)){
                    int currentarrival = Integer.parseInt(arrivalTime.substring(0, 2));
                    int currentdeparture=Integer.parseInt(departureTime.substring(0, 2));
                    
                    int previousarrival = Integer.parseInt(c.getArrivalTime().substring(0, 2));
                    int previousdeparture=Integer.parseInt(c.getDepartureTime().substring(0,2));
                    
                    if((currentdeparture > previousdeparture  && currentdeparture < previousarrival) || (currentarrival > previousdeparture  && currentarrival < previousarrival)){
                        
                        //if(currentdeparture < previousdeparture){
                            JOptionPane.showMessageDialog(null, "No Overlapping allowed");
                            return;
                    
                    //}
                        
                    }
                    else if((previousdeparture > currentdeparture  && previousdeparture < currentarrival) || (previousarrival > currentdeparture  && previousarrival < currentarrival)){
                        
                        //if(currentdeparture < previousdeparture){
                            JOptionPane.showMessageDialog(null, "No Overlapping allowed");
                            return;
                    
                    //}
                        
                    }
                }
            }
            
                                   
            if(!phoneNumberPattern())
            {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Phone Number");
                txtPhone.setBorder(BorderFactory.createLineBorder(Color.RED));
                lblPhone.setForeground(Color.RED);
                return;
            }else if(!emailPattern()) 
            {
                JOptionPane.showMessageDialog(null, "Email should be the form of xxx123@xxx.xxx");
                txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                lblEmail.setForeground(Color.RED);
                return;
            }else if(customerName.equals(" "))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Name");
                txtFlightNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
                lblFlightNumber.setForeground(Color.RED);
                return;
            }
            else if( currentDateString.compareTo(flightDate) > 0 || currentDateString.compareTo(flightDate) == 0){
                JOptionPane.showMessageDialog(null, "Please select a future date ");
                return;
            }
            else{
                
               travelAgency.getCustomerDirectory().addCustomer(customerName, customerContact, customerEmail, flightNumber, seatNumber,arrivalTime, departureTime, flightDate );
               flight.setAvailableSeats(flight.getTotalSeats()-1);
               JOptionPane.showMessageDialog(null, "Flight booked successfully\n"+"Airline: "+flight.getAirlinerName()+"\n"+"Flight Number: "+flight.getFlightNumber()+"\n"+"Seat Number: "+seatNumber);
               for(Seats seat:flight.getSeatList()){
                   if(seat.getSeatNumber().equals(seatNumber))
                    seat.setSeatAvailability(false);
               }
               comboSeat.removeItem(seatNumber);
               txtName.setText("");
               txtEmail.setText("");
               txtPhone.setText("");
               comboSeat.setSelectedIndex(0);
               dtFlightDate.setCalendar(null);
            }
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter your Phone Number ");
            return;
        }
         
        
       
        
       

    }//GEN-LAST:event_btnBookAFlightActionPerformed

    private void txtFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookAFlight;
    private javax.swing.JComboBox<String> comboSeat;
    private com.toedter.calendar.JDateChooser dtFlightDate;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFlightNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPastBookings;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
