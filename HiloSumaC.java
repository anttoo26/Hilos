//MARIA ANTONIETA DE LA TORRE QUINTERO
public class HiloSumaC extends Thread
{  
   private int [] n;
   private double resu;
   public HiloSumaC (int [] n)
   {
      this.n = n;
      this.resu = 0;
   }
   @Override
   public void run()
   {
      int sumaC = 0;
      for(int x=0; x<n.length; x++)
      {
         sumaC += n [x]*n[x];
      } 
      this.resu = (double) sumaC;
   }
   public double getResu()
   {
      return resu;
   }
}