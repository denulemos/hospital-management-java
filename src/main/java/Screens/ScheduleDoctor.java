
package screens;

import controllers.PatientController;
import controllers.ScheduleController;
import controllers.UserController;
import validators.PatientValidator;
import validators.ScheduleValidator;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ScheduleDoctor extends javax.swing.JInternalFrame {

    ScheduleController schedController = new ScheduleController();
   
    public ScheduleDoctor() {
        initComponents();
    }
    
    private void refreshData() {                                         
        try {
            DefaultTableModel model = (DefaultTableModel)resultTable.getModel();
            model.setRowCount(0);
            ResultSet results = schedController.getScheduleByDoctor(UserController.currentUser.getId());
         if (results.next()){
            do {
               String [] row = {results.getString(1), results.getString(4),  results.getString(3), results.getString(6), results.getString(5)};
               model.addRow(row);
            }while(results.next());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "There was an error trying to get the appointments");
            System.out.println(e);
        }
    } 
    
    

   
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scheduleDoctor = new com.github.lgooddatepicker.components.DateTimePicker();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Patient", "Price", "Taken?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setColumnSelectionAllowed(true);
        resultTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                resultTableComponentAdded(evt);
            }
        });
        resultTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resultTableFocusGained(evt);
            }
        });
        resultTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                resultTableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(resultTable);

        jButton1.setText("Add Appointment");
        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Date");

        jButton3.setText("Save Changes");
        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.setBackground(new java.awt.Color(204, 0, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Refresh");
        jButton5.setBackground(new java.awt.Color(102, 102, 255));
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
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scheduleDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(543, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scheduleDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       LocalDateTime time = scheduleDoctor.getDateTimePermissive();
       if (time == null) {
           JOptionPane.showMessageDialog(null, "All fields must be filled");
           return;
       }
       String doctor = UserController.currentUser.getId();
       String specialty = UserController.currentUser.getSpecialty();
       int price = UserController.currentUser.getPrice();
       try {
          ScheduleValidator.isScheduleOccuped(time, doctor);  
           schedController.createSchedule(doctor, time, price, specialty);
           JOptionPane.showMessageDialog(null, "Appointment created");
           refreshData();
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, "There was an error:" + e.getMessage(),
						"Error", JOptionPane.ERROR_MESSAGE);
       }
    }

  
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
         refreshData();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        for (int i = 0; i < resultTable.getRowCount(); i++) {
            String id = (String) resultTable.getValueAt(i, 0);
            String patient = (String) resultTable.getValueAt(i, 2);
            int price = Integer.valueOf((String)resultTable.getValueAt(i, 3));
            String taken = (String) resultTable.getValueAt(i, 4);
              
            try {
                ScheduleValidator.validateTake(patient, taken);
                PatientValidator.checkIfUserExists(patient);
                schedController.updateSchedule(id, patient, price, taken);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),
						"Error", JOptionPane.ERROR_MESSAGE);
            }
               
        }
        
          JOptionPane.showMessageDialog(null, "Appointments Updated");
          refreshData();
    }


  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable resultTable;
    private com.github.lgooddatepicker.components.DateTimePicker scheduleDoctor;
   
}
