public class arrayOperations2 {
    public static void main(String[] args){

        //// search: element exists in array ?
        int[] arr = {23, 4 ,5 , 6, 55, -2};
        for(int i: arr){
            if(i==55){
                System.out.println("found in the array");
            }
        }


        //// find max element
        int[] arr1 = new int[5];
        arr1[0] = 2;
        arr1[1] = 3;
        arr1[2] = 9;
        arr1[3] = 34;
        arr1[4] = -3;
        int  res = Integer.MIN_VALUE;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > res){
                res = arr1[i];
            }
        }
        System.out.println("Max element : " + res);


        //// reverse an array
        int[] arr2 = {34,53,24,6,4,2,5};
        for(int i = (arr2.length)-1; i>=0; i--){
            System.out.print(arr2[i] + " " );
        }
        System.out.println();


        //// sum of array
        int[] arr3 = { 34, 53, 24, 6, 4, 2, 5 }; //using for 
        int sum = 0, sum2 = 0;

        for(int i = 0; i < arr3.length;  i++){
            sum += arr3[i];
        }
        for (int ele : arr3) {                   //using for-each
            sum2 += ele;
        }
        System.out.println(sum);
        System.out.println(sum2);

        
    }
}
