import java.util.Scanner;

public class three {

    // Method to print the pattern
    public static void pattern2(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Calling method
        pattern2(rows);

        sc.close();
    }
}