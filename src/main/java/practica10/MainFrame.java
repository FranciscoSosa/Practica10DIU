package practica10;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
        
        compressListModel = new DefaultListModel();
        compressList.setModel(compressListModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        compressList = new javax.swing.JList<>();
        pathTextField = new javax.swing.JTextField();
        name1Label = new javax.swing.JLabel();
        name2Label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openOption = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        compressOption = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        quitOption = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        helpOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Compresión de archivos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        compressList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                compressListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(compressList);

        pathTextField.setEnabled(false);

        name1Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        name1Label.setText("Francisco Jose Santana Sosa");
        name1Label.setToolTipText("");

        name2Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        name2Label.setText("Felipe Santana Hernández");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1Label)
                    .addComponent(name2Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name2Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones");

        openOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openOption.setText("Abrir");
        openOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openOptionActionPerformed(evt);
            }
        });
        jMenu1.add(openOption);
        jMenu1.add(jSeparator1);

        compressOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        compressOption.setText("Comprimir");
        compressOption.setEnabled(false);
        compressOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compressOptionActionPerformed(evt);
            }
        });
        jMenu1.add(compressOption);
        jMenu1.add(jSeparator2);

        quitOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        quitOption.setText("Salir");
        quitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitOptionActionPerformed(evt);
            }
        });
        jMenu1.add(quitOption);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        helpOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        helpOption.setText("Acerca de");
        helpOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpOptionActionPerformed(evt);
            }
        });
        jMenu2.add(helpOption);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void compressOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compressOptionActionPerformed
        String filename = JOptionPane.showInputDialog(rootPane, "Introduzca el nombre para el fichero comprimido");
        
        if(filename != null){
            int res = fileChooser.showSaveDialog(null);
            if(res == JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser.getSelectedFile();
                
                CompressFrame compressFrame = new CompressFrame(compressList.getSelectedValuesList(),
                                                                absolutePath,
                                                                selectedFile.getAbsolutePath(),
                                                                filename);
                compressFrame.setVisible(true);               
                compressFrame.compress();
                
                compressListModel.removeAllElements();
                pathTextField.setText("");
                
            }
        }
    }//GEN-LAST:event_compressOptionActionPerformed

    private void quitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitOptionActionPerformed
        int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir de la aplicación?", "Salir aplicación", JOptionPane.YES_NO_OPTION);      
        
        if(confirm == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_quitOptionActionPerformed

    private void openOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openOptionActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int res = fileChooser.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION){
            File directory = fileChooser.getSelectedFile();
            absolutePath = directory.getAbsolutePath();
            
            pathTextField.setText(absolutePath);
            compressListModel.removeAllElements();
            for (File file : directory.listFiles()) {
                if(file.isFile()){
                    compressListModel.addElement(file.getName());
                }
            }
        }
    }//GEN-LAST:event_openOptionActionPerformed

    private void compressListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_compressListValueChanged
        if(!evt.getValueIsAdjusting()){
            compressOption.setEnabled(compressList.getSelectedValuesList().size() > 0);
        }
    }//GEN-LAST:event_compressListValueChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir de la aplicación?", "Salir aplicación", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void helpOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpOptionActionPerformed
       JOptionPane.showMessageDialog(rootPane, "La aplicación permite comprimir archivos seleccionados", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpOptionActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> compressList;
    private javax.swing.JMenuItem compressOption;
    private javax.swing.JMenuItem helpOption;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel name1Label;
    private javax.swing.JLabel name2Label;
    private javax.swing.JMenuItem openOption;
    private javax.swing.JTextField pathTextField;
    private javax.swing.JMenuItem quitOption;
    // End of variables declaration//GEN-END:variables
    private final JFileChooser fileChooser = new JFileChooser();
    private final DefaultListModel compressListModel;
    private String absolutePath;
}
