import java.util.*;

public class simpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double p,r,t;
        System.out.println("Enter P : ");
        p = sc.nextDouble(); 
        System.out.println("Enter R : ");
        r = sc.nextDouble();
        System.out.println("Enter T : ");
        t = sc.nextDouble();

        double si = (p * r * t)/100;
        System.out.println("Simple Interest is " + si);
        sc.close();
    }    
}
