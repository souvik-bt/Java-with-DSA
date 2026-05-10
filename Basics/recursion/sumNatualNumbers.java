import java.util.*;

public class sumNatualNumbers {
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("SUM of " + n + " natural numbers is : " + sumNatural(n));
        sc.close();
    }
    
    public static int sumNatural(int n ){
        if (n==1){
            return 1;
        }
        return n + sumNatural(n-1);
    }
}
