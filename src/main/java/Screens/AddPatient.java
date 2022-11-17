package screens;

import controllers.PatientController;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddPatient extends javax.swing.JInternalFrame {

    PatientController controller = new PatientController();

    public AddPatient() {
        initComponents();
    }


    private String setGender () {
        if (radioMan.isSelected()){
            return "M";
        }
        
        return "F";
        
    };
    
    
    private void initComponents() {

        patientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addPatientSubmit = new javax.swing.JButton();
        addPatientCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientHistory = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        patientId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radioMan = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        patientLastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("Name");

        addPatientSubmit.setBackground(new java.awt.Color(0, 153, 153));
        addPatientSubmit.setForeground(new java.awt.Color(255, 255, 255));
        addPatientSubmit.setText("Add");
        addPatientSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientSubmitActionPerformed(evt);
            }
        });

        addPatientCancel.setBackground(new java.awt.Color(153, 153, 153));
        addPatientCancel.setForeground(new java.awt.Color(255, 255, 255));
        addPatientCancel.setText("Cancel");
        addPatientCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientCancelActionPerformed(evt);
            }
        });

        patientHistory.setColumns(20);
        patientHistory.setRows(5);
        jScrollPane1.setViewportView(patientHistory);

        jLabel2.setText("Medic History");

        jLabel4.setText("ID");

        radioMan.setText("Man");

        radioFemale.setText("Female");

        jLabel3.setText("Lastname");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Add Patient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(patientId)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(patientName)
                            .addComponent(addPatientSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(addPatientCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioMan)
                                .addGap(32, 32, 32)
                                .addComponent(radioFemale))
                            .addComponent(patientLastname)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel7)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(patientLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMan)
                    .addComponent(radioFemale))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(addPatientSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPatientCancel)
                .addGap(39, 39, 39))
        );

        pack();
    }

    private void addPatientSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        String gender = setGender();
        
        try {
            controller.addPatient(patientId.getText(), patientName.getText(), patientLastname.getText(), patientHistory.getText(), gender);
            JOptionPane.showMessageDialog(null, "The patient has been registered succesfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Couldn't add new Patient: " + ex);
        }
        
        
    }

    private void addPatientCancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }



    private javax.swing.JButton addPatientCancel;
    private javax.swing.JButton addPatientSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea patientHistory;
    private javax.swing.JTextField patientId;
    private javax.swing.JTextField patientLastname;
    private javax.swing.JTextField patientName;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMan;
   
}
