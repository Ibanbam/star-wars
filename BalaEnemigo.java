import greenfoot.*;

/**
 * Balas del jugador, estas seran  el arma del jugador para pder atacar a los enemigos
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BalaEnemigo extends Actor
{
    /**
     * Act - hace lo que BalaEnemigo quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        movimiento();
    }   
    /**
     * Metodo qu ele da el movimiento a la bala
     */
    public void movimiento()
    {
            int y = getY();
            int x = getX();
            y = y + 5;
            setLocation( x , y );
            if( y >= 600 )
                getWorld().removeObject(this);
    }
    
}
