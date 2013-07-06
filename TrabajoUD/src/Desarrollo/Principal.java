package Desarrollo;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoJList();
                Vprincipal vista = new Vprincipal();
                new Controlador(vista).go();
                
                //Archivo a = new Archivo();
				//Archivo m = new Archivo();
				//lecturaAleatoria z = new lecturaAleatoria();
				//String y = z.LeerRA("/Users/alexanderdelriscomorales/Documents/MATLAB/list.txt");
				//Frecuencia f = new Frecuencia();
				//String m = f.testFrecuencias("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Frequency/stats.txt");
				
				new generalArchivo();
				//String m = f.testFrecuencias("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/Frequency/stats.txt");
				//ArchivosDirectorio f = new ArchivosDirectorio();
				//f.carpeta();
				Bina_Deci x = new Bina_Deci("1001000111010001001100011000011001100111000111010000000110101011101110111011111000000101001110110100110111111011000010100000000011010001101110010110011010001111000000110100011000110111110110100110100011110000010010011000010111001011010000101100000001001110001110101010011011000010101101101000100101010010010010110111001010100110000101001111001101001011011011010010110100101001011001010001111101011000100000110111100011000111010000011010101001010100000011001001000010000110100111000010010011100101111011010101001010101111011101001010010100100001111101111110000001101101011000001011110001100000101001001110110111110101011001111100110110011010111010011011001010100011111000010011100010101110110011010001110001110101000000011001110111101110000011001110100000011011111000100010010100011100001110011111101000010000110000011101111110111110111101010000011011100100101101011001010001010011011011000100100011000011000101101100001100010101000111110101100011100000110011011001011000101001010100000100000101001111");
				
				int j = x.Calcular();
                                
				
				//System.out.println("esto es " + j);
				
				
				//String l = a.leer("/Users/alexanderdelriscomorales/Documents/MATLAB/list.txt");
				
				
			    
				
				//String l = a.leerGrafico();
				//long cont = m.contarLineas();
				
				//System.out.println(l);
				System.out.println("");
				System.out.println("");
				//System.out.println("El numero de carcteres de archivo es:" + l.length());
				//System.out.println("El numero de carcteres de archivo es:" + y.length());
				//System.out.println("");
				//System.out.println("");
				System.out.println("El numero es:" + j);
				
				
				//System.out.println("El fichero tiene " + cont + " lineas");
				
				
			}


	}


