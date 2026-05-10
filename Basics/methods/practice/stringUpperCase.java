import java.util.*;

public class stringUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input string : ");
        String str = sc.nextLine();

        String result = upperFunction(str);
        System.out.println("upprCased : " + result);
        sc.close();
    }
    private static String upperFunction(String str){
        return str.trim().toUpperCase();                //only left and right space is trimmed
    }
}
