import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Airplane extends Actor
{
    private int targetx,targety;
    private double posx,posy,vx,vy,veloc=20;
    public boolean DEAD=false;
    
    public void addedToWorld(World Space)
    {
        posx=targetx= getX();
        posy=targety= getY();
        
        vx=veloc;
        vy=0;
    }
    
    public void move()
    {
        double rx = targetx-posx;
        double ry = targety-posy;
        double r = Math.sqrt(rx*rx+ry*ry);
        
        if(r>20){
        
        double angle= Math.atan2(ry,rx)*180/Math.PI;
        int direction = MainSudut.getDirection(getRotation(),(int)angle);
        
        int bts = 10;
       
        if(Math.abs(direction)>10){
            direction= (direction<0)?-bts:bts;
        }
        
        direction+=getRotation();
        
        vx=veloc*Math.cos(1.0*direction*Math.PI/180);
        vy=veloc*Math.sin(1.0*direction*Math.PI/180);
        
        
        posx+=vx;
        posy+=vy;
        
        
        setLocation((int)posx,(int)posy);
        setRotation(direction);
    }
}
public void fire()
{
    int dx = (int) (0.5*getImage().getWidth()+20);
    getWorld().addObject(new Laser(getRotation()),getX()+(int)(dx*Math.cos(1.0*getRotation()*Math.PI/180)),getY()+(int)(dx*Math.sin(1.0*getRotation()*Math.PI/180)));
}

public void Destr()
{
    DEAD=true;
    for(int i=0;i<=10;i++)
    {
        Fereste fereste= new Fereste();
        getWorld().addObject(fereste,getX()-50+Greenfoot.getRandomNumber(100),getY()-50+Greenfoot.getRandomNumber(100));
        GreenfootImage img = new GreenfootImage(20,20);
        img.drawImage(getImage(),-Greenfoot.getRandomNumber(getImage().getWidth()),-Greenfoot.getRandomNumber(getImage().getHeight()));
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
        if(Greenfoot.mouseMoved(null)){
         MouseInfo mouse=Greenfoot.getMouseInfo();
         targetx=mouse.getX();
         targety=mouse.getY();
         
        }
        if(Greenfoot.mouseClicked(null)){
            fire();
        }
        move();
    }    
}
}
