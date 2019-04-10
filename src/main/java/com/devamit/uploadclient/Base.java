package com.devamit.uploadclient;

class Base extends javax.swing.JFrame {

    public Base() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertMetadata = new javax.swing.JButton();
        insertImages = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Jago Haridwar Uploader");
        setLocationByPlatform(true);
        setResizable(false);

        insertMetadata.setText("Insert Metadata");
        insertMetadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertMetadataActionPerformed(evt);
            }
        });

        insertImages.setText("Insert Images");
        insertImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertImagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertMetadata, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addComponent(insertImages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertMetadata, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertImages, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertMetadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertMetadataActionPerformed
        Base obj=this;
        java.awt.EventQueue.invokeLater(() -> {
            obj.setVisible(false);
            new MetadataInsertion(obj).setVisible(true);
        });
    }//GEN-LAST:event_insertMetadataActionPerformed

    private void insertImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertImagesActionPerformed
        Base obj=this;
        java.awt.EventQueue.invokeLater(() -> {
            obj.setVisible(false);
            new ImagesInsertion(obj).setVisible(true);
        });
    }//GEN-LAST:event_insertImagesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertImages;
    private javax.swing.JButton insertMetadata;
    // End of variables declaration//GEN-END:variables
}
