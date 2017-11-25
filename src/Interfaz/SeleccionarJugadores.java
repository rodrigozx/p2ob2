/** ***************************************************
 * Clase: SeleccionarJugadores
 *
 * @author Rodrigo Blanco - 151251 - Programación II
 * *************************************************
 */
package Interfaz;

import Dominio.Jugador;
import Dominio.Partida;
import Dominio.Sistema;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SeleccionarJugadores extends javax.swing.JFrame {

    private Sistema Modelo;
    private Image stonesIcon = (new ImageIcon("src/Img/stonesicon.png").getImage());
    private ImageIcon background = new ImageIcon("src/Img/background-selecJugadores.png");
    private ImageIcon atrasIco = new ImageIcon("src/Img/volver.png");
    private ImageIcon jugarIco = new ImageIcon("src/Img/jugar.png");
    private ImageIcon expJugIco = new ImageIcon("src/Img/expJugIco.png");
    private Double timeLeft;
    
    public SeleccionarJugadores(Dominio.Sistema elModelo) {
        Modelo = elModelo;

        //Primero seteo la imagen de fondo
        this.setContentPane(new JLabel(background));

        initComponents();
        setLocationRelativeTo(null);//Ventana Centrada
        setResizable(false);//Impedir que se maximice
        setTitle("ESQUINAS - Seleccinar Jugadores");

        //Seteo imagen de icono
        this.setIconImage(stonesIcon);

        //Seteo imagenes de los botones
        jButJugar.setIcon(jugarIco);
        jBAtras.setIcon(atrasIco);

        //seteo el fondo transparente
        jButJugar.setOpaque(false);
        jBAtras.setOpaque(false);

        jButJugar.setContentAreaFilled(false);
        jBAtras.setContentAreaFilled(false);

        jButJugar.setBorderPainted(false);
        jBAtras.setBorderPainted(false);

        //Sin texto
        jButJugar.setText("");
        jBAtras.setText("");

        //tooltips de ayuda
        jButJugar.setToolTipText("Presiona aquí para comenzar la partida!");
        jBAtras.setToolTipText("Cliquea aquí para volver al Menú Principal");

        jButJugar.setEnabled(true);
        jBAtras.setEnabled(true);

        this.getJugadoresList(elModelo.getListaJugadores());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListJugadoresSeleccionados = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListListaJugadores = new javax.swing.JList();
        jButQuitar = new javax.swing.JButton();
        jButAgregar = new javax.swing.JButton();
        jButJugar = new javax.swing.JButton();
        jBAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione los jugadores y luego pulse Jugar.");

        jScrollPane1.setViewportView(jListJugadoresSeleccionados);

        jScrollPane2.setViewportView(jListListaJugadores);

        jButQuitar.setText("<");
        jButQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButQuitarActionPerformed(evt);
            }
        });

        jButAgregar.setText(">");
        jButAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAgregarActionPerformed(evt);
            }
        });

        jButJugar.setText("Jugar");
        jButJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButJugarActionPerformed(evt);
            }
        });

        jBAtras.setText("Atras");
        jBAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jBAtras)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jButQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAtras))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Llenar el JCbox con La lista de jugadores
    DefaultListModel dlmListaJugadores = new DefaultListModel();

    public void getJugadoresList(ArrayList<Jugador> unaListaJugadores) {

        jListListaJugadores.removeAll();
        for (int i = 0; i < unaListaJugadores.size(); i++) {
            dlmListaJugadores.addElement(unaListaJugadores.get(i).getAlias());
        }
        jListListaJugadores.setModel(dlmListaJugadores);
    }


    private void jButQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButQuitarActionPerformed
        /*
         Accion de quitar de la lista de jugadores.
         */

        dlmListaJugadores.addElement(jListJugadoresSeleccionados.getSelectedValue());
        jListListaJugadores.setModel(dlmListaJugadores);
        dlmSeleccionar.removeElement(jListJugadoresSeleccionados.getSelectedValue());

        this.habilitarJugar();
    }//GEN-LAST:event_jButQuitarActionPerformed

    DefaultListModel dlmSeleccionar = new DefaultListModel();
    private void jButAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAgregarActionPerformed
        /*
         Acción al agregar un jugador a la segunda lista pinchando en la primera.
         */
        if (jListListaJugadores.getSelectedValue() != null) {
            if (dlmSeleccionar.getSize() < 2) {
                dlmSeleccionar.addElement(jListListaJugadores.getSelectedValue());
                jListJugadoresSeleccionados.setModel(dlmSeleccionar);
                dlmListaJugadores.removeElement(jListListaJugadores.getSelectedValue());
            } else {
                JOptionPane.showMessageDialog(null, "Solo puede marcar dos Jugadores\n"
                        + "Si lo desea puede marcar uno y quitarlo.");
            }
            this.habilitarJugar();
        }
    }//GEN-LAST:event_jButAgregarActionPerformed

    private Jugador jugadorEnLista(String alias){
                
        ArrayList <Jugador> lista = new ArrayList();
        lista = Modelo.getListaJugadores();
        boolean encontrado = false;
        Jugador elJugador = null;
        
        for (int i = 0; i < lista.size() && !encontrado; i++) {
            if (lista.get(i).getAlias().equals(alias)){
                elJugador = lista.get(i);
                encontrado = true;
            }
        }
        return elJugador;
    }
    
    private void jButJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButJugarActionPerformed
        
        //Accion al presionar el boton Jugar
        //Busco el jugador 1 en la lista original
        Jugador player1 = jugadorEnLista(dlmSeleccionar.get(0).toString());
        Jugador player2;
        
        //Busco el jugador 2 en la lista original
        player2 = jugadorEnLista(dlmSeleccionar.get(1).toString());            

        Partida laPartida = new Partida( player1, player2,1,3);
        Modelo.setPartida(laPartida);

        TableroJuego vTablero = new TableroJuego(Modelo, timeLeft);
        vTablero.setSize(900, 600);
        vTablero.setTitle("Esquinas - Partida en Juego");
        vTablero.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButJugarActionPerformed

    //Acción Boton atras
    private void jBAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtrasActionPerformed
        
        MenuPrincipal vMenuPrinipal = new MenuPrincipal(Modelo);
        vMenuPrinipal.setSize(this.getSize());
        vMenuPrinipal.setVisible(true);
        dispose();

    }//GEN-LAST:event_jBAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    private void habilitarJugar() {
        if (dlmSeleccionar.getSize() == 2){
            jButJugar.setEnabled(true);
        } else {
            jButJugar.setEnabled(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtras;
    private javax.swing.JButton jButAgregar;
    private javax.swing.JButton jButJugar;
    private javax.swing.JButton jButQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jListJugadoresSeleccionados;
    private javax.swing.JList jListListaJugadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}