import java.util.Scanner;

public class HouseSummary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice; 
      int lastMonthsPrice; 
      
      currentPrice = scnr.nextInt(); 
      lastMonthsPrice = scnr.nextInt();
      
      
      I honestly have been wracking my brain about what equation I need to communicate the consistant change within the change of
      Price. I'm happy the mortgage algorithm was provided because I feel like im so close but. I have to call it here.
      
      System.out.print("This house is $" + currentPrice + ".");
      System.out.println(" The change is $" + lastMonthsPrice + " since last month.");
      System.out.println("The estimated monthly mortgage is $" + (currentPrice * 0.051 / 12) + ".");
   }
}
