import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends World
{
    static Counter counter = new Counter();
    Counter counter2 = new Counter();
    
    SimpleTimer st = new SimpleTimer();

    /**
     * Constructor for objects of class BackGround.
     * 
     */
    public BackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Spider j1 = new Spider();
        addObject(j1,100,300);
        
        counter.setValue(0);
        st.mark();
        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(200)<3)
         addObject(new Fly(),Greenfoot.getRandomNumber(600),0);
         
         counter2.setValue(st.millisElapsed()/1000);
        if(counter2.getValue()>=40)
        {
            showText("Time is Up",300,200);
            Greenfoot.stop();
        }
        
    }
    private void prepare()
    {
      Frog frog = new Frog();
      addObject(frog,550,46);
      showText("Score",63,16);
      
      addObject(counter,63,36);
      showText("Timer",548,362);
      
      addObject(counter2,548,382);
      
      
    }
}
