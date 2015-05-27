import greenfoot.*;

/**
 * Nave del jugador, con este podra desplazarse y destruir enemigos.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Nave1 extends Actor
{
    int tiempoDisparar = 0;
    int velocidad = 4;
    int resistencia = 10;
    /**
     * Act - hace lo que Nave1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        animation();
        mover();
        disparar();
        impacto();
    }
    /**
     * Metodo para hacer que se mueva la nave
     */
    public void mover()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("left"))
        {
            x = x - velocidad;
            setLocation( x , y );
        }
        if(Greenfoot.isKeyDown("right"))
        {
            x = x + velocidad;
            setLocation( x , y );
        }
    }
    /**
     * Metodo para dar la animacion a la nave
     */
    public void animation()
    {
        int animacion = Greenfoot.getRandomNumber(40);
        if(Greenfoot.isKeyDown("right"))
        {
            if( animacion < 20 )
                setImage("NaveDer1.png");
            else
                setImage("NaveDer2.png");
        }
        else{
        if( animacion < 20)
            setImage("Nave1.png");
        else
            setImage("Nave2.png");
        }
        if(Greenfoot.isKeyDown("left"))
        {
            if( animacion < 20 )
                setImage("NaveIzq1.png");
            else
                setImage("NaveIzq2.png");
        }
    }
    /**
     * Este metodo dispara la clase balas
     */
    public void disparar()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if( tiempoDisparar == 0){
                Greenfoot.playSound("shoot.wav");
            getWorld().addObject(new BalaNave(), getX(), getY());
            tiempoDisparar++;
        }
        else{
        tiempoDisparar++;
        if( tiempoDisparar > 20 )
        tiempoDisparar = 0;
    }
    }
    
}
/**
 * Metodo que detecta si una bala enemiga toca al jugador
 */
public void impacto()
    {
        if(isTouching(BalaEnemigo.class))
        {
            ((Nivel1) getWorld()).rmvLives(1);
            removeTouching(BalaEnemigo.class);
        }
    }
}
