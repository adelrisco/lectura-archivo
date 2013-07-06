/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Desarrollo;

import java.io.File;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;


/**
 *
 * @author alexanderdelriscomorales
 */
public class ArrayModel implements ListModel
{
    private File[] dirs;

    public ArrayModel(File[] dirs)
    {
        this.dirs = dirs;
    }

    @Override
    public File getElementAt(int index)
    {
        int m=0;
        String filename = dirs[m].getName();
        return dirs[index];

    }

    @Override
    public int getSize()
    {
        return dirs.length;
    }

    @Override
    public void removeListDataListener(ListDataListener l){}
    @Override
    public void addListDataListener(ListDataListener l){}

}
