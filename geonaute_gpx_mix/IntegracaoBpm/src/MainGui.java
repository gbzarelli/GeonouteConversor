
import br.com.helpdev.ControllerGpx;
import br.com.helpdev.ControllerHRM;
import br.com.helpdev.ControllerMix;
import br.com.helpdev.objetos.gpx.Gpx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guilherme
 */
public class MainGui extends javax.swing.JFrame {

    private JFileChooser jfc;
    private String enderecoHRM;
    private File fileGpx;
    private File fileGpxSaida;

    public MainGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfEnderecoHRM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfLocalGPX = new javax.swing.JTextField();
        btBuscarEntrada = new javax.swing.JButton();
        btProcessar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tLog = new javax.swing.JTextArea();
        btBuscarSaida = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfLocalGPXSaida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Endereço publico Geonaute:");

        jLabel2.setText("Local do arquivo GPX:");

        btBuscarEntrada.setText("Buscar");
        btBuscarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEntradaActionPerformed(evt);
            }
        });

        btProcessar.setText("Processar");
        btProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcessarActionPerformed(evt);
            }
        });

        tLog.setColumns(20);
        tLog.setLineWrap(true);
        tLog.setRows(5);
        tLog.setToolTipText("Log");
        tLog.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));
        tLog.setEnabled(false);
        tLog.setFocusable(false);
        tLog.setOpaque(false);
        jScrollPane1.setViewportView(tLog);

        btBuscarSaida.setText("Definir");
        btBuscarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarSaidaActionPerformed(evt);
            }
        });

        jLabel4.setText("Local de saida GPX:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btProcessar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEnderecoHRM)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfLocalGPX, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscarEntrada))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfLocalGPXSaida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscarSaida)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfEnderecoHRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfLocalGPX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfLocalGPXSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcessarActionPerformed
        enderecoHRM = tfEnderecoHRM.getText();
        if (enderecoHRM == null || enderecoHRM.length() <= 0) {
            return;
        }
        if (fileGpx == null) {
            return;
        }
        if (fileGpxSaida == null) {
            return;
        }
        try {
            ArrayList<Integer> batimentos = ControllerHRM.getDadosGeonaute(enderecoHRM);
            if (batimentos == null || batimentos.isEmpty()) {
                return;
            }

            Gpx gpx = ControllerGpx.getGpxFromFile(fileGpx);
            gpx = ControllerMix.integrarBatimentos(gpx, batimentos);

            ControllerGpx.gravarGpx(gpx, fileGpxSaida);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btProcessarActionPerformed

    private void btBuscarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEntradaActionPerformed
        jfc = new JFileChooser();
        jfc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jfc.getSelectedFile() != null) {
                    fileGpx = jfc.getSelectedFile();
                    tfLocalGPX.setText(fileGpx.getAbsolutePath());
                }
            }
        });
        FileFilter ff = new FileFilter() {

            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".gpx") || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return ".gpx";
            }
        };
        if (fileGpx != null) {
            jfc.setCurrentDirectory(fileGpx);
        }
        jfc.setFileFilter(ff);
        jfc.showOpenDialog(btBuscarEntrada);
    }//GEN-LAST:event_btBuscarEntradaActionPerformed

    private void btBuscarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarSaidaActionPerformed
        jfc = new JFileChooser();
        jfc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jfc.getSelectedFile() != null) {
                    fileGpxSaida = jfc.getSelectedFile();
                    if (!fileGpxSaida.getAbsolutePath().endsWith(".gpx")) {
                        fileGpxSaida = new File(fileGpxSaida + ".gpx");
                    }
                    tfLocalGPXSaida.setText(fileGpxSaida.getAbsolutePath());
                }
            }
        });
        FileFilter ff = new FileFilter() {

            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }

            @Override
            public String getDescription() {
                return ".gpx";
            }
        };
        if (fileGpxSaida != null) {
            jfc.setCurrentDirectory(fileGpxSaida);
        }
        if (fileGpx != null) {
            jfc.setCurrentDirectory(fileGpx);
        }
        jfc.setFileFilter(ff);
        jfc.showOpenDialog(btBuscarEntrada);
    }//GEN-LAST:event_btBuscarSaidaActionPerformed

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
                // System.out.println(info.getName());
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarEntrada;
    private javax.swing.JButton btBuscarSaida;
    private javax.swing.JButton btProcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tLog;
    private javax.swing.JTextField tfEnderecoHRM;
    private javax.swing.JTextField tfLocalGPX;
    private javax.swing.JTextField tfLocalGPXSaida;
    // End of variables declaration//GEN-END:variables

}
