package com.devamit.uploadclient;

import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

class InputImages extends javax.swing.JFrame {

    private final ImagesInsertion context;
    private final int folder; //may need it

    public InputImages(ImagesInsertion c, int f) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        context = c;
        folder = f;
        initComponents();
        imagesChooser.setEnabled(false);
        FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return (pathname.getName().toLowerCase().endsWith("jpg") || pathname.getName().toLowerCase().endsWith("jpeg") || pathname.isDirectory());
            }

            @Override
            public String getDescription() {
                return "jpg, jpeg";
            }
        };
        imagesChooser.setFileFilter(ff);
        imagesChooser.setMultiSelectionEnabled(true);
        super.setTitle("Select .jpg images only");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagesChooser = new javax.swing.JFileChooser();
        message = new javax.swing.JLabel();
        insertImages = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        insertImages.setText("Insert Images");
        insertImages.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insertImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertImagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(insertImages, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertImages)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertImagesActionPerformed
        if (insertImages.getText().equals("Insert Images")) {
            message.setText("");
            if (!imagesChooser.isEnabled()) {
                imagesChooser.setEnabled(true);
            }
            int ret = imagesChooser.showOpenDialog(this);
            if (ret == JFileChooser.APPROVE_OPTION) {
                insertImages.setEnabled(false);
                message.setText("Uploading, please wait");
                try {
                    File[] selectedImages = imagesChooser.getSelectedFiles();
                    for (int i=0;i<selectedImages.length;i++) {
                        File x=selectedImages[i];
                        Path source = Paths.get(x.getPath());
                        Path finalFile=Files.move(source, source.resolveSibling(MetadataInsertion.dates[folder]+
                                ((i<9)?"0":"")+(i+1)+".jpg"), REPLACE_EXISTING);
                        if(finalFile!=null) {
                            System.out.println("chaging reference to the new file with name"+finalFile.getFileName().toString());
                            selectedImages[i]=finalFile.toFile();
                            x.delete();
                        }                      
                        /*if (x.getName().indexOf(".") != 10) {
                            message.setText("File name invalid");
                            imagesChooser.setEnabled(true);
                            return;
                        }*/
                    }
                    for (File x : selectedImages) {
                        JagoHaridwarUploader.cloudinary.uploader().upload(x,
                                ObjectUtils.emptyMap());
                    }
                    message.setText("Uploaded");
                    insertImages.setEnabled(true);
                    insertImages.setText("Done");
                } catch (Exception | NoClassDefFoundError ex) {
                    System.out.println("crap baskets");
                    insertImages.setEnabled(true);
                    System.out.println(ex);
                    message.setText("cannot upload file, check your internet connection and retry");
                }
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_insertImagesActionPerformed

    @Override
    public void dispose() {
        context.setVisible(true);
        super.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser imagesChooser;
    private javax.swing.JButton insertImages;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables

}
