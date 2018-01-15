
public class MainSudut  
{
    public static int norm180(int a)
    {
        while(a<=180){
            a+=360;
        }
         while(a>180){
            a-=360;
        }
        return a;

    }
    public static int norm360(int a)
    {
        while(a<=0){
            a+=360;
        }
         while(a>360){
            a-=360;
        }
        return a;

    }
    
   public static int getDirection(int sudut1,int sudut2)
   {
       int a = norm180(sudut2)-norm180(sudut1);
       int b = norm360(sudut2)-norm360(sudut1);
       return Math.abs(a)<Math.abs(b)?a:b;
   }
}
