package practica10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class ProgressFrame extends javax.swing.JFrame {

    private class Worker extends SwingWorker<Void, Void>{

        public Worker(ProgressFrame progressFrame){
            cancelled = false;
            newFile = newPath + "/" + filename;
            this.progressFrame = progressFrame;
        }
        
        @Override
        protected Void doInBackground() throws Exception {   
            try
            {
                int compressedFiles = 0;
                // Objeto para referenciar a los archivos que queremos comprimir
                BufferedInputStream origin = null;
                // Objeto para referenciar el archivo zip de salida
                FileOutputStream dest = new FileOutputStream(newFile);
                ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
                // Buffer de transferencia para almacenar datos a comprimir
                byte[] data = new byte[BUFFER_SIZE];

                Iterator i = files.iterator();
                while(i.hasNext())
                {   
                    String filename = (String)i.next();
                    FileInputStream fi = new FileInputStream(oldPath + "/" + filename);
                    origin = new BufferedInputStream(fi, BUFFER_SIZE);
                    
                    ZipEntry entry = new ZipEntry( filename );
                    out.putNextEntry( entry );
                    
                    // Leemos datos desde el archivo origen y se envían al archivo destino
                    int count;
                    while((count = origin.read(data, 0, BUFFER_SIZE)) != -1)
                    {
                        out.write(data, 0, count);
                    }
                    
                    compressedFiles++;
                    int percent = (compressedFiles * 100) / files.size();
                    progressBar.setValue(percent);
                    Thread.sleep(100);
                    
                    // Cerramos el archivo origen, ya enviado a comprimir
                    origin.close();
                }
                // Cerramos el archivo zip
                out.close();
            }
            catch( IOException e )
            {
                e.printStackTrace();
            }
            return null;
        }
        
        
        @Override
        public void done(){
            progressFrame.dispose();
            
            String message;
            String title;
            
            if(!cancelled){
                message = "La compresión ha finalizado con éxito.";
                title = "Éxito";
            }else{
                message = "La compresión se ha cancelado correctamente";
                title = "Cancelación";
            }
            
            JOptionPane.showMessageDialog(rootPane, message, title, JOptionPane.INFORMATION_MESSAGE);
        }
        
        private boolean cancelled;
        private final String newFile;
        private final ProgressFrame progressFrame;
    }
    
    public ProgressFrame(List<String> files, String oldPath, String newPath, String filename) {
        initComponents();
        
        this.files = files;
        this.oldPath = oldPath;
        this.newPath = newPath;
        this.filename = filename;
        this.worker = new Worker(this);
        
        progressBar.setStringPainted(true);
    }

    public void compress(){
        worker.execute();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setTitle("Comprimiendo archivos");
        setResizable(false);

        jLabel1.setText("Comprimiendo ...");

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton)
                    .addComponent(jLabel1)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        worker.cancelled = true;
        worker.cancel(true);
        
        File file = new File(worker.newFile);
        file.delete();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
    private final Worker worker;
    private final List<String> files;
    private final String oldPath;
    private final String newPath;
    private final String filename;
    private final int BUFFER_SIZE = 4096;
}
