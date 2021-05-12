//MARIA ANTONIETA DE LA TORRE QUINTERO
public class HilosP
{  
   public static void main(String [] args)
   {
      int n [] = new int [5];
      for(int x=0; x<n.length;x++)
      {
         int num = (int)(Math.random()*10+1);
         System.out.println(num);
         n[x] = num;
      }
      System.out.println();
      HiloMedia h1 = new HiloMedia(n);
      HiloSuma h2 = new HiloSuma(n);
      HiloSumaC h3 = new HiloSumaC(n);
      h1.start();
      h2.start();
      h3.start();
      try
      {
         h1.join();
         h2.join();
         h3.join();
         double suma = h2.getResu();
         System.out.println("Suma: "+suma);
         double media = suma/ n.length;
         System.out.println("Media: "+media);
         double sumaC = h3.getResu();
         System.out.println("Suma de cuadrados: "+sumaC);
      }
      catch (InterruptedException ex)
      {
         System.out.println(ex.getMessage());
      }
   }
}