/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdministrativeRole;

import Business.Directory.Counsellor;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Validations.ValidatePasswords;
import Business.Validations.ValidateStrings;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrey
 */
public class HospitalManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalManageEmployeeJPanel
     */
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount account;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public HospitalManageEmployeeJPanel(JPanel userProcessContainer,UserAccount account,Enterprise enterprise) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateOrganizationEmpComboBox();
      //populateTable(organizationDir);
        addInputVerifiers();
        
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization.getName().equals("Counselor Organization"))
                organizationEmpJComboBox.addItem(organization);
        }
    }

    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Counsellor employee : organization.getEmployeeDirectory().getCounselorlist()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }
        
        private void addInputVerifiers() {
            InputVerifier stringValidation = new ValidateStrings();
            nameJTextField.setInputVerifier(stringValidation);
            InputVerifier passwordValidation = new ValidatePasswords();
            passwordJTextField.setInputVerifier(passwordValidation);
            userNameJTextField.setInputVerifier(stringValidation);
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        userNameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UsrNameLabel = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        passwordLabel = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Organization");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Name");

        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Role");

        UsrNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UsrNameLabel.setText("User Name");

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        addJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addJButton.setText("CREATE EMPLOYEE");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(489, 489, 489))
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(277, 277, 277)
                                    .addComponent(passwordLabel)
                                    .addGap(29, 29, 29))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(276, 276, 276)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(UsrNameLabel))
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(136, 136, 136)
                            .addComponent(roleJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsrNameLabel)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        if (organization != null){
            populateRoleComboBox(organization);
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed

    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        String userName = userNameJTextField.getText();
        String name = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();

        try{
            if (name.equals("")){

                throw new RuntimeException("Please enter the Name");
            }
            if (userName.equals("")){

                throw new RuntimeException("Please enter the Name");
            }
            if (password.equals("")){

                throw new RuntimeException("Please enter the Name");
            }
            /* if (usernamePatternCorrect()==false){
            UsrNameLabel.setForeground (Color.red);
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
            return;
            }else{
            UsrNameLabel.setForeground (Color.BLACK);
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.black));
            }
            if (passwordPatternCorrect()==false){
            passwordLabel.setForeground (Color.red);
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter,"
                    + " one lower case letter, one digit and one special character $, *, # or &.");
            return;
             }else{
            passwordLabel.setForeground (Color.BLACK);
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.black));
            }
            */
            
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Please enter valid data", "warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
        if(organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            Counsellor employee = organization.getEmployeeDirectory().createandaddCounselor(name);
            organization.getUserAccountDirectory().createCounselorUserAccount(userName, password, employee, role, account.getNetwork());
            JOptionPane.showMessageDialog(this, "Account created successfully");
        }
        else{
            JOptionPane.showMessageDialog(this, "Username already exists. Please select another username!");
        }

        populateTable(organization);
        userNameJTextField.setText("");
        passwordJTextField.setText("");
        nameJTextField.setText("");
    }//GEN-LAST:event_addJButtonActionPerformed
/*// Validation part//
    
    private boolean usernamePatternCorrect(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(userNameJTextField.getText());
        boolean b=m.matches();
        return b;
    }
     private boolean passwordPatternCorrect(){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(passwordJTextField.getText());
        boolean b1=m1.matches();
        return b1;
    }*/
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsrNameLabel;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
