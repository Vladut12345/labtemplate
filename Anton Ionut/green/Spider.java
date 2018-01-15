import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right"))
         setLocation(getX()+2,getY());
        
        if(Greenfoot.isKeyDown("left"))
         setLocation(getX()-2,getY());
        
        if(Greenfoot.isKeyDown("down"))
         setLocation(getX(),getY()+2);
          
        if(Greenfoot.isKeyDown("up"))
         setLocation(getX(),getY()-2);
        
         
         Actor a = getOneIntersectingObject(Fly.class);
         
         if(a!=null)
         {
             BackGround.counter.add(1);
             getWorld().removeObject(a);
         }
         
         if(BackGround.counter.getValue()>=5)
         {
             GreenfootImage g1 = new GreenfootImage("You Win",50,Color.RED,Color.BLACK);
             setImage(g1);
             setLocation(300,200);
             setRotation(0);
             Greenfoot.stop();
         }
         
    }    
}
