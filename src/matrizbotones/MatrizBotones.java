package matrizbotones;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Javier E. Tello <devjtello@gmail.com>
 */
public class MatrizBotones 
{
    public static void main(String[] args) 
    {
        //Instancia de la clase frmTablero
        frmTablero tablero = new frmTablero();
        //Se obtienen las dimensiones de la pantalla
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //Se settea la posición inicial de la ventana en el centro de la pantalla
        tablero.setLocation(dim.width/2-tablero.getSize().width/2, dim.height/2-tablero.getSize().height/2);
        //Se muestra el tablero
        tablero.show();
    }
    
}
