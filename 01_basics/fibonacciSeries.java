import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series : ");
        int no1 = 0 , no2 = 1;

        for(int i=1; i<=n; i++){
            System.out.print(no1 + " ");
            
            int next = no1 + no2 ; 
            no1 = no2;
            no2 = next ;
        }

        sc.close();
        
    }
        
}

