package ejemplohilo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
//import java.util.ArrayList;
//import javax.swing.JLabel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Vocales extends javax.swing.JFrame implements Runnable {

    private String vocal = "";
    private int aum = 0;
    boolean b = true;
    private Thread hilo;

    public Vocales() {
        initComponents();
        this.setLocationRelativeTo(null);//La ventana se muestra en el centro de la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        txtVocal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        txtVocal.setFont(new java.awt.Font("Tahoma", 1, 150)); // NOI18N
        txtVocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVocal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(txtVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtVocal, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        if (hilo == null) {
            hilo = new Thread(this);
            hilo.start();

        }
        b = true;
        btnPausar.setEnabled(true);
        btnIniciar.setEnabled(false);

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        b = false;
        btnPausar.setEnabled(false);
        btnIniciar.setEnabled(true);
    }//GEN-LAST:event_btnPausarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        new Vocales().setVisible(true);

    }

    private void calcular(String vocal) {
        InputStream in;
        aum++;
        if (aum == 1) {
            txtVocal.setText("A");

            try {
                in = new FileInputStream(new File("src\\wav\\A.wav"));
                AudioStream ad = new AudioStream(in);

                AudioPlayer.player.start(ad);

            } catch (IOException e) {
                // System.out.println("Error---");
            }

        }
        if (aum == 2) {

            txtVocal.setText("E");
            try {
                in = new FileInputStream(new File("src\\wav\\E.wav"));
                AudioStream ad = new AudioStream(in);

                AudioPlayer.player.start(ad);

            } catch (IOException e) {
                // System.out.println("Error---");
            }

        }
        if (aum == 3) {
            txtVocal.setText("I");
            
            try {
                in = new FileInputStream(new File("src\\wav\\I.wav"));
                AudioStream ad = new AudioStream(in);

                AudioPlayer.player.start(ad);

            } catch (IOException e) {
                // System.out.println("Error---");
            }

        }
        if (aum == 4) {
            txtVocal.setText("O");
           
            try {
                in = new FileInputStream(new File("src\\wav\\O.wav"));
                AudioStream ad = new AudioStream(in);

                AudioPlayer.player.start(ad);

            } catch (IOException e) {
                // System.out.println("Error---");
            }

        }
        if (aum == 5) {
            txtVocal.setText("U");
            try {
                in = new FileInputStream(new File("src\\wav\\U.wav"));
                AudioStream ad = new AudioStream(in);

                AudioPlayer.player.start(ad);

            } catch (IOException e) {
                // System.out.println("Error---");
            }
            aum = 0;
        }

    }

    @Override
    public void run() {

        while (true) {
            if (b) {
                txtVocal.setText(vocal);
                calcular(vocal);
            }
            try {
                hilo.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error");
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JLabel txtVocal;
    // End of variables declaration//GEN-END:variables
}
