import greenfoot.*;

/**
 * Meteorito que caera dentro del juego para ser un obstaculo para el jugador
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Meteorito extends Actor
{
    /**
     * Act - hace lo que Meteorito quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
     public void act() 
    {
        impacto();
        movimiento();
    }    
    /**
     * Metodo pata detectar cuando el meteorito impacte
     */
    public void impacto()
    {
        if(isTouching(Nave1.class) || isTouching(Nave2.class))
        {
            ((Nivel2) getWorld()).rmvLives(1);
        }
    }
    /**
     * Metodo para dar le el movimiento al meteorito
     */
    public void movimiento()
    {
        setLocation( getX() , getY()+5 );
        if( getY() >= 600 )
        getWorld().removeObject(this);
    } 
}
