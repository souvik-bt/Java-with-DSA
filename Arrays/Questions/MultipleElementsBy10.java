//package Arrays.Questions;

public class MultipleElementsBy10 {
    public static int[] mutltiplyTen(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];

        for(int i=0; i<size; i++){
            int ele = arr[i] * 10 ;
            newArr[i] = ele;
        }

        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int[] newArr = mutltiplyTen(arr);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
