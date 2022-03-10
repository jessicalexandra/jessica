
package ejercisio1;

import java.util.Scanner;
   public class Ejercisio1 {
     
       
    public static void main(String[] args) {
      Scanner lea=new Scanner (System.in);
      String NomE;
      float HorE, PorH, CanM;
      System.out.print("Nombre de estudiante: ");
      NomE=lea.nextLine();
      System.out.print("Cantida de horas estudiadas: ");
      HorE=lea.nextFloat();
      PorH=HorE*100/168;
      CanM=HorE*60/1;
      System.out.println(NomE+" Tiene un % de horas estudiadas de "+PorH+"% "+"Cantida de minutos " +CanM);
    }
    
}
