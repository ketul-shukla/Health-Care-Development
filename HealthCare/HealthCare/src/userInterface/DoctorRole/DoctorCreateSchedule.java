/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorRole;

import business.UserAccount.UserAccount;
import business.WorkQueue.Schedule;
import business.WorkQueue.ScheduleDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class DoctorCreateSchedule extends javax.swing.JPanel {

    /**
     * Creates new form DoctorCreateSchedule
     */
    JPanel doctorContainerRightJPanel;
   // DoctorRole doctor;
    UserAccount userAccount;
    ScheduleDirectory scheduleDirectory;
    

    DoctorCreateSchedule(JPanel container, UserAccount userAccount, ScheduleDirectory scheduleDirectory) {
        initComponents();
        this.doctorContainerRightJPanel=container;
        this.userAccount = userAccount;
        this.scheduleDirectory=scheduleDirectory;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        hoursLabel = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        locationLabel = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        banner = new javax.swing.JLabel();
        btnCreateSchedule = new javax.swing.JButton();
        dateField = new org.jdesktop.swingx.JXDatePicker();
        btnBack = new javax.swing.JButton();
        txtTime = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(51, 204, 255));

        dateLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateLabel.setText("Date:");

        timeLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLabel.setText("Time:");

        hoursLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hoursLabel.setText("Hours:");

        txtHours.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        locationLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        locationLabel.setText("Location:");

        txtLocation.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        banner.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        banner.setText("Create Schedule");

        btnCreateSchedule.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnCreateSchedule.setText("Create Schedule");
        btnCreateSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateScheduleActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9:00AM", "10:00AM", "11:00AM", "12:00PM", "1:00PM", "2:00PM", "3:00PM", "4:00PM", "5:00PM" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(banner))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(320, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(locationLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHours)
                                    .addComponent(txtLocation)
                                    .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(txtTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCreateSchedule)))))
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoursLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationLabel))
                .addGap(46, 46, 46)
                .addComponent(btnCreateSchedule)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    private void btnCreateScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateScheduleActionPerformed
        // TODO add your handling code here:
        
        Schedule schedule = userAccount.getScheduleDirectory().add();
        String timeabb=(String) txtTime.getSelectedItem();
        timeabb=timeabb.substring(0, timeabb.length() - 5);
        
        schedule.setDate(dateField.getDate());
        schedule.setAvailHours(Float.parseFloat(txtHours.getText()));
        schedule.setLocation(txtLocation.getText());
        schedule.setTime(timeabb);
        
        txtHours.setText(null);
        txtLocation.setText(null);
        txtTime.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_btnCreateScheduleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        doctorContainerRightJPanel.remove(this);
        CardLayout layout = (CardLayout) doctorContainerRightJPanel.getLayout();
        layout.previous(doctorContainerRightJPanel);
        
    }//GEN-LAST:event_btnBackActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateSchedule;
    private org.jdesktop.swingx.JXDatePicker dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JComboBox txtTime;
    // End of variables declaration//GEN-END:variables
}
