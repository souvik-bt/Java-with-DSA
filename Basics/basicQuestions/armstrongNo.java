import java.util.*;

public class armstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int temp = i, digits = 0, sum = 0;

            // count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = i;

            // calculate Armstrong
            while (temp > 0) {
                int rem = temp % 10;
                int power = 1;

                // rem^digits
                for (int j = 1; j <= digits; j++) {
                    power *= rem;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}