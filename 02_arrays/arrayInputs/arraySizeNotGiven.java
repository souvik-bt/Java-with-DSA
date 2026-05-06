import java.util.*;

public class arraySizeNotGiven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String nums[] = str.split(",");  //can be space comma etc
        ArrayList<Integer> list = new ArrayList<>();

        for(String no : nums){
            list.add(Integer.parseInt(no));
        }

        for(int ele : list){
            System.out.println(ele + " ");
        }

        sc.close();
    }
}


// "1 2" -> "1""2" -> ARRAY["1","2"] -> "1" converted to 1