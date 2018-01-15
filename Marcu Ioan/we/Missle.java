import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


public class Missle extends Actor
{
    public Airplane sar;
    public double posx,posy,veloc=3;
    public double targetx,targety;
    public boolean DEAD= false;
    private int jeda=0;
    
    public void addedToWorld(World Space)
    {
        List<Airplane> rockets= getWorld().getObjects(Airplane.class);
        if(rockets!=null && rockets.size()>0)
        {
            sar = rockets.get(0);
        }
        
        GreenfootImage image = new GreenfootImage(getImage());
        image.scale((int)(0.5*image.getWidth()),(int)(0.5*image.getHeight()));
        setImage(image);
        
        
        targetx=posx=getX();
        targety=posy=getY();
    }
    
    
     public void move()
    {
        double rx = targetx-posx;
        double ry = targety-posy;
        double r = Math.sqrt(rx*rx+ry*ry);
 
        double angle= Math.atan2(ry,rx)*180/Math.PI;
        int direction = MainSudut.getDirection(getRotation(),(int)angle);
        
        int bts = 7;
       
        if(Math.abs(direction)>10){
            direction= (direction<0)?-bts:bts;
        }
        
        direction+=getRotation();

        posx+=veloc*Math.cos(1.0*direction*Math.PI/180);
        posy+=veloc*Math.sin(1.0*direction*Math.PI/180);
        
        
        setLocation((int)posx,(int)posy);
        setRotation(direction);
    }
    
    public void checkRocket()
    {
        Actor rocket = getOneIntersectingObject(Airplane.class);
        if(rocket!=null)
        {
            ((Airplane)rocket).Destr();
            Destr();
            
        }
    }

    public void Destr()
{
    DEAD=true;
    for(int i=0;i<=10;i++)
    {
        Fereste fereste= new Fereste();
        getWorld().addObject(fereste,getX()-50+Greenfoot.getRandomNumber(100),getY()-50+Greenfoot.getRandomNumber(100));
        GreenfootImage img = new GreenfootImage(30,20);
        img.drawImage(getImage(),-Greenfoot.getRandomNumber(getImage().getWidth()),Greenfoot.getRandomNumber(getImage().getHeight()));
        fereste.setImage(img);
        
    }
}
    
    public void act() 
    {
       if(DEAD)
       {
           getWorld().removeObject(this);
        }
       else
       {
        if(sar!=null && !sar.DEAD)
       {
           targetx=sar.getX();
           targety=sar.getY();
       }
       else
       {
           if(jeda==0)
           {
           targetx=Greenfoot.getRandomNumber(getWorld().getWidth());
           targety=Greenfoot.getRandomNumber(getWorld().getHeight());
           jeda=100;
        }
        }
       move();
       checkRocket();
       if(jeda>0)jeda--;
    }    

    }
}

