/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminui;

import javax.swing.JOptionPane;
import model.dao.ManufacturerInfoDAO;
import model.to.ManufacturerInfo;
import operations.Validations;
import sound.ProSound;
import utility.CommonOperations;

/**
 *
 * @author ADITYA
 */
public class AddNewManufacturer extends javax.swing.JInternalFrame {

    private int mid;

    public AddNewManufacturer() {
        initComponents();
    }

    public AddNewManufacturer(ManufacturerInfo record) {
        this();
        if (record != null) {
            this.mid = record.getMID();
            setTitle("Update Manufacturer Details");
            btnAdd.setText("Update Manufacturer Details");
            jtfName.setText(record.getName());
            jtfAddress.setText(record.getAddress());
            jtfContactNo.setText(record.getContactno());
            jtfEmailId.setText(record.getEmailid());
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

        jLabel1 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfContactNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfEmailId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add New Manufacturer Details");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter Name:");

        jtfName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNameKeyTyped(evt);
            }
        });

        jtfAddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Enter Address:");

        jtfContactNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Enter Contact No:");

        jtfEmailId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Enter Email ID:");

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAdd.setText("Add Manufacturer Details");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminui/mail.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminui/contactno.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminui/location.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminui/name.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfName, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(jtfAddress)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(jtfEmailId)
                            .addComponent(jtfContactNo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ProSound ps = new ProSound();
        String message = "";
        boolean allvalid = true;
        String name = jtfName.getText().trim();
        String address = jtfAddress.getText().trim();
        String contactno = jtfContactNo.getText().trim();
        String emailid = jtfEmailId.getText().trim();
        if (Validations.isEmpty(name)) {
            allvalid = false;
            message += "Please enter some value in Name box\n\n";
        } else if (!Validations.onlyCharacter(name)) {
            allvalid = false;
            message += "Please enter character value in Name box\n\n";
        }
        if (Validations.isEmpty(address)) {
            allvalid = false;
            message += "Please enter some value in Address box\n\n";
        }
        if (Validations.isEmpty(contactno)) {
            allvalid = false;
            message += "Please enter some value in Contact No box\n\n";
        } else if (!Validations.validContact(contactno)) {
            allvalid = false;
            message += "Contact No is Invalid\n\n";
        }
        if (Validations.isEmpty(emailid)) {
            allvalid = false;
            message += "Please enter some value in Email ID box\n\n";
        } else if (!Validations.validEmail(emailid)) {
            allvalid = false;
            message += "Email ID is Invalid\n\n";
        }
        if (allvalid) {
            ManufacturerInfo record = new ManufacturerInfo();
            record.setName(name);
            record.setAddress(address);
            record.setContactno(contactno);
            record.setEmailid(emailid);
            ManufacturerInfoDAO action = new ManufacturerInfoDAO();
            if (btnAdd.getText().contains("Add")) {
                if (action.insertRecord(record)) {
                    ps.button();
                    message = "Manufacturer information is added in the system";
                } else {
                    ps.computererror();
                    if (action.getErrormessage().contains("Duplicate entry")) {
                        message = "Email id you entered already exists.\nPlease enter your personal unique emailid.";
                    } else {
                        message = "Insertion Failure due to:" + action.getErrormessage();
                    }
                }
            } else if (btnAdd.getText().contains("Update")) {
                record.setMID(mid);
                if (action.updateRecord(record)) {
                    ps.button();
                    message = "Manufacturer information is updated in the system";
                    CommonOperations.showScreen(getDesktopPane(), new ViewManufacturers());
                    dispose();
                } else {
                    ps.computererror();
                    if (action.getErrormessage().contains("Duplicate entry")) {
                        message = "Email id you entered already exists.\nPlease enter your personal unique emailid.";
                    } else {
                        message = "Upadation Failure due to:" + action.getErrormessage();
                        CommonOperations.showScreen(getDesktopPane(), new ViewManufacturers());
                        dispose();
                    }
                }

            } else {
                ps.computererror();
                message = "Not proper operation";
            }
        } else {
            ps.computererror();
        }
        JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_btnAddActionPerformed

    private void jtfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNameKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            if (!Character.isWhitespace(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtfNameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfContactNo;
    private javax.swing.JTextField jtfEmailId;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables
}
