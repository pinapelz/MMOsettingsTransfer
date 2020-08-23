/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmosettingsbackup;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pinapelz
 */
public class Mainscreen extends javax.swing.JFrame {

    public boolean ffxivSelected = false;
    public boolean wowSelected = false;
    public ImageIcon wowIcon = new ImageIcon("/images/wowImg.png");
    public ErrorHandler errorHandler = new ErrorHandler();
    public boolean filesAvailable = false;
    public Uploader uploader = new Uploader();
    public File pathToFFXIV = new File("ffxivPath.txt");
    public File pathToWOW = new File("wowPath.txt");
    public Downloader downloader = new Downloader();
    public boolean upload = false;
    public boolean download = false;

    public Mainscreen() {
        initComponents();
        console.setText("Program Ready");
        wowBtn.setBackground(Color.BLACK);
        ffxivBtn.setBackground(Color.BLACK);
        console.setEditable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        ffxivBtn = new javax.swing.JButton();
        wowBtn = new javax.swing.JButton();
        downloadSelect = new javax.swing.JRadioButton();
        uploadSelect = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("MMORPG Game Settings Transfer Macro");

        ffxivBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ffxivLogo.png"))); // NOI18N
        ffxivBtn.setText("Final Fantasy 14");
        ffxivBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffxivBtnActionPerformed(evt);
            }
        });

        wowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wowImg.png"))); // NOI18N
        wowBtn.setText("World of Warcraft");
        wowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wowBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(downloadSelect);
        downloadSelect.setText("Download");
        downloadSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadSelectActionPerformed(evt);
            }
        });

        buttonGroup1.add(uploadSelect);
        uploadSelect.setText("Upload");
        uploadSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSelectActionPerformed(evt);
            }
        });

        jButton3.setText("Start");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        jButton1.setText("Credits");

        jButton2.setText("First Time Using");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ffxivBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(wowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1))
                            .addComponent(jLabel1))
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(downloadSelect)
                            .addComponent(uploadSelect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addContainerGap())
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ffxivBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wowBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadSelect)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(downloadSelect)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setAllButtonsFalse() {
        ffxivSelected = false;
        wowSelected = false;
        enableAllButtons();
    }

    public void enableAllButtons() {
        ffxivBtn.setEnabled(true);
        wowBtn.setEnabled(true);
    }

    private void ffxivBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffxivBtnActionPerformed
        // TODO add your handling code here:
        if (ffxivSelected == true) {
            errorHandler.alreadySelected("Final Fantasy XIV");
        } else {
            setAllButtonsFalse();
            ffxivSelected = true;
            ffxivBtn.setEnabled(false);
            console.setText(console.getText() + "\nFinal Fantasy XIV has been selected.");
        }

    }//GEN-LAST:event_ffxivBtnActionPerformed

    private void wowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wowBtnActionPerformed
        // TODO add your handling code here:
        if (wowSelected == true) {
            errorHandler.alreadySelected("World of Warcraft");
        } else {
            setAllButtonsFalse();
            wowSelected = true;
            wowBtn.setEnabled(false);
            console.setText(console.getText() + "\nWorld of Warcraft has been selected.");
        }
    }//GEN-LAST:event_wowBtnActionPerformed
    private void checkFFXIVPath() {
        if (!pathToFFXIV.exists() || pathToFFXIV.length() == 0) {
            consoleWrite("Need to set FFXIV Path");
            pathToFFXIV = errorHandler.noPath("Final Fantasy XIV");
            try {
                FileOutputStream out = new FileOutputStream("ffxivPath.txt");
                byte[] contentInBytes = pathToFFXIV.getAbsolutePath().getBytes();
                try {
                    out.write(contentInBytes);
                    out.flush();
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (pathToFFXIV == null) {
                return;
            }
            consoleWrite("Path for FFXIV Set!");
        }
    }

    private void checkWOWPath() {
        if (!pathToWOW.exists() || pathToWOW.length() == 0) {
            consoleWrite("Need to set WOW Path");
            pathToWOW = errorHandler.noPath("World of Warcraft");
            try {
                FileOutputStream out = new FileOutputStream("wowPath.txt");
                byte[] contentInBytes = pathToFFXIV.getAbsolutePath().getBytes();
                try {
                    out.write(contentInBytes);
                    out.flush();
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            consoleWrite("Path for WOW Set!");
        }
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (ffxivSelected) {
            checkFFXIVPath();
        }
        if (wowSelected) {
            checkWOWPath();
        }

        if (upload == false && download == false) {
            errorHandler.notChosen();
        }
        if (ffxivSelected == false && wowSelected == false) {
            errorHandler.notChosen();
        }
        if (upload == true && ffxivSelected) {
            uploader.uploadFFXIV();
            consoleWrite("Upload Complete");
                  
        }
        if(download&&ffxivSelected){
            downloader.downloadFFXIV();
            consoleWrite("Download Complete");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static String readFileAsString(String fileName) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }



    private void consoleWrite(String text) {
        console.setText(console.getText() + "\n" + text);
    }
    private void uploadSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadSelectActionPerformed
        // TODO add your handling code here:
        upload = true;
        download = false;
    }//GEN-LAST:event_uploadSelectActionPerformed

    private void downloadSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadSelectActionPerformed
        // TODO add your handling code here:
        download = true;
        upload = false;
    }//GEN-LAST:event_downloadSelectActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "If saving Final Fantasy XIV. Then please go through the backup and restore process once manually using your OneDrive or Google Drive as the storage folder. \nThis is to "
                + "set the location of saving for future use!", "Information", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea console;
    private javax.swing.JRadioButton downloadSelect;
    private javax.swing.JButton ffxivBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton uploadSelect;
    private javax.swing.JButton wowBtn;
    // End of variables declaration//GEN-END:variables
}
