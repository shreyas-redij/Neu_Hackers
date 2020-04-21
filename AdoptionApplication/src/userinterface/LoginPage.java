/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Joy
 */
public class LoginPage extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Organization.Type type;
    
    public LoginPage(JPanel userProcessContainer, EcoSystem system, Organization.Type type ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.type = type;
      
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
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Password:");

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428))
            .addGroup(layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addComponent(btnLogin)
                .addContainerGap(506, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        
        if (type.getValue().equals(type.HospitalAdmin.getValue())){
            if(userAccount==null){
                //Step 2: Go inside each network and check each enterprise
                for(Network network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                        userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if(userAccount!=null){
                                   inEnterprise=enterprise;
                                   break;
                        }  
                    }
                    if(inEnterprise!=null){
                    break;}
                }
            }
        }else if(type.getValue().equals(type.Counselor.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Network network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Hospital)){
                            for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                                if(organization.getName().equals("Counselor Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                        }
                    if(userAccount!=null){
                        break;
                        }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.BirthMotherOrg.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Network network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Hospital)){
                            for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                                if(organization.getName().equals("BirthMother Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.ParentsOrg.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Network network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Hospital)){
                            for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                                if(organization.getName().equals("Parents Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                            
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.BankManager.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Network network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().FinancialEnterprise)){
                            for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                                if(organization.getName().equals("BankManager Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                            
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.InsuranceManager.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Network network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().FinancialEnterprise)){
                            for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                                if(organization.getName().equals("InsuranceManager Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add("workArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }
        
        btnLogin.setEnabled(false);
        //logoutJButton.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
