import greenfoot.*;

/**
 * Clase que regresa al menu de aydua
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Ayuda extends World
{

    /**
     * Constructor para objetos de clase Ayuda.
     * 
     */
    public Ayuda()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(900, 562, 1); 
    }
    /**
     * Metodo que regresa al menu de ayuda
     */
    public void act()
    {
         if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Menu_Ayuda());
            Greenfoot.delay(10);
        }
    }
}
