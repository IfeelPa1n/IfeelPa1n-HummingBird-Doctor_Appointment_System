/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectdoctorappointmentsystem;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DaddyK
 */
public class AvailabilitySetting extends javax.swing.JFrame {
    private boolean DSOD;
    private boolean DDDRv;
    /**
     * Creates new form AvailabilitySetting
     */
    public AvailabilitySetting() {
        initComponents();
        Sign.setEnabled(false);
        accept.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        Sign.setVisible(false);
        DN.setVisible(false);
        DE.setVisible(false);
        Start.setVisible(false);
        End.setVisible(false);
        n.setVisible(false);
        m.setVisible(false);
        sub.setVisible(false);
        ED.setVisible(false);
        MN.setVisible(false);
        AN.setVisible(false);
        MDN.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        userSched = new javax.swing.JTextField();
        passSched = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DN = new javax.swing.JTextField();
        DE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ED = new javax.swing.JButton();
        MN = new javax.swing.JButton();
        AN = new javax.swing.JButton();
        MDN = new javax.swing.JButton();
        Start = new javax.swing.JComboBox<>();
        End = new javax.swing.JComboBox<>();
        Sign = new javax.swing.JTextField();
        m = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        sub = new javax.swing.JButton();
        accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Avail Schedule");
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jLabel1.setText("USERNAME:");

        jLabel2.setText("PASSWORD:");

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Doc's First Name");

        jLabel4.setText("Doc's Email");

        jLabel5.setText("Start of Time");

        jLabel6.setText("End of Time");

        ED.setText("Early Dawn");
        ED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDActionPerformed(evt);
            }
        });

        MN.setText("Morning");
        MN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNActionPerformed(evt);
            }
        });

        AN.setText("Afternoon");
        AN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANActionPerformed(evt);
            }
        });

        MDN.setText("Midnight");
        MDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDNActionPerformed(evt);
            }
        });

        Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignActionPerformed(evt);
            }
        });

        sub.setText("save");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        accept.setText("Continue");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userSched, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Start, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DE, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(passSched, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel6)
                                    .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sub))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(accept)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ED, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MN, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AN, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MDN, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(userSched, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passSched, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(ED))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MN)
                    .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AN)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MDN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accept)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignActionPerformed

    private void EDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel<String> model1 = (DefaultComboBoxModel<String>) Start.getModel();
        DefaultComboBoxModel<String> model2 = (DefaultComboBoxModel<String>) End.getModel();
        model1.removeAllElements();
        model2.removeAllElements();
        Sign.setText("Early Dawn");
        String newItem1 = "1:00 AM";
        String newItem2 = "1:59 AM";
        String newItem3 = "2:00 AM";
        String newItem4 = "2:59 AM";
        String newItem5 = "3:00 AM";
        String newItem6 = "3:59 AM";
        String newItem7 = "4:00 AM";
        String newItem8 = "4:59 AM";
        String newItem9 = "5:00 AM";
        String newItem10 = "5:56 AM";
        model1.addElement(newItem1);
        model1.addElement(newItem3);
        model1.addElement(newItem5);
        model1.addElement(newItem7);
        model1.addElement(newItem9);
        model2.addElement(newItem2);
        model2.addElement(newItem4);
        model2.addElement(newItem6);
        model2.addElement(newItem8);
        model2.addElement(newItem10);
        
    }//GEN-LAST:event_EDActionPerformed

    private void MNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel<String> modelMS = (DefaultComboBoxModel<String>) Start.getModel();
        DefaultComboBoxModel<String> modelME = (DefaultComboBoxModel<String>) End.getModel();
        modelMS.removeAllElements();
        modelME.removeAllElements();
        String newItem1S = "6:00 AM";
        String newItem2E = "6:59 AM";
        String newItem3S = "7:00 AM";
        String newItem4E = "7:59 AM";
        String newItem5S = "8:00 AM";
        String newItem6E = "8:59 AM";
        String newItem7S = "9:00 AM";
        String newItem8E = "9:59 AM";
        String newItem9S = "10:00 AM";
        String newItem10E = "10:59 AM";
        String newItem11S = "11:00 AM";
        String newItem12E = "12:00 PM";
        modelMS.addElement(newItem1S);
        modelME.addElement(newItem2E);
        modelMS.addElement(newItem3S);
        modelME.addElement(newItem4E);
        modelMS.addElement(newItem5S);
        modelME.addElement(newItem6E);
        modelMS.addElement(newItem7S);
        modelME.addElement(newItem8E);
        modelMS.addElement(newItem9S);
        modelME.addElement(newItem10E);
        modelMS.addElement(newItem11S);
        modelME.addElement(newItem12E);
        Sign.setText("Morning");
    }//GEN-LAST:event_MNActionPerformed

    private void ANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel<String> modelAS = (DefaultComboBoxModel<String>) Start.getModel();
        DefaultComboBoxModel<String> modelAE = (DefaultComboBoxModel<String>) End.getModel();
        modelAS.removeAllElements();
        modelAE.removeAllElements();
        String newItem1AS = "12:00 PM";
        String newItem2AE = "12:59 PM";
        String newItem3AS = "1:00 PM";
        String newItem4AE = "1:59 PM";
        String newItem5AS = "2:00 PM";
        String newItem6AE = "2:59 PM";
        String newItem7AS = "3:00 PM";
        String newItem8AE = "3:59 PM";
        String newItem9AS = "4:00 PM";
        String newItem10AE = "4:59 PM";
        String newItem11AS = "5:00 PM";
        String newItem12AE = "5:59 PM";
        modelAS.addElement(newItem1AS);
        modelAE.addElement(newItem2AE);
        modelAS.addElement(newItem3AS);
        modelAE.addElement(newItem4AE);
        modelAS.addElement(newItem5AS);
        modelAE.addElement(newItem6AE);
        modelAS.addElement(newItem7AS);
        modelAE.addElement(newItem8AE);
        modelAS.addElement(newItem9AS);
        modelAE.addElement(newItem10AE);
        modelAS.addElement(newItem11AS);
        modelAE.addElement(newItem12AE);
        Sign.setText("Afternoon");
    }//GEN-LAST:event_ANActionPerformed

    private void MDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDNActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel<String> modelMS = (DefaultComboBoxModel<String>) Start.getModel();
        DefaultComboBoxModel<String> modelME = (DefaultComboBoxModel<String>) End.getModel();
        modelMS.removeAllElements();
        modelME.removeAllElements();
        String newItem1MS = "6:00 PM";
        String newItem2ME = "6:59 PM";
        String newItem3MS = "7:00 PM";
        String newItem4ME = "7:59 PM";
        String newItem5MS = "8:00 PM";
        String newItem6ME = "8:59 PM";
        String newItem7MS = "9:00 PM";
        String newItem8ME = "9:59 PM";
        String newItem9MS = "10:00 PM";
        String newItem10ME = "10:59 PM";
        String newItem11MS = "11:00 PM";
        String newItem12ME = "11:59 PM";
        modelMS.addElement(newItem1MS);
        modelME.addElement(newItem2ME);
        modelMS.addElement(newItem3MS);
        modelME.addElement(newItem4ME);
        modelMS.addElement(newItem5MS);
        modelME.addElement(newItem6ME);
        modelMS.addElement(newItem7MS);
        modelME.addElement(newItem8ME);
        modelMS.addElement(newItem9MS);
        modelME.addElement(newItem10ME);
        modelMS.addElement(newItem11MS);
        modelME.addElement(newItem12ME);
        Sign.setText("Midnight");
    }//GEN-LAST:event_MDNActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
        DSOD = false;
        //DSOD = Database_ScheduleOfDoctor.DoctorScheduleDatabase.checkDATA(DN.getText(), DE.getText());
        
        
        sub.setVisible(false);
        m.setEnabled(false);
        n.setEnabled(false);
        DN.setEnabled(false);
        DE.setEnabled(false);
        ED.setEnabled(false);
        MDN.setEnabled(false);
        MN.setEnabled(false);
        AN.setEnabled(false);
        Start.setEnabled(false);
        End.setEnabled(false);
        accept.setVisible(true);
        
        String selectedItem1 = (String) Start.getSelectedItem();
        String selectedItem2 = (String) End.getSelectedItem();
        n.setText(selectedItem1);
        m.setText(selectedItem2);
        
        Database_ScheduleOfDoctor.DoctorScheduleDatabase.Stored(  userSched.getText(), passSched.getText(), DN.getText(), DE.getText(), Sign.getText(), n.getText(), m.getText());
        Database_ScheduleOfDoctor.DoctorScheduleDatabase.checkDATA(DN.getText(), DE.getText());
        JOptionPane.showMessageDialog(null, "Your Schedule have been updated!");    
        
    }//GEN-LAST:event_subActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Note: If you want to change your schedule come again, Thank you!");
        dispose();
    }//GEN-LAST:event_acceptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DDDRv = Database.DoctorDataRegister.validate(userSched.getText(), passSched.getText());
        if(!DDDRv){JOptionPane.showMessageDialog(null, "Please make sure to check the right Account entered!");}
        if(DDDRv){
        JOptionPane.showMessageDialog(null, "Account checked Success!");
        userSched.setEnabled(false);
        passSched.setEnabled(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        DN.setVisible(true);
        DE.setVisible(true);
        Start.setVisible(true);
        End.setVisible(true);
        n.setVisible(false);
        m.setVisible(false);
        sub.setVisible(true);
        accept.setVisible(true);
        Sign.setVisible(true);
        ED.setVisible(true);
        MN.setVisible(true);
        AN.setVisible(true);
        MDN.setVisible(true);
        Sign.setVisible(true);
        jButton1.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AvailabilitySetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvailabilitySetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvailabilitySetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvailabilitySetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailabilitySetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AN;
    private javax.swing.JTextField DE;
    private javax.swing.JTextField DN;
    private javax.swing.JButton ED;
    private javax.swing.JComboBox<String> End;
    private javax.swing.JButton MDN;
    private javax.swing.JButton MN;
    private javax.swing.JTextField Sign;
    private javax.swing.JComboBox<String> Start;
    private javax.swing.JButton accept;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField m;
    private javax.swing.JTextField n;
    private javax.swing.JTextField passSched;
    private javax.swing.JButton sub;
    private javax.swing.JTextField userSched;
    // End of variables declaration//GEN-END:variables
}