import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no = ");

        if (sc.hasNextInt()) {

            int userNo = sc.nextInt();
            if (userNo % 2 == 0) {
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
        } else {
            System.out.println("Enter valid no");
        }

        sc.close();

    }
}
