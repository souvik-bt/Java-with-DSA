import java.util.*;

public class arrayOperations {
    public static void main(String[] args) {

        //..creating a array
        int[] arr1 = new int[5]; //all 5 integers are zero.
        int[] arr2 = {1,2,3,4,5}; // left(initialization) = stack memory, right(declaration) = heap memory

        //..length
        System.out.println("lenth of arr2 : " + arr2.length);

        //..accessing
        System.out.println("first value : " + arr2[0]);

        //..modifying
        arr2[0] = 100;
        System.out.println("changed value : "+ arr2[0]);

        //..iterating
        //for loop
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        } 
        System.out.println();
        //for each
        for(int i: arr2){
            System.out.print(i + " ");
        }   
        System.out.println();
        
        //..copying
        int[] oldArr = {23,2,1,23,10,-3};
        int[] newArr = Arrays.copyOf(oldArr, oldArr.length);      
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //..sorting
        Arrays.sort(newArr);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //..searching
        int index = Arrays.binarySearch(newArr,-3);
        System.out.println(index);
    }
}
