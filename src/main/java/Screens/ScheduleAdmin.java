
package screens;

import controllers.DoctorController;
import controllers.ScheduleController;
import validators.FieldValidator;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ScheduleAdmin extends javax.swing.JInternalFrame {

    DoctorController doctorController = new DoctorController();
    ScheduleController scheduleController = new ScheduleController();
    
    
    public ScheduleAdmin() {
        initComponents();
    }

  
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        getFreeAppointments = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        patientId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        patientBirthday = new com.toedter.calendar.JDateChooser();
        specialtyField = new javax.swing.JTextField();
        scheduleAdminPicker = new com.github.lgooddatepicker.components.DateTimePicker();

        jButton4.setBackground(new java.awt.Color(0, 153, 102));
        jButton4.setText("Search Appointment");

        jLabel1.setText("Hour and Date");

        getFreeAppointments.setText("Search Free Appointments");
        getFreeAppointments.setBackground(new java.awt.Color(0, 153, 153));
        getFreeAppointments.setForeground(new java.awt.Color(255, 255, 255));
        getFreeAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getFreeAppointmentsActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Doctor", "Patient", "Date", "Taken", "Price", "Specialty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(resultTable);

        jLabel4.setText("Specialty");

        jLabel3.setText("Patient ID");

        jButton3.setText("Cancel");
        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Search Patient Appointments");
        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getFreeAppointments)
                        .addGap(405, 405, 405))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(specialtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scheduleAdminPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(438, 438, 438)
                    .addComponent(patientBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(438, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(specialtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scheduleAdminPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getFreeAppointments))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(247, 247, 247)
                    .addComponent(patientBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel)resultTable.getModel();        
        try {
            FieldValidator.validateField(patientId.getText());
            model.setRowCount(0);
             ResultSet results = scheduleController.getScheduleByPatient(patientId.getText());
              if (results.next()){
            do {
                
               String [] row = {results.getString(1), results.getString(2),  results.getString(3), results.getString(4), results.getString(5), results.getString(6), results.getString(7)};
               model.addRow(row);
                
            }while(results.next());
            }
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage(),
						"Error", JOptionPane.ERROR_MESSAGE);
        }
       
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void getFreeAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getFreeAppointmentsActionPerformed
        DefaultTableModel model = (DefaultTableModel)resultTable.getModel();
        model.setRowCount(0);
        String specialty = specialtyField.getText();
        LocalDateTime time = scheduleAdminPicker.getDateTimePermissive();
        if (!specialty.isEmpty()) {
            try {
                 ResultSet results = doctorController.getDoctorBySpecialty(specialty);
                  if (results.next()){
            do {
                if (results.getString(5).equals('0')){
                     String [] row = {results.getString(1), results.getString(2),  results.getString(3), results.getString(4), results.getString(5), results.getString(6), results.getString(7)};
               model.addRow(row);
                }
            }while(results.next());
            }
            }
            catch (Exception e) {
                // TODO CARTEL
            } 
       }
        if (!(time == null)) {
            try {
                 ResultSet results = scheduleController.getScheduleByDoctorSingleDate(time);
                  if (results.next()){
            do {
                if (results.getString(5).equals('0')){
                    if (specialty.isEmpty()){
                         String [] row = {results.getString(1), results.getString(2),  results.getString(3), results.getString(4), results.getString(5), results.getString(6), results.getString(7)};
               model.addRow(row);
                    }
                    else {
                        if (results.getString(7).equals(specialty)) {
                             String [] row = {results.getString(1), results.getString(2),  results.getString(3), results.getString(4), results.getString(5), results.getString(6), results.getString(7)};
               model.addRow(row);
                        }
                    }
                    
                }
            }while(results.next());
            }
            }
            catch (Exception e) {
                // TODO CARTEL
            } 
       }
    }
    private javax.swing.JButton getFreeAppointments;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser patientBirthday;
    private javax.swing.JTextField patientId;
    private javax.swing.JTable resultTable;
    private com.github.lgooddatepicker.components.DateTimePicker scheduleAdminPicker;
    private javax.swing.JTextField specialtyField;
   
}
