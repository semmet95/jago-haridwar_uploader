package com.devamit.uploadclient;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.ProgressListener;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class InputMetadata extends javax.swing.JFrame implements ProgressListener {

    private final MetadataInsertion context;
    private final int folder;

    public InputMetadata(MetadataInsertion c, int f) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputMetadata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        context = c;
        folder = f;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        yearInput = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        monthInput = new javax.swing.JTextField();
        dateInput = new javax.swing.JTextField();
        message = new javax.swing.JLabel();
        insertMetadata = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        numInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Insert Year");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Insert Month");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Insert Date");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        insertMetadata.setText("Insert Metadata");
        insertMetadata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insertMetadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertMetadataActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Insert Number of Images");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yearInput))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthInput))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(numInput, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(insertMetadata, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(numInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertMetadata)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertMetadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertMetadataActionPerformed
        if (insertMetadata.getText().equals("Done")) {
            dispose();
        } else {
            message.setText("Uploading, please wait");
            if (checkValidity()) {
                try {
                    insertMetadata.setEnabled(false);
                    PutObjectRequest request;
                    switch (folder) {
                        case 0:
                            request = new PutObjectRequest("jagofinal/Current_",
                                    "Metadata.txt", createFile()).withCannedAcl(CannedAccessControlList.PublicRead);
                            request.setProgressListener(this);
                            JagoHaridwarUploader.s3client.putObject(request);
                            break;
                        case 1:
                            request = new PutObjectRequest("jagofinal/Previous_1",
                                    "Metadata.txt", createFile()).withCannedAcl(CannedAccessControlList.PublicRead);
                            request.setProgressListener(this);
                            JagoHaridwarUploader.s3client.putObject(request);
                            break;
                        case 2:
                            request = new PutObjectRequest("jagofinal/Previous_2",
                                    "Metadata.txt", createFile()).withCannedAcl(CannedAccessControlList.PublicRead);
                            request.setProgressListener(this);
                            JagoHaridwarUploader.s3client.putObject(request);
                            break;
                        case 3:
                            request = new PutObjectRequest("jagofinal/Previous_3",
                                    "Metadata.txt", createFile()).withCannedAcl(CannedAccessControlList.PublicRead);
                            request.setProgressListener(this);
                            JagoHaridwarUploader.s3client.putObject(request);
                            break;
                        case 4:
                            request = new PutObjectRequest("jagofinal/Previous_4",
                                    "Metadata.txt", createFile()).withCannedAcl(CannedAccessControlList.PublicRead);
                            request.setProgressListener(this);
                            JagoHaridwarUploader.s3client.putObject(request);
                    }
                } catch (SdkClientException e) {
                    insertMetadata.setEnabled(true);
                    System.out.println(e);
                    message.setText("cannot upload file, check your internet connection and retry");
                }
            } else {
                message.setText("Invalid date/month/year/number data");
            }
        }
    }//GEN-LAST:event_insertMetadataActionPerformed

    private boolean checkValidity() {
        try {
            int date = Integer.parseInt(dateInput.getText());
            int month = Integer.parseInt(monthInput.getText());
            int year = Integer.parseInt(yearInput.getText());
            int num = Integer.parseInt(numInput.getText());
            boolean res1 = (date > 0) && (date < 32);
            boolean res2 = (month > 0) && (month <= 12);
            boolean res3 = (year > 2016);
            return res1 && res2 && res3 && (num > 0);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private File createFile() {
        FileWriter fw = null;
        try {
            File Metadata = new File("Metadata.txt");
            fw = new FileWriter(Metadata);
            String fullDate = yearInput.getText() + (monthInput.getText().length()<2 ? "0" : "")
                    + monthInput.getText() + (Integer.parseInt(dateInput.getText()) < 10&&!dateInput.getText().contains("0") ? "0" : "") + dateInput.getText();
            MetadataInsertion.dates[folder]=fullDate;
            fw.append(fullDate);
            fw.append('\n');
            fw.append(numInput.getText());
            return Metadata;
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                return null;
            }
        }

    }

    @Override
    public void dispose() {
        context.setVisible(true);
        super.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateInput;
    private javax.swing.JButton insertMetadata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel message;
    private javax.swing.JTextField monthInput;
    private javax.swing.JTextField numInput;
    private javax.swing.JTextField yearInput;
    // End of variables declaration//GEN-END:variables

    @Override
    public void progressChanged(ProgressEvent progressEvent) {
        System.out.println(progressEvent.getBytesTransfered());
        if (progressEvent.getEventCode() == ProgressEvent.COMPLETED_EVENT_CODE) {
            insertMetadata.setEnabled(true);
            message.setText("Uploaded");
            insertMetadata.setText("Done");
        }
    }
}
