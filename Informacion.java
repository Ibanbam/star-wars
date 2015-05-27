import greenfoot.*;

/**
 * Clase que muestra una imagen de ayuda
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Informacion extends World
{

    /**
     * Constructor para objetos de clase Informacion.
     * 
     */
    public Informacion()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(1100,618, 1); 
    }
    /**
     * Metodo que muestra la documentacion del autor 
     */
    public void act()
    {
         if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Menu_Informacion());
            Greenfoot.delay(10);
        }
    }
}
