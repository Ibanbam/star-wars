import greenfoot.*;

/**
 * Menu dle jugador, imagen ayuda
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Menu_Ayuda extends World
{

    /**
     * Constructor para objetos de clase Menu_Ayuda.
     * 
     */
    public Menu_Ayuda()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(1100,618, 1); 
    }
    /**
     * Metodo para desplazarse por el mapa
     */
    public void act()
    {
         if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Ayuda());
            Greenfoot.delay(10);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            Greenfoot.setWorld(new Menu_Informacion());
            Greenfoot.delay(10);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            Greenfoot.setWorld(new Menu_Jugar());
            Greenfoot.delay(10);
        }
    }
}
