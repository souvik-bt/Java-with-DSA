//package Arrays.Questions;

public class AverageOfElements {
    public static double getAverage(int arr[]){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        int size = arr.length;
        double average = (double) sum / size ;
        return average;

    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,3};
        double result = getAverage(arr);
        System.out.println(result);
    }
}
