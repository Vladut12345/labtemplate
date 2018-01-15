import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Laser extends Actor
{
   public double posx,posy,vx,vy,veloc=7;
   
   public Laser()
   {
       
    }
     public Laser(int rot)
   {
       vx=veloc*Math.cos(1.0*rot*Math.PI/180);
       vy=veloc*Math.sin(1.0*rot*Math.PI/180);
       setRotation(rot);
    }
    
    public void addedToWorld(World Space) 
    {
        GreenfootImage image = new GreenfootImage(20,10);
        image.setColor(Color.RED);
        image.drawLine(0,5,image.getWidth()-1,5);
        setImage(image);
        
        posx=getX();
        posy=getY();
    } 
    
    public void act() 
    {
        posx+=vx;
        posy+=vy;
        
        setLocation((int)posx,(int)posy);
        
        if(getX()<=100 || getX()>getWorld().getWidth()+100 || getY()<=100 || getY()>getWorld().getHeight()+100)
        {
                getWorld().removeObject(this);
            }
    }    
}
