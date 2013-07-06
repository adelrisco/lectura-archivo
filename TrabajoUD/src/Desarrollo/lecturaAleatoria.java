/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Desarrollo;

/**
 *
 * @author alexanderdelriscomorales
 */

import java.awt.Frame;
import java.io.*;
//import java.math.*;
import java.util.*;


public class lecturaAleatoria{


        private Frame view;
        public int miCadena;
	public int numCadenas;
        public String cad;


	public String LeerRA(String cadena)
	{

		RandomAccessFile miRAFile;



		// abrir el archivo
		try {

			Scanner scanner = new Scanner(System.in);
			miRAFile = new RandomAccessFile("/Users/alexanderdelriscomorales/Documents/MATLAB/list.txt","r");
			int n = Test.a;

			numCadenas();
			System.out.print("Ingrese el numero de cadenas que tiene el archivo: ");
			numCadenas = scanner.nextInt();


			String aux="";
			int z = 0;
			int j = 0;
			int i = 1;


			String linea[] = new String[200];
			miRAFile.seek(0);
			miRAFile.length();

			while ((aux = miRAFile.readLine()) != null)
			{


				for(int columna = 0; columna < aux.length(); columna ++)
				{

					aux.substring(columna, columna+1).trim();

				}

				linea[i] = aux;

				i++;
				j++;

			}

			i=1;
			if(i<=100)
			{


				    System.out.print("\nIngrese el numero de la cadena: " );
				    scanner.nextInt();
				    miCadena=z;
				while(z<=0){
					System.out.println("\nIngrese un valor mayor a cero \n"  );
					z = scanner.nextInt();
				}
				while(z>numCadenas)//numCadenas=Test.a
				   {
						System.out.println("\n Ingreso un numero de cadena invalido \n" );
						System.out.println("\nIngrese un valor menor o igual a: " + Test.a + "\n" );//numCadenas
						z = scanner.nextInt();
				   }

				if(z<=numCadenas && z>0)/*numCadenas*/
				{
					j=z;
					i=z;

					cadena = linea[i];
					cad = cadena;
					System.out.println("\n" + "La cadena seleccionada fue :\n" +  cadena + "\n"  );

			   }

			 }


			System.out.println("El numero de cadenas es " +  miRAFile.length()  );

			miRAFile.close();

			return aux;

		}catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}

		return cadena;


	}// fin del m�todo lecturaAleatoria


	public void numCadenas()
	{

		long numBitsCadena = 0;
		long totalBits =0;
		Scanner scanner = new Scanner(System.in);



		System.out.print("\nIngrese el numero de cadenas que tiene el archivo: ");
		numCadenas = scanner.nextInt();
		System.out.print("\nIngrese la longitud de las cadenas: ");
		numBitsCadena = scanner.nextLong();

		totalBits = numCadenas * numBitsCadena;


		System.out.print("\nEl numero de bits va a analizar es: " + totalBits + "\n");
	}
}


