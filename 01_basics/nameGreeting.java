import java.util.*;

public class nameGreeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        
        if(sc.hasNextLine()){
            String myName = sc.nextLine();
            System.out.println("Hello! " + myName + " how are you ?");
        }
        else{
            System.out.println("Enter valid name");
        }
        
        sc.close();
    }
}
