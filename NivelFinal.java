import greenfoot.*;

/**
 * Nivel final del juego, maxima dificultad
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NivelFinal extends Nivel1
{
    /**
     * Constructor for objects of class NivelFinal.
     * 
     */
    Counter score = new Counter("Score: ");
    Counter lives = new Counter("Lives: ");
    Counter vidaf = new Counter("Vida boss:");
    /**
     * Constructor para objetos de clase Nivel1.
     * 
     */
    public NivelFinal()
    {   
        addObject(score, 1070, 600 );
        addObject(lives, 80 , 600);
        lives.add(200);
        addObject(new Nave1() , 550, 590);
        addObject(new JefeFinal(),550,-10);
        addObject(vidaf ,50,50);
        vidaf.add(100);
    }
    /**
     * MEtodo pata agregar puntaje
     */
    public void addPoints(int pts)
    {
        score.add(pts);
    }
    /**
     * Metodo para quitar vidas al jugador
     */
    public void rmvLives(int pts)
    {
        lives.subtract(pts);
   }
   /**
    * Metodo para agregar vidas
    */
   public void addLives(int pts)
    {
        lives.add(pts);
    }
    /**
     * Metodo pata informar que el jugador s quedo sin vidas
     */
    public void morir(){
        if (lives.getValue() <= 0)
        {
             Greenfoot.setWorld(new Perder());
        }
    }
    /**
     * Metodo act del nivel
     */
    public void act()
    {
        int bonusRapido= Greenfoot.getRandomNumber(900);
        int coinVida= Greenfoot.getRandomNumber(1100);
        int MeteoritoTiempo= Greenfoot.getRandomNumber(200);
        if(bonusRapido == 20)
        addObject(new BonusRapido() , Greenfoot.getRandomNumber(1100), 10);
        if(coinVida == 20)
        addObject(new VidaCoin() , Greenfoot.getRandomNumber(1100), 10);
        if(MeteoritoTiempo == 15)
        addObject(new Meteorito() , Greenfoot.getRandomNumber(1100), 10);
    }
    public void jefeVencido(boolean bandera)
    {
        if(bandera == true)
        {
            Greenfoot.setWorld(new Ganar());
        }
    }
    /**
     * Metodo para quitar vida al jefe
     */
    public void rmvvidaf(int pts)
    {
        vidaf.subtract(pts);
   }
   /**
    * Metodo para agregar vida al jefe
    */
   public void addvidaf(int pts)
    {
        vidaf.add(pts);
    }
    }


