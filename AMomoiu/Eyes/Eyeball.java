import greenfoot.*; 
public class Eyeball extends Actor
{
    private int posx, posy, xo, yo;
    
    public void addedToWorld(World MyWorld)
    {
        posx = xo = getX();
        posy = yo = getY();
    }
    public void act() 
    {
       if(Greenfoot.mouseMoved(null))
       {
           MouseInfo mouse = Greenfoot.getMouseInfo();
           
           int bts=30;
           int rx=mouse.getX()-getX();
           int ry=mouse.getY()-getY(); 
           double r = Math.sqrt(rx*rx+ry*ry);
           double ro=(r>bts)?bts:r;
           if(xo<(posx+ro*rx/r))xo++;
           if(xo>(posx+ro*rx/r))xo--;
           if(yo<(posy+ro*ry/r))yo++;
           if(yo>(posy+ro*ry/r))yo--;
           setLocation(xo,yo);
       }
    }    
}
