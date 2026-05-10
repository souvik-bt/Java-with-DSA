import java.util.*;

public class arrayOperations3 {
    public static void main(String[] args){

        // 2-D Array (matrix)
        int[][] arr = new int[3][3];
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        // accessing
        System.out.println(nums[2][0]);
        System.out.println("length of array/no of rows : "+nums.length);   // prints 3 : 3 rows or 3 multiple arrays

        // iterating
        // case 1
        for(int i = 0; i < nums.length; i ++){          // Case 1
            for(int j = 0; j < nums.length; j++){       // ROWS = COLOUMN
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // case 2
        char[][] arr3 = new char[3][2];
        arr3[0][0] = 'a';
        arr3[0][1] = 'B';
        arr3[1][0] = 'C';
        arr3[1][1] = 'D';
        arr3[2][0] = 'e';
        arr3[2][1] = 'f';

        for(int i=0; i<arr3.length; i++){                   // Case 2
            for(int j=0; j<arr3[i].length; j++){            // rows != column 
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        

        // Jagged Arrays
        char[][] jArr = new char[3][];

        jArr[0] = new char[2];
        jArr[1] = new char[3];
        jArr[2] = new char[5];

        System.out.println("Jagged Array : ");
        for(int i = 0; i < jArr.length; i ++){          // Case 1
            for(int j = 0; j < jArr[i].length; j++){       // ROWS = COLOUMN
                System.out.print(jArr[i][j] + " ");
            }
            System.out.println();
        }    
    }
}
