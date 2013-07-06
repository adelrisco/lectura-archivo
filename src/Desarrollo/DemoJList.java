/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Desarrollo;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author alexanderdelriscomorales
 */
public class DemoJList extends JFrame
{
    public File[] dirs;

    public DemoJList()
    {
        super("Pruebas del NIST");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        dirs = _obtenerArrayDatos();
        JList lista = new JList(new ArrayModel(dirs));

        JScrollPane scrollLista = new JScrollPane(lista);

        content.add(scrollLista, BorderLayout.CENTER);

        setSize(300,300);
        setVisible(true);

    }

    private File[] _obtenerArrayDatos()
    {
        try{

		File dir = new File("/Users/alexanderdelriscomorales/TRABAJO/sts-2.1.1/experiments/AlgorithmTesting/");

		FileFilter fileFilter = new FileFilter()
                {
                @Override
                    public boolean accept(File file)
                    {
                        return file.isDirectory();
                    }
		};

		dirs = dir.listFiles(fileFilter);

		if (dirs != null)
                {

			for (int m=0; m < dirs.length; m++)
                        {
				int i = m+1;
				String filename = dirs[m].getName();
				System.out.print (i + " " + filename.trim() + "\n");

			}

		}


		}catch(Exception ex){
			System.out.println("Error:"+ex.getMessage());

		}




        return dirs;

    }

}
