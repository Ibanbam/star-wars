import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.awt.Font;
import java.awt.Color;

/**
 * Counter that displays a number.
 * 
 */
public class Counter extends Actor
{
    private int value = 3;
    private int target = 3;
    private String text;
    private int stringLength;

    public Counter()
    {
        this("");
    }
    /**
     * Metodo constructor 
     */
    public Counter(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 16;

        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        image.setColor(Color.WHITE);
        
        updateImage();
    }
    
    public void act() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
        if(value == 0)
         Greenfoot.setWorld(new Perder());
    }
    /**
     * Metodo que agrega score 
     */
    public void add(int score)
    {
        target += score;
    }
    /**
     * Metodo que quita score
     */
    public void subtract(int score)
    {
        target -= score;
    }
    /**
     * Metodo que regresa el valor del score
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Metodo que actualiza la imagen en pantalla
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
