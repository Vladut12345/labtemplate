import greenfoot.*;
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        addObject(new Eyeball(),230,171);
        addObject(new Eyeball(),770,171);
    }
}
