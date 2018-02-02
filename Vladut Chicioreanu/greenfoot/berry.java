import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class berry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class berry extends Actor
{
    /**
     * Act - do whatever the berry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
         if(Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
         if(Greenfoot.isKeyDown("down"))
        {
            move(-4);
        }
        
        Actor point;
        
        point = getOneObjectAtOffset(0,0,point.class);
        
        if(point !=null)
        {
            World world;
            world = getWorld();
            world.removeObject(point);
            Greenfoot.playSound("eatsound.wav");
        }
        
    }    
}
