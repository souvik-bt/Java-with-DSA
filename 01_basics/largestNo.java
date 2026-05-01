import java.util.*;
// between three no

public class largestNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second num : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third num : ");
        double num3 = sc.nextDouble();

        // 3rd method....................... (smartest)
        double largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        System.out.println("Largest number is " + largest);

        // 2nd method........................
        /* 
        double largest = 0;
        if (num1>num2){
            largest = num1;
        }else{
            largest = num2;
        }
        if (largest < num3){
            System.out.println(num3 + " is biggest");
        }else{
            System.out.println(largest + " is biggest");
        }

        */

        //1st method...........................

        /* 
        if(num1>num2){
            if(num1>num3){
                System.out.println("1st is largest");
            }else{
                System.out.println("3rd is largest");
            }
        }
        else{
            if (num3>num2) {
                System.out.println("3rd is largest");
            }else{
                System.out.println("2st is largest");
            }
        }

        */



        sc.close();
    }
}
