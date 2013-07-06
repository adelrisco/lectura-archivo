/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Test.java
 *
 * Created on 13-may-2013, 20:22:28
 */

package Desarrollo;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author alexanderdelriscomorales
 */
public class Test extends javax.swing.JDialog {

    public int num,numLong;
    public int total;
    public String totalBits;
    static int a;
    
    
    /** Creates new form Test */
    public Test(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(630, 132);
        this.setTitle("Pruebas Estadisticas del NIST");
               
    }

    


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    
    public void textFieldNumeroBitsMouseClicked(java.awt.event.MouseEvent evt){

            String cad = textFieldLongitdCadena.getText();
            String cad1=textFieldNumeroCadenas.getText();

         try{

            numLong = Integer.parseInt(cad);
            num = Integer.parseInt(cad1);
            a=num;
            total=num*numLong;
            totalBits = Integer.toString(total);
            textFieldNumeroBits.setText(totalBits);
            }catch(Exception e){
            textFieldLongitdCadena.setText("\nlongitud de la cadena");
            textFieldNumeroCadenas.setText("\nnumero de cadenas");
            textFieldNumeroBits.setText("NO REGISTRO LOS DATOS");
           }

    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPruebasNist = new javax.swing.JTextArea();
        textFieldNumeroCadenas = new org.edisoncor.gui.textField.TextField();
        textFieldLongitdCadena = new org.edisoncor.gui.textField.TextField();
        textFieldNumeroBits = new org.edisoncor.gui.textField.TextField();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        jButtonTestSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura1.jpg"))); // NOI18N

        jTextAreaPruebasNist.setColumns(20);
        jTextAreaPruebasNist.setEditable(false);
        jTextAreaPruebasNist.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPruebasNist);

        textFieldNumeroCadenas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNumeroCadenas.setText("Ingrese el numero de cadenas");
        textFieldNumeroCadenas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNumeroCadenasMouseClicked(evt);
            }
        });
        textFieldNumeroCadenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroCadenasActionPerformed(evt);
            }
        });
        textFieldNumeroCadenas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNumeroCadenasKeyTyped(evt);
            }
        });

        textFieldLongitdCadena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldLongitdCadena.setText("Ingrese Longitud de cadena");
        textFieldLongitdCadena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldLongitdCadenaMouseClicked(evt);
            }
        });
        textFieldLongitdCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldLongitdCadenaActionPerformed(evt);
            }
        });
        textFieldLongitdCadena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldLongitdCadenaKeyTyped(evt);
            }
        });

        textFieldNumeroBits.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNumeroBits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNumeroBitsMouseClicked(evt);
            }
        });
        textFieldNumeroBits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroBitsActionPerformed(evt);
            }
        });

        labelMetric1.setText("Numero de Cadenas");

        labelMetric2.setText("Longitud Cadena");

        labelMetric3.setText("Numero de Bitis");

        labelMetric4.setText("Pruebas Estadisticas del NIST");

        jButtonTestSiguiente.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jButtonTestSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTestSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tick (1).png"))); // NOI18N
        jButtonTestSiguiente.setText("Siguiente");
        jButtonTestSiguiente.setBorder(null);
        jButtonTestSiguiente.setContentAreaFilled(false);
        jButtonTestSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTestSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTestSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestSiguienteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panel1Layout = new org.jdesktop.layout.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelMetric4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(42, 42, 42)
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(textFieldNumeroCadenas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(labelMetric1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panel1Layout.createSequentialGroup()
                        .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(textFieldLongitdCadena, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(labelMetric2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(textFieldNumeroBits, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(labelMetric3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(jButtonTestSiguiente))
                .add(36, 36, 36))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1Layout.createSequentialGroup()
                .add(67, 67, 67)
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelMetric1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelMetric2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelMetric3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelMetric4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panel1Layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .add(panel1Layout.createSequentialGroup()
                        .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(textFieldNumeroCadenas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textFieldNumeroBits, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textFieldLongitdCadena, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 72, Short.MAX_VALUE)
                        .add(jButtonTestSiguiente)
                        .add(64, 64, 64))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void textFieldLongitdCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLongitdCadenaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_textFieldLongitdCadenaActionPerformed

    private void textFieldNumeroBitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroBitsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textFieldNumeroBitsActionPerformed

    private void jButtonTestSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestSiguienteActionPerformed
        // TODO add your handling code here:
        
           
    }//GEN-LAST:event_jButtonTestSiguienteActionPerformed

    private void textFieldNumeroCadenasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNumeroCadenasMouseClicked
        // TODO add your handling code here:
        textFieldNumeroCadenas.setText("");
        

    }//GEN-LAST:event_textFieldNumeroCadenasMouseClicked

    private void textFieldLongitdCadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldLongitdCadenaMouseClicked
        // TODO add your handling code here:
        textFieldLongitdCadena.setText("");
        
    }//GEN-LAST:event_textFieldLongitdCadenaMouseClicked

    private void textFieldNumeroCadenasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNumeroCadenasKeyTyped
        // TODO add your handling code here:
        
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||(caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }

    }//GEN-LAST:event_textFieldNumeroCadenasKeyTyped

    private void textFieldLongitdCadenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldLongitdCadenaKeyTyped
        // TODO add your handling code here:
        
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||(caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_textFieldLongitdCadenaKeyTyped
/*
    private void textFieldNumeroBitsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNumeroBitsMouseClicked
        // TODO add your handling code here:
            String cad = textFieldLongitdCadena.getText();
            String cad1=textFieldNumeroCadenas.getText();
                     
         try{
            
            numLong = Integer.parseInt(cad);
            num = Integer.parseInt(cad1);
            total=num*numLong;
            totalBits = Integer.toString(total);
            textFieldNumeroBits.setText(totalBits);
		
           }catch(Exception e){
            textFieldLongitdCadena.setText("\nlongitud de la cadena");
            textFieldNumeroCadenas.setText("\nnumero de cadenas");
            textFieldNumeroBits.setText("NO REGISTRO LOS DATOS");
           }

    }//GEN-LAST:event_textFieldNumeroBitsMouseClicked
*/
    private void textFieldNumeroCadenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroCadenasActionPerformed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_textFieldNumeroCadenasActionPerformed


    

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Test dialog = new Test(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonTestSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaPruebasNist;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.panel.Panel panel1;
    public org.edisoncor.gui.textField.TextField textFieldLongitdCadena;
    public org.edisoncor.gui.textField.TextField textFieldNumeroBits;
    public org.edisoncor.gui.textField.TextField textFieldNumeroCadenas;
    // End of variables declaration//GEN-END:variables

}