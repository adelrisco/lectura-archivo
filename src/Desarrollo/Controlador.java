/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Desarrollo;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

/**
 *
 * @author alexanderdelriscomorales
 */
public class Controlador implements ActionListener{


    private Vprincipal view;
    public int num,numLong;
    public int miCadena;
    public int numCadenas;
    public String cad;



    lecturaAleatoria arc = new lecturaAleatoria();

    //formularios hijos
    Cadena frmcad = new Cadena(view,true);
    Test frmtest = new Test(view,true);
    acercade wtf = new acercade(view,true);


    public Controlador(Vprincipal vista){
        this.view = vista;
        iniciar();

    }

    public void go(){
        this.view.setVisible(true);

    }

    private void iniciar(){


        //se anade las acciones a los controles del formulario padre
        this.view.botonCadenas.setActionCommand("Mostrar Cadenas");
        this.view.botonSalir.setActionCommand("Cerrar Sesion");
        this.view.botonPruebasNist.setActionCommand("Pruebas del NIST");
        this.view.botonCifrador.setActionCommand("Cifrar Mensaje");
        this.view.botonAcercade.setActionCommand("Acerca de");
        this.view.botonAdministracion.setActionCommand("Configurar Archivo");
        this.frmtest.textFieldNumeroCadenas.setActionCommand("Numero de cadenas");
        this.frmtest.textFieldLongitdCadena.setActionCommand("Longitud Cadena");
        this.frmtest.textFieldNumeroBits.setActionCommand("Mostrar Numero de Bits");
        this.frmtest.jButtonTestSiguiente.setActionCommand("Mostrar frame Cadena");
        this.frmcad.textFieldCadenaAnalizada.setActionCommand("Numero Cadena Analizada");
        this.frmcad.textFieldNumeroDecimal.setActionCommand("Mostrar Numero Decimal");
        this.frmcad.jButtonCadenaSiguiente.setActionCommand("Mostrar siguiente");

        


        //se pone a escuchar las acciones del usuario
        view.botonCadenas.addActionListener(this);
        view.botonSalir.addActionListener(this);
        view.botonPruebasNist.addActionListener(this);
        view.botonCifrador.addActionListener(this);
        view.botonAcercade.addActionListener(this);
        view.botonAdministracion.addActionListener(this);
        frmtest.textFieldNumeroCadenas.addActionListener(this);
        frmtest.textFieldLongitdCadena.addActionListener(this);
        frmtest.textFieldNumeroBits.addActionListener(this);
        frmtest.jButtonTestSiguiente.addActionListener(this);
        frmcad.textFieldCadenaAnalizada.addActionListener(this);
        frmcad.textFieldNumeroDecimal.addActionListener(this);
        frmcad.jButtonCadenaSiguiente.addActionListener(this);

    }

    //Atento a las acciones del usuario

    @Override
    public void actionPerformed(ActionEvent e){

    //Captura en string el comando accionado por el usuario

        String comando = e.getActionCommand();
    //---------------------------------------------

        /*Acciones del formulario padre*/
        if(comando.equals("Mostrar Cadenas")){

           int cds= Test.a;
           String cads= Integer.toString(cds);
           frmcad.textFieldNumCadenasCadena.setText(cads);
           frmcad.setVisible(true);

        }
        if(comando.equals("Pruebas del NIST")){
            //try {
                //ScriptEngineManager mgr = new ScriptEngineManager();
                //ScriptEngine engine = mgr.getEngineByName("JavaScript");
                
                frmtest.jTextAreaPruebasNist.setText("1 ApproximateEntropy\n" +
                        "2 BlockFrequency\n" +
                        "3 CumulativeSums\n" +
                        "4 FFT\n" +
                        "5 Frequency\n" +
                        "6 LinearComplexity\n" +
                        "7 LongestRun\n" +
                        "8 NonOverlappingTemplate\n" +
                        "9 OverlappingTemplate\n" +
                        "10 RandomExcursions\n" +
                        "11 RandomExcursionsVariant\n" +
                        "12 Rank\n" +
                        "13 Runs\n" +
                        "14 Serial\n" +
                        "15 Universal");

                   
                frmtest.textFieldNumeroBits.setText("Haga clic para ver resultado");
                
                frmtest.setVisible(true);
                
             

        }

        if(comando.equals("Cifrar Mensaje")){

        }

        

    }



}
