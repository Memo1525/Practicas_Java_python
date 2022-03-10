package com.company;

import java.awt.Color;
import java.awt.Graphics;

    public class GraficaCircular extends javax.swing.JFrame {
        
        public GraficaCircular() {
            initComponents();
            this.setLocationRelativeTo(null);
        }

        boolean bandera = false;

 
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            txt_rojo = new javax.swing.JTextField();
            txt_verde = new javax.swing.JTextField();
            txt_azul = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel1.setText("Color Favorito");

            jLabel2.setText("Rojo:");

            jLabel3.setText("Verde:");

            jLabel4.setText("Azul:");

            jButton1.setText("Graficar");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(143, 143, 143)
                                    .addComponent(jLabel1)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txt_azul))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txt_rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txt_verde)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(55, 55, 55))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txt_rojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txt_verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txt_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            bandera = true;
            repaint();
        }//GEN-LAST:event_jButton1ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
           // codigo copiado  de nimbus 
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(GraficaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(GraficaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(GraficaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(GraficaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new GraficaCircular().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JTextField txt_azul;
        private javax.swing.JTextField txt_rojo;
        private javax.swing.JTextField txt_verde;
        // End of variables declaration//GEN-END:variables

        public void paint(Graphics g){
            super.paint(g);
            if(bandera == true){

                String string_rojo = txt_rojo.getText();
                String string_verde = txt_verde.getText();
                String string_azul = txt_azul.getText();

                int int_rojo = Integer.parseInt(string_rojo);
                int int_verde = Integer.parseInt(string_verde);
                int int_azul = Integer.parseInt(string_azul);

                int total_votos = int_rojo + int_verde + int_azul;

                int grados_rojo = int_rojo * 360 / total_votos;
                int grados_verde = int_verde * 360 / total_votos;
                int grados_azul = int_azul * 360 / total_votos;

                g.setColor(new Color(255, 0, 0));
                g.fillArc(25, 80, 200, 200, 0, grados_rojo);
                g.fillRect(250, 120, 20, 20);
                g.drawString("Color Rojo", 275, 135);

                g.setColor(new Color(0, 130, 0));
                g.fillArc(25, 80, 200, 200, grados_rojo, grados_verde);
                g.fillRect(250, 150, 20, 20);
                g.drawString("Color Verde", 275, 165);

                g.setColor(new Color(0, 0, 255));
                g.fillArc(25, 80, 200, 200, grados_rojo + grados_verde, grados_azul);
                g.fillRect(250, 180, 20, 20);
                g.drawString("Color Azul", 275, 195);
            }
        }
    }



