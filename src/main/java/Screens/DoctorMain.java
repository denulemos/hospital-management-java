
package screens;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DoctorMain extends javax.swing.JFrame {
    
    ScheduleDoctor scheduleDoctor;
    GenerateReportDoctor generateReportDoctor;
    AttendPatient attendPatient;

    public DoctorMain() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        scheduleDoctor = new ScheduleDoctor();
        generateReportDoctor = new GenerateReportDoctor();
        attendPatient = new AttendPatient();
        add(scheduleDoctor);
        add(generateReportDoctor);
        add(attendPatient);
    }


    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        ScheduleMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        LogOutMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));

        ScheduleMenu.setText("Schedule");
        ScheduleMenu.setToolTipText("");
        ScheduleMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScheduleMenuMouseClicked(evt);
            }
        });
        ScheduleMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(ScheduleMenu);

        jMenu2.setText("Generate Report");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Attend Patient");
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

        LogOutMenu.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        LogOutMenu.setText("Log Out");
        LogOutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMenuMouseClicked(evt);
            }
        });
        LogOutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(LogOutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );

        pack();
    }



    private void LogOutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMenuMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to Log Out?", "Select", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                System.exit(0);
            }
    }



    private void ScheduleMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScheduleMenuMouseClicked
         scheduleDoctor.setVisible(true);
        generateReportDoctor.setVisible(false);
        attendPatient.setVisible(false);      
    }


    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
         scheduleDoctor.setVisible(false);
        generateReportDoctor.setVisible(true);
        attendPatient.setVisible(false);
    }

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
         scheduleDoctor.setVisible(false);
        generateReportDoctor.setVisible(false);
        attendPatient.setVisible(true);
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
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorMain().setVisible(true);
            }
        });
    }

  
    private javax.swing.JMenu LogOutMenu;
    private javax.swing.JMenu ScheduleMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;

}
