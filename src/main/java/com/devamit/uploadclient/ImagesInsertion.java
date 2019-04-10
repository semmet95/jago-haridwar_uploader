package com.devamit.uploadclient;

class ImagesInsertion extends javax.swing.JFrame {
    Base context;
    public ImagesInsertion(Base c) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImagesInsertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        context=c;
        initComponents();
    }

    @Override
    public void dispose() {
        context.setVisible(true);
        super.dispose(); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertCurrent1 = new javax.swing.JButton();
        insertCurrent = new javax.swing.JButton();
        insertPrevious1 = new javax.swing.JButton();
        insertPrevious2 = new javax.swing.JButton();
        insertPrevious3 = new javax.swing.JButton();
        insertPrevious4 = new javax.swing.JButton();

        insertCurrent1.setText("Insert Current Metadata");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        insertCurrent.setText("Insert Current Images");
        insertCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCurrentActionPerformed(evt);
            }
        });

        insertPrevious1.setText("Insert Previous Images 1");
        insertPrevious1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPrevious1ActionPerformed(evt);
            }
        });

        insertPrevious2.setText("Insert Previous Images 2");
        insertPrevious2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPrevious2ActionPerformed(evt);
            }
        });

        insertPrevious3.setText("Insert Previous Images 3");
        insertPrevious3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPrevious3ActionPerformed(evt);
            }
        });

        insertPrevious4.setText("Insert Previous Images 4");
        insertPrevious4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPrevious4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertPrevious2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(insertPrevious3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertPrevious4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertPrevious3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertPrevious4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCurrentActionPerformed
        ImagesInsertion obj=this;
        java.awt.EventQueue.invokeLater(() -> {
            obj.setVisible(false);
            new InputImages(obj, 0).setVisible(true);
        });
    }//GEN-LAST:event_insertCurrentActionPerformed

    private void insertPrevious1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPrevious1ActionPerformed
        ImagesInsertion obj=this;
        java.awt.EventQueue.invokeLater(() -> {
            obj.setVisible(false);
            new InputImages(obj, 1).setVisible(true);
        });
    }//GEN-LAST:event_insertPrevious1ActionPerformed

    private void insertPrevious2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPrevious2ActionPerformed
        ImagesInsertion obj=this;
        java.awt.EventQueue.invokeLater(() -> {
            obj.setVisible(false);
            new InputImages(obj, 2).setVisible(true);
        });
    }//GEN-LAST:event_insertPrevious2ActionPerformed

    private void insertPrevious3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPrevious3ActionPerformed
        ImagesInsertion obj=this;
        java.awt.EventQueue.invokeLater(() -> {
            obj.setVisible(false);
            new InputImages(obj, 3).setVisible(true);
        });
    }//GEN-LAST:event_insertPrevious3ActionPerformed

    private void insertPrevious4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPrevious4ActionPerformed
        ImagesInsertion obj=this;
        java.awt.EventQueue.invokeLater(() -> {
            obj.setVisible(false);
            new InputImages(obj, 4).setVisible(true);
        });
    }//GEN-LAST:event_insertPrevious4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertCurrent;
    private javax.swing.JButton insertCurrent1;
    private javax.swing.JButton insertPrevious1;
    private javax.swing.JButton insertPrevious2;
    private javax.swing.JButton insertPrevious3;
    private javax.swing.JButton insertPrevious4;
    // End of variables declaration//GEN-END:variables
}
