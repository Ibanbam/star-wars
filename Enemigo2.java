import greenfoot.*;

/**
 * Enemigo de tipo 2, avanzara mas rapido y disparara mas
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Enemigo2 extends Enemigo1
{
    /**
     * Act - hace lo que Enemigo2 quiere hacer. Este método se llama "cuando quiera" o whenever
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
     * MEtodo que le da el movimiento al enemigo
     */
    public void mover(int x, int y)
    {
    tiempoAvanzar++;
    if ( tiempoAvanzar >= 3 ){
       y = y +2;
       tiempoAvanzar = 0;
    }
    if( direccion == false ){
        x = x - 5;
        setLocation( x , y );
        }
    if( direccion == true ){
        x = x + 5;
        setLocation( x , y );
        }
    if( x <= 10 )
    direccion = true;
    if ( x >= 1090 )
    direccion = false;
    }
    /**
     * Metodo que le da la animacion al enemigo
     */
    public void animacion(){
        {
            int animacion = Greenfoot.getRandomNumber(40);
            if( animacion < 20)
            setImage("Enemigo21.png");
            else
            setImage("Enemigo22.png");
        }
    }
}
