import java.util.*;
// FOR TWO NUMBERS
public class miniCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first num : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second num : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+,-,*,/) : ");
        char op = sc.next().charAt(0);

        if(op == '+'){
            System.out.println("Answer = " + (num1+num2));
        }
        else if(op == '-'){
            System.out.println("Answer = " + (num1-num2));
        }
        else if(op == '*'){
            System.out.println("Answer = " + (num1*num2));
        }
        else if(op == '/'){
            if(num2 == 0){
                System.out.println("ERROR; division by zero");
            }else{
                System.out.println("Answer = " + (num1 / num2));
            }
        }
        else{
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}