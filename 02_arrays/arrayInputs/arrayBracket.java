import java.util.*;

public class arrayBracket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.startsWith("{") && str.endsWith("}")) {
            str = str.substring(1, str.length()-1);

        }

        String nums[] = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();

        for(String num:nums){
             list.add(Integer.parseInt(num));
        }

        for(int ele:list){
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
