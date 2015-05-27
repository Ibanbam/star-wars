import greenfoot.*;

/**
 * Bonus para el jugador, si el jugador toca este bonus podra cambiar su nave a una mejor
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BonusRapido extends Actor
{
    /**
     * Act - hace lo que BonusRapido quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        impacto();
        movimiento();
    } 
    /**
     * Metodo para detectar si el bonus toco al jugador
     */
    public void impacto()
    {
        if(isTouching(Nave1.class))
        {
            removeTouching(Nave1.class);
            getWorld().addObject(new Nave2(), getX(), getY()-20);
        }
    }
    /**
     * Metodo para dar el movimiento al bonus
     */
    public void movimiento()
    {
        setLocation( getX() , getY()+5 );
        if( getY() >= 600 )
        getWorld().removeObject(this);
    }
}
