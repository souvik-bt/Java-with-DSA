import java.util.*;

public class arraySizeGiven2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        //ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            //list.add(sc.nextInt());
        }

        for(int no:arr){
            System.out.print(no + " ");
        }

        sc.close();
    }
}
