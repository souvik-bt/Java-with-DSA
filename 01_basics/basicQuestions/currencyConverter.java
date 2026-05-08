import java.util.*;

public class currencyConverter {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter in rupees: ");
    double ind = sc.nextDouble();
    double rate = 94.82;
    
    double usd = (ind/rate);
    System.out.println("Value in dollars is: $" + usd);

    sc.close();
   } 
}
