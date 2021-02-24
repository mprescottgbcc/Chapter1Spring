import java.util.Scanner;

public class HouseSummary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice;
      int lastMonthsPrice;

      currentPrice = scnr.nextInt();
      lastMonthsPrice = scnr.nextInt();

      System.out.print("This house is $" + currentPrice + ". The change is $" + (currentPrice - lastMonthsPrice));
      System.out.println(" since last month.");
      System.out.println("The estimated monthly mortgage is $" + (currentPrice * 0.051) / 12 + ".");
   }
}
