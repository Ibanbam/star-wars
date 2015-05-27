import greenfoot.*;

/**
 * Este sera el jefe del nivel 2, este se mueve lento y dispara mucho, pero tiene vida.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Jefe extends Actor
{
    int vida;
    int tiempoAvanzar;
    boolean direccion =false; 
    
    /**
     * Act - hace lo que Jefe quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public Jefe()
    {
        vida = 100;
    }
    /**
     * Metodo act dle jefe
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        mover( x , y );
        impacto(x,y);
        animacion();
        int balas = Greenfoot.getRandomNumber(200);
        if(balas < 55)
        getWorld().addObject(new BalaEnemigo(), getX(), getY());
        if (vida <= 0 ){
        ((Nivel2) getWorld()).jefeVencido(true);        
    }
    }
    /**
     * Metodo que le da el movmiento al jefe
     */
    public void mover(int x, int y)
    {
      tiempoAvanzar++;
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
     * Metodo que detecta si se la bala toco al jefe
     */
    public void impacto(int x, int y)
    {
        if(isTouching(BalaNave.class))
        {
            Greenfoot.playSound("explosion.wav");
            ((Nivel2) getWorld()).rmvvida(1);
            ((Nivel1) getWorld()).addPoints(1);
            removeTouching(BalaNave.class);
            vida--;
            
        }
    }
    /**
     * Metodo que le da la animacion al jefe
     */
    public void animacion()
    {
            int animacion = Greenfoot.getRandomNumber(5);
            if( animacion == 0)
            setImage("Jefe11.png");
            if( animacion == 1)
            setImage("Jefe12.png");
            if( animacion == 2)
            setImage("Jefe13.png");
            if( animacion == 3)
            setImage("Jefe14.png");
            if( animacion == 4)
            setImage("Jefe15.png");
    }
}
