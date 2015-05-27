import greenfoot.*;

/**
 * Balas del jugador, estas seran para que el jugador pueda atacar a los enemigos
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BalaNave extends Actor
{
    /**
     * Act - hace lo que BalaNave quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        animacion();
        movimiento();
    }
    /**
     * Metodo que reproduce la animacion de la bala
     */
    public void animacion()
    {
        int animacion = Greenfoot.getRandomNumber(40);
        if( animacion < 20)
            setImage("Bala1.png");
        else
            setImage("Bala2.png");
    }
    /**
     * Metodo qu ele da el movimiento a la bala
     */
    public void movimiento()
    {
            int y = getY();
            int x = getX();
            y = y - 13;
            setLocation( x , y );
            if( y <= 5 )
                getWorld().removeObject(this);
    }
}
