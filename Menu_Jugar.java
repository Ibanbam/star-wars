import greenfoot.*;

/**
 * Menu del juego, imagen fe jugar
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Menu_Jugar extends World
{

    /**
     * Constructor para objetos de clase Menu_Jugar.
     * 
     */
    public Menu_Jugar()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(1100,618, 1); 
    }
    /**
     * Metodo para desplazarse por el menu
     */
    public void act()
    {
         if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Nivel1());
            Greenfoot.delay(10);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            Greenfoot.setWorld(new Menu_Ayuda());
            Greenfoot.delay(10);
        }
    }
}
