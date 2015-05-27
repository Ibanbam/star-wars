import greenfoot.*;

/**
 * Enemigo 1, este tipo de enemigo avanzara al jugador y disparara en contra de el, dificultad facil
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Enemigo1 extends Actor
{
    boolean direccion = false;
    int tiempoAvanzar;
    /**
     * Act - hace lo que Enemigo1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        int balas = Greenfoot.getRandomNumber(1500);
        if(balas > 50 && balas < 55)
        getWorld().addObject(new BalaEnemigo(), getX(), getY());
        animacion();
        int x = getX();
        int y = getY();
        mover(x , y);
        impacto(x, y);
        salirMapa(x, y);
    }
    /**
     * Metodo para mover al enemigo
     */
    public void mover(int x, int y)
    {
    tiempoAvanzar++;
    if ( tiempoAvanzar >= 3 ){
       y++;
       tiempoAvanzar = 0;
    }
    if( direccion == false ){
        x = x - 3;
        setLocation( x , y );
        }
    if( direccion == true ){
        x = x + 3;
        setLocation( x , y );
        }
    if( x <= 10 )
    direccion = true;
    if ( x >= 1090 )
    direccion = false;
    }
    /**
     * Metodo para detectar si el enemigo toco una bala
     */
    public void impacto(int x, int y)
    {
        if(isTouching(BalaNave.class))
        {
            Greenfoot.playSound("invaderkilled.wav");
            ((Nivel1) getWorld()).addPoints(1);
            removeTouching(BalaNave.class);
            getWorld().removeObject(this);
        }
    }
    /**
     * Metodo que verifica si un enemigo sale del mapa
     */
    public void salirMapa(int x, int y)
    {
        if( y == 590 ){
                ((Nivel1) getWorld()).rmvLives(1);
                getWorld().removeObject(this);
           }
    }
    /**
     * MEtodo que le da la animacion al enemigo
     */
    public void animacion(){
        {
            int animacion = Greenfoot.getRandomNumber(40);
            if( animacion < 20)
            setImage("Enemigo1.png");
            else
            setImage("Enemigo2.png");
        }
    }
}
