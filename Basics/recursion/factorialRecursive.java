public class factorialRecursive {

    public static void main(String[] args) {
        System.out.println(FindFactorial(5));
    }

    public static int FindFactorial(int n) {
        if(n==1) {
            return 1;
        }
        return n * FindFactorial(n-1) ;
    }

}
