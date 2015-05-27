import greenfoot.*;

/**
 * Menu del jugador, imagen de informacion
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Menu_Informacion extends World
{

    /**
     * Constructor para objetos de clase Menu_Informacion.
     * 
     */
    public Menu_Informacion()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(1100,618, 1); 
    }
    /**
     * Metodo para desplazarse en el mapa
     */
    public void act()
    {
         if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Informacion());
            Greenfoot.delay(10);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            Greenfoot.setWorld(new Menu_Salir());
            Greenfoot.delay(10);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            Greenfoot.setWorld(new Menu_Ayuda());
            Greenfoot.delay(10);
        }
    }
}
