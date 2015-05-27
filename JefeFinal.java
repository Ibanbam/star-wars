import greenfoot.*;

/**
 * Jefe final, este dispara mucho, se mueve lento, tiene vida y hace aparecer enemigos en su defensa
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class JefeFinal extends Jefe
{
    /**
     * Act - hace lo que JefeFinal quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        impacto(x,y);
        mover(x,y);
        int balas = Greenfoot.getRandomNumber(200);
        int enemigos = Greenfoot.getRandomNumber(19000);
        if(balas < 55){
        getWorld().addObject(new BalaEnemigo(), getX()+100, getY());
        getWorld().addObject(new BalaEnemigo(), getX()-100, getY());
        }
        if(enemigos > 0 && enemigos < 100)
        getWorld().addObject(new Enemigo1(), getX(), getY()+50);
        if(enemigos > 101 && enemigos < 200)
        getWorld().addObject(new Enemigo2(), getX(), getY()+50);
        if(enemigos > 201 && enemigos < 300)
        getWorld().addObject(new Enemigo1(), getX(), getY()+50);
         if (vida <= 0 ){
        ((NivelFinal) getWorld()).jefeVencido(true); 
    }  
}
/**
 * Metodo que le da la animacion al jefefinal
 */
    public void animacion()
    {
            int animacion = Greenfoot.getRandomNumber(5);
            if( animacion == 0)
            setImage("boss1.png");
            if( animacion == 1)
            setImage("boss2.png");
            if( animacion == 2)
            setImage("boss3.png");
            if( animacion == 3)
            setImage("boss4.png");
            if( animacion == 4)
            setImage("boss5.png");
    }
    /**
     * Metodo que detecta si lo toco la bala
     */
    public void impacto(int x, int y)
    {
        if(isTouching(BalaNave.class))
        {
            Greenfoot.playSound("explosion.wav");
            ((NivelFinal) getWorld()).rmvvidaf(1);
            ((Nivel1) getWorld()).addPoints(1);
            removeTouching(BalaNave.class);
            vida--;
            
        }
    }
}
