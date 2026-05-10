import java.util.*;

class arraySizeGiven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        // 1. print
        for(int i=0; i<n; i++){
            System.out.print(list.get(i) + " ");
        }
        // 2. print
        for(int ele : list){
            System.out.print(ele);
        }

        sc.close();
    }
}