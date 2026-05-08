public class SignatureOverloading {
    public static void main(String[] args) {
        
    }

    // Unique combination of Method Name and Parameter list is referred to signature.
    // Signature should always be different
    // Two ways to implement signature right way :
        
    // 1. change method name

    private static int sum(int a , int b){
        return a + b;
    }

    private static int addition(int a , int b){
        return a + b;
    }

    // 2. overloading

    private static int sum2(int a, int b) {
        return a + b;
    }

    private static int sum2(int a, int b, int c) {
        return a + b;
    }
}