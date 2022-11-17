
package screens;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AdminMain extends javax.swing.JFrame {

    ScheduleAdmin scheduleAdmin;
    GenerateReportAdmin generateReportAdmin;
    AddPatient addPatient;
    RegisterDoctorScreen registerDoctorScreen;
    RegisterConsultantScreen registerAdmin;
    AttendPatient editPatient;

    public AdminMain() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        scheduleAdmin = new ScheduleAdmin();
        generateReportAdmin = new GenerateReportAdmin();
        addPatient = new AddPatient();
        registerDoctorScreen = new RegisterDoctorScreen();
        registerAdmin = new RegisterConsultantScreen();
        editPatient = new AttendPatient();
        add(scheduleAdmin);
        add(generateReportAdmin);
        add(addPatient);
        add(registerDoctorScreen);
        add(registerAdmin);
        add(editPatient);
    }

   
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jMenu1.setText("Users");

        jMenuItem1.setText("Add new Doctor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem7.setText("Add new Admin");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Patients");

        jMenuItem2.setText("Add new Patient");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Schedule");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Generate Report");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        logoutMenu.setText("Logout");
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1235, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );

        pack();
    }

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {
         int option = JOptionPane.showConfirmDialog(null, "Do you really want to Log Out?", "Select", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                System.exit(0);
            }
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        scheduleAdmin.setVisible(false);
        generateReportAdmin.setVisible(false);
        addPatient.setVisible(false);
        registerDoctorScreen.setVisible(true);
        registerAdmin.setVisible(false);
        editPatient.setVisible(false);
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
       scheduleAdmin.setVisible(false);
        generateReportAdmin.setVisible(false);
        addPatient.setVisible(true);
        registerDoctorScreen.setVisible(false);
        registerAdmin.setVisible(false);
         editPatient.setVisible(false);
    }

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
        scheduleAdmin.setVisible(false);
        generateReportAdmin.setVisible(false);
        addPatient.setVisible(false);
        registerDoctorScreen.setVisible(false);
        registerAdmin.setVisible(true);
         editPatient.setVisible(false);
    }

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {
          scheduleAdmin.setVisible(true);
        generateReportAdmin.setVisible(false);
        addPatient.setVisible(false);
        registerDoctorScreen.setVisible(false);
        registerAdmin.setVisible(false);
         editPatient.setVisible(false);
    }

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {
           scheduleAdmin.setVisible(false);
        generateReportAdmin.setVisible(true);
        addPatient.setVisible(false);
        registerDoctorScreen.setVisible(false);
        registerAdmin.setVisible(false);
         editPatient.setVisible(false);
    }
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu logoutMenu;
  
}
