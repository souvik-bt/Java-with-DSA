public class factorial {
    public static void main(String[] args) {
        System.out.println(FindFactorial(5));
    }
    public static int FindFactorial(int n){
        int res = 1;
        for(int i=1; i<=n; i++){
            res = res * i;
        }
        return res;
    }
}
