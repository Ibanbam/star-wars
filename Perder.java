import greenfoot.*;

/**
 * Clase que muestra una imagen de que el jugador perdio
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Perder extends World
{

    /**
     * Constructor para objetos de clase Perder.
     * 
     */
    public Perder()
    {    
        super(1100, 618, 1); 
    }
    /**
     * Metodo para mostrar un mensaje al jugador de que perdio la partida
     */
    public void act()
    {
        Greenfoot.delay(100);
        Greenfoot.setWorld(new Menu_Jugar());
    }
}
