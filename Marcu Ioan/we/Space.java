import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Space extends World
{
    private int jeda=2;
    
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1,false); 
        
        GreenfootImage image = new GreenfootImage(getWidth(),getHeight());
        image.setColor(new Color(15,9,66));
        image.fill();
        //for(int i=0;i<=30;i++){
          //  image.drawImage(new GreenfootImage("uni.jpg"),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        //}
        setBackground(image);
        
        addObject(new Airplane(),(int)(0.5*getWidth()),(int)(0.5*getHeight()));
    }
    
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=100;
        if(jeda==1){
            int rot = Greenfoot.getRandomNumber(360);
            addObject(new Missle(),(int)(0.5*getWidth()+getWidth()*Math.cos(1.0*rot*Math.PI/180)),(int)(0.5*getHeight()+getHeight()*Math.sin(1.0*rot*Math.PI/180)));
        }
    }
}
