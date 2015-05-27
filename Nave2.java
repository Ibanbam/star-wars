import greenfoot.*;

/**
 *Saldra a flote cuando se obtenga el bonusRapido, esta nave es mas grande, rapida y dispara mas rapido
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Nave2 extends Nave1
{
    int tiempoDisparar = 0;
    int velocidad = 15;
    int resistencia = 10;
    /**
     * Act - hace lo que Nave2 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        animacion();
        mover();
        disparar();
        impacto();
    }
    /**
     * Metodo que dispara balas del jugador
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
        if( tiempoDisparar > 15 )
        tiempoDisparar = 0;
    }
    }
}
/**
 * Metodo que le da el movmiento al jugador
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
     * Metodo que le da la animacion a la nave 2
     */
    public void animacion(){
        {
            int animacion = Greenfoot.getRandomNumber(40);
            if( animacion < 20)
            setImage("Nave21.png");
            else
            setImage("Nave22.png");
        }
    }
}
