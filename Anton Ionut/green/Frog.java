import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import static greenfoot.Greenfoot.*;
//import java.awt.Color;

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(getRandomNumber(10));
        
        if(atWorldEdge())
          turn(getRandomNumber(10));
        
        if(isTouching(Spider.class))
        {
            removeTouching(Spider.class);
            
            GreenfootImage g1 = new GreenfootImage("You Lose",50,Color.BLACK,Color.WHITE);
            
            setImage(g1);
            setLocation(300,200);
            setRotation(0);
            stop();
        }
        
    } 
    
    public boolean atWorldEdge(){
        if(getY()<20 || getWorld().getHeight()- getY()<20)
          return true;
        if(getX()<20 || getWorld().getWidth()- getX()<20)
          return true;
        else
          return false;
         
    }
}
