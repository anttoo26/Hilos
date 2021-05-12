//MARIA ANTONIETA DE LA TORRE QUINTERO
public class HiloMedia extends Thread
{  
   private int [] n;
   private double resu;
   public HiloMedia (int [] n)
   {
      this.n = n;
      this.resu = 0;
   }
   @Override
   public void run()
   {
      int suma = 0;
      for(int x=0; x<n.length; x++)
      {
         suma += n [x];
      } 
      this.resu = (double) suma;
   }
   public double getResu()
   {
      return resu;
   }
}