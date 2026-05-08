/*
accessModifier returnType methodName(Parameters){}
 */

public class sumOfArray {
    // main method
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int saveSum = giveSum(arr);
        System.out.println("sum : " + saveSum);
    }
    // other method
    public static int giveSum(int[] arr){
        int res = 0;
        for(int i : arr){
            res += i;
        }
        return res;
    }
}
