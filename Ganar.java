import greenfoot.*;

/**
 * Clase que muestra al jugador una pantalla de que a ganado
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Ganar extends World
{

    /**
     * Constructor para objetos de clase Ganar.
     * 
     */
    public Ganar()
    {    
        super(1100, 618, 1); 
    }
    /**
     * Metodo que muestra al jugador un mensage donde ve que es ganador
     */
    public void act()
    {
        Greenfoot.delay(100);
        Greenfoot.setWorld(new Menu_Jugar());
    }
}
