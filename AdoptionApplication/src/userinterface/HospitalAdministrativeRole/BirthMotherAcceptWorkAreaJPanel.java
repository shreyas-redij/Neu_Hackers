/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdministrativeRole;

//import Business.BankAccount.Loan;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FinancialEnterprise;
import Business.Network.Network;
import Business.Organization.BankManagerOrganization;
import Business.Organization.Organization;
import Business.Directory.BirthMother;
import Business.Mail.ConfigUtility;
import Business.Mail.EmailUtility;
import Business.Mail.EmailVariables;
import Business.Role.BirthMotherRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BirthMotherToCounselor;
import Business.Role.Role;
import Business.WorkQueue.CounselorToAdmin;
import Business.WorkQueue.HospitalAdminToBank;
//import Business.WorkQueue.HospitalAdminToBank;
import java.awt.CardLayout;
import java.io.File;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Joy
 */
public class BirthMotherAcceptWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private BirthMother birthMother;
    private Network network;
    private ConfigUtility configUtil;
    private EmailUtility emailUtil;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public BirthMotherAcceptWorkAreaJPanel(JPanel userProcessContainer, Network network, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.emailUtil = new EmailUtility();
        this.configUtil = new ConfigUtility();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.network = network;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        populateComboBox();
    }
    
    public void populateComboBox(){
        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.FinancialEnterprise.getValue())){
                 bankComboBox.addItem(e);
                }
        }
    
    }
    
    public void sendMail(BirthMother birthmother){
         
        String toAddress = birthmother.getEmailId();
        String subject = "Hospital Admin Approval";
        EmailVariables eVar = new EmailVariables();
        String start = eVar.getStart();
        String footer = eVar.getFooter();
        
        //FileChooser filePicker = new FileChooser();
        
        String content =  " <table cellspacing=\"0\" cellpadding=\"0\" align=\"center\"><tbody><h3><tr><td>Hi "+ birthmother.getUsername() +"! </td></tr><tr><td>\n <h3>Your Profile ID  " + birthmother.getId()
                + " and your Userid: "+birthmother.getUsername()+" has been approved by Hospital Admin</br></td></tr>"+"</br><tr><td>You can now login to the application with your credentials </br></td></tr><tr><td><h3> Approval sent to the Bank Manager for Bank Account Creation!</h3></br></td></tr></h3></tbody>  <h2> Thank you! </h2>";

        
        String message = start + content + footer;
        File[] attachFiles = null;
        
        //File selectedFile = new File("..\\images\\adopt.jpg");
        //attachFiles = new File[] {selectedFile};
  
        try {
            Properties smtpProperties = configUtil.loadProperties();
            emailUtil.sendEmail(smtpProperties, toAddress, subject, message, attachFiles);

             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error while sending the e-mail: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
     }
      
    
    public void populateRequestTable(){
        txtPassword.setText("");
        txtUserName.setText("");
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);

        for (CounselorToAdmin request : enterprise.getWorkQueue().getCounselorToAdmin()){
            if(!(request.getBirthMother().getUsername().equals(""))){
            
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender();
                if (request.getReceiver()== null)
                        row[2] = "";
                else
                    row[2] = request.getReceiver();
                if (request.getStatus() == null)
                        row[3] = "";
                else
                        row[3] = request.getStatus();
                String result = request.getRequestResult();
                row[4] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        valueLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bankComboBox = new javax.swing.JComboBox();
        messageTxt = new javax.swing.JTextField();
        valueLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Approved by", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.setEnabled(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        refreshTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.jpg"))); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        valueLabel.setText("<value>");

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        valueLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        valueLabel1.setText("Username:");

        valueLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        valueLabel2.setText("Password");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Bank Enterprise:");

        bankComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankComboBoxActionPerformed(evt);
            }
        });

        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });

        valueLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        valueLabel3.setText("Message for Bank Manager:");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel3)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(638, 638, 638)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bankComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(messageTxt))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(425, 425, 425))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshTestJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
      
        int selectedRow = workRequestJTable.getSelectedRow();
        
        FinancialEnterprise f = (FinancialEnterprise)bankComboBox.getSelectedItem();
        if (f.equals("")){
            JOptionPane.showMessageDialog(null, "Please select a finance enterprise to move further else add a financial enterprise");
            return;
        }
        if (txtUserName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select a row from the table or enter the Username");
            return;
        }
        if(messageTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter message for Admin review");
            return;
        }
        
        CounselorToAdmin request = (CounselorToAdmin)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "User already exists!");
        }
        else{

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org.getName().equals("BirthMother Organization")){
                if (org.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){
                    request.setStatus("Completed");
                    request.setRequestResult("User Account Created");
                    request.setReceiver(account);
                    birthMother = request.getBirthMother();
                    Role role = new BirthMotherRole();
                    org.getBirthMotherDirectory().addBirthMother(birthMother);
                    org.getUserAccountDirectory().createUserAccountMother(birthMother.getFirstName(), txtUserName.getText(),txtPassword.getText() , birthMother, role, account.getNetwork() );
                        
                    HospitalAdminToBank h = new HospitalAdminToBank(messageTxt.getText(), birthMother);
                    f.getWorkQueue().getHospitalAdminToBank().add(h);
                    
                    sendMail(birthMother);

                    
                    JOptionPane.showMessageDialog(null, "User account created successfully. Approval sent to Bank");

                  
                    populateRequestTable();
                    break;
                                     
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username already exists. Please select another username!");
                    }
                
        } 
        }
     
        txtUserName.setText("");
        txtPassword.setText("");
        messageTxt.setText("");
        }   

  
    }//GEN-LAST:event_btnCreateActionPerformed
    
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table");
            return;
        }
        
        CounselorToAdmin request = (CounselorToAdmin)workRequestJTable.getValueAt(selectedRow, 0);
        
        txtUserName.setText(request.getBirthMother().getUsername());
        txtPassword.setText(request.getBirthMother().getPassword());

        btnCreate.setEnabled(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void bankComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankComboBoxActionPerformed

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bankComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JLabel valueLabel2;
    private javax.swing.JLabel valueLabel3;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
