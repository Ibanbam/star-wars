import greenfoot.*;

/**
 * Menu del jugador, salir
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Menu_Salir extends World
{

    /**
     * Constructor para objetos de clase Menu_Salir.
     * 
     */
    public Menu_Salir()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(1100,618, 1); 
    }
    /**
     * Metodo para salir del juego
     */
    public void act()
    {
         if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.stop();
            Greenfoot.delay(10);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            Greenfoot.setWorld(new Menu_Informacion());
            Greenfoot.delay(10);
        }
    }
}
