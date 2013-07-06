/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Desarrollo;

/**
 *
 * @author alexanderdelriscomorales
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vprincipal vista = new Vprincipal();
        new Controlador(vista).go();
        
    }

}
