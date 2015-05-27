import greenfoot.*;

/**
 * Bonus de vida, si el jugador toca este bonus, obtendra mas vida
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class VidaCoin extends BonusRapido
{
    /**
     * Act - hace lo que VidaCoin quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
       impacto();
        movimiento();
    }    
    /**
     * Metodo para detectar si se toco al jugador e informar al mundo que se agreguen vidas
     */
    public void impacto()
    {
        if(isTouching(Nave1.class) || isTouching(Nave2.class))
        {
            ((Nivel1) getWorld()).addLives(1);
        }
    }
}
