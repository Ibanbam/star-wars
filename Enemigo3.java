import greenfoot.*;

/**
 * Enemigo de tipo 2, este tendra mas dificultad, sera mas rapido y disparara mas
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Enemigo3 extends Enemigo1
{
    /**
     * Act - hace lo que Enemigo3 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        int balas = Greenfoot.getRandomNumber(500);
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
     * Metodo que le da el movimiento al enemigo
     */
    public void mover(int x, int y)
    {
    tiempoAvanzar++;
    if ( tiempoAvanzar >= 3 ){
       y = y + 4;
       tiempoAvanzar = 0;
    }
    if( direccion == false ){
        x = x - 6;
        setLocation( x , y );
        }
    if( direccion == true ){
        x = x + 6;
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
            setImage("Enemigo31.png");
            else
            setImage("Enemigo32.png");
        }
    } 
}
