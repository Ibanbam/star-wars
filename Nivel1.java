import greenfoot.*;
import java.awt.Color;
/**
 * Nivel 1, mundo donde el jugador comenzara a jugar 
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Nivel1 extends World
{
    int numeroEnemigos = 36;
    Counter score = new Counter("Score: ");
    Counter lives = new Counter("Lives: ");
    /**
     * Constructor para objetos de clase Nivel1.
     * 
     */
    public Nivel1()
    {   
        super(1100, 618, 1); 
        addObject(score, 1070, 600 );
        addObject(lives, 80 , 600);
        addObject(new Nave1() , 550, 590);
        nacerEnemigos1();
    }
    /**
     * Metodo para agregar puntaje e ir apareciendo enemigos en la ronda
     */
    public void addPoints(int pts)
    {
        score.add(pts);
        numeroEnemigos--;
        if(numeroEnemigos == 24 )
            nacerEnemigos2();
        if(numeroEnemigos == 12 )
            nacerEnemigos3();   
        if(numeroEnemigos <= 4)
            Greenfoot.setWorld(new Nivel2());
    }
    public void rmvLives(int pts)
    {
        lives.subtract(pts);
        morir();
        numeroEnemigos--;
   }
   /**
    * Metodo para agregar vidas al jugador
    */
   public void addLives(int pts)
    {
        lives.add(pts);
        numeroEnemigos--;
    }
    public void nacerEnemigos1()
    {
        for (int i = 0; i < 12 ; i++){
        addObject(new Enemigo1(),100*i,30);
        }
    }
    /**
     * Metodo para crear enemigos del tipo 2
     */
    public void nacerEnemigos2()
    {
        for (int i = 0; i < 12 ; i++){
        addObject(new Enemigo2(),100*i,30);
        }
    }
    /**
     * Metodo para crear enemigos del tipo 3
     */
    public void nacerEnemigos3()
    {
        for (int i = 0; i < 9 ; i++){
        addObject(new Enemigo3(),170*i,30);
        }
    }
    /**
     * Metodo que informa al mundo que el jugador murio
     */
    public void morir(){
        if (lives.getValue() <= 0)
        {
             Greenfoot.setWorld(new Perder());
        }
    }
    /**
     * Metodo act del nivel 1
     */
    public void act()
    {
        int bonusRapido= Greenfoot.getRandomNumber(900);
        int coinVida= Greenfoot.getRandomNumber(1100);
        if(bonusRapido == 20)
        addObject(new BonusRapido() , Greenfoot.getRandomNumber(1100), 10);
        if(coinVida == 20)
        addObject(new VidaCoin() , Greenfoot.getRandomNumber(1100), 10);
    }
}

