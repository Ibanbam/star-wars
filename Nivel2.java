import greenfoot.*;

/**
 *Nivel 2 dle juego, la dificultad se incrementa y un jefe aparece
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends Nivel1
{
    int numeroEnemigos = 36;
    Counter liveEnemigo = new Counter("Vida Enemigo: ");
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {
        lives.add(20);
        addObject(new Nave1() , 550, 590);
        nacerEnemigos1();
    }
/**
 * Metodo act del nivel 2
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
    /**
     * Metodo para agregar puntos y aparecer en el mapa a los enemigos y al jefe
     */
    public void addPoints(int pts)
    {
        score.add(pts);
        numeroEnemigos--;
        if(numeroEnemigos == 24 )
            nacerEnemigos2();
        if(numeroEnemigos == 12 )
            nacerEnemigos3();   
        if(numeroEnemigos == 4){
            addObject(new Jefe() ,550, 100);
            addObject(liveEnemigo, 20 , 20);
            liveEnemigo.add(97);
        }
    }
    /**
     * Metodo para informar al mundo que el jefe esta derrotado y que el jugador pase al siguiente nivel
     */
    public void jefeVencido(boolean bandera)
    {
        if(bandera == true)
        {
            Greenfoot.setWorld(new NivelFinal());
        }
    }
    /**
     * Metodo para remover vidas al jefe
     */
    public void rmvvida(int pts)
    {
        liveEnemigo.subtract(pts);
   }
   /**
    * Metodo para agregar vidas al jefe
    */
   public void addvida(int pts)
    {
        liveEnemigo.add(pts);
    }
}
