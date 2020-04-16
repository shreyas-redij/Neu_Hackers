/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Dashboards;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class HealthDetailsDashboard extends javax.swing.JPanel {

    /**
     * Creates new form HealthDetailsDashboard
     */
    private ArrayList<String> week = new ArrayList<String>();
   // DataReader commentReader;
   // Map<String, String> weekValues = new HashMap<>();
    
    public HealthDetailsDashboard() {
        initComponents();
                
        for(int i = 0;i < 40; i++){
            week.add("Week"+(i+1));
        }
        //populateDropdown();
        //readCSV();
    }
    /*private void readCSV(){
        try {
            commentReader = new DataReader("/Users/ishanibose/Desktop/FinalTemp/againstallodds/AdoptionAssist/src/Document/PregnancyProgress.csv");
            try {
                readData();
            } catch (IOException ex) {
                Logger.getLogger(BirthMotherDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
            catch (FileNotFoundException ex) {
            Logger.getLogger(BirthMotherDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void readData() throws IOException{
        String[] row;
        while((row = commentReader.getNextRow()) != null ){            
            generate(row);
            System.out.println("");
        }
    }*/
    private void generate(String[] row){
        // TODO
        String week = row[0];
        String detail = row[1];
        
//        weekValues.put(week, detail);
                
        System.out.print(week);
        System.out.print(detail);
    }
    
   /* private void populateDropdown(){
    
        selectWeekComboBox.removeAllItems();
        selectWeekComboBox.addItem("Select week");
        
        for(String week: week){
           selectWeekComboBox.addItem(week);
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        imgBaby = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInstructions = new javax.swing.JTextArea();
        btnLearn = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)), "Mother Health Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.setPreferredSize(new java.awt.Dimension(810, 318));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Selected week:");

        txtAreaInstructions.setColumns(20);
        txtAreaInstructions.setRows(5);
        txtAreaInstructions.setText("Avoid alcohol, drugs, and tobacco products.\nTalk to your doctor about any prescription and \nnonprescription (OTC) drugs you are taking. aintain a \ndiet that contains an \nadequate amount of vitamins, especially folic acid.");
        jScrollPane1.setViewportView(txtAreaInstructions);

        btnLearn.setText("Learn");
        btnLearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBaby)
                    .addComponent(jLabel6))
                .addGap(189, 189, 189)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLearn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnLearn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgBaby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnActionPerformed
        // TODO add your handling code here:
       /* String selection = selectWeekComboBox.getSelectedItem().toString();

        if(weekValues.containsKey(selection)){
            txtAreaInstructions.setText(weekValues.get(selection));
        }

        URL urlToImage = this.getClass().getResource("/Images/"+selection+".png");
        imgBaby.setIcon(new ImageIcon(urlToImage));*/
    }//GEN-LAST:event_btnLearnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLearn;
    private javax.swing.JLabel imgBaby;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaInstructions;
    // End of variables declaration//GEN-END:variables
}
