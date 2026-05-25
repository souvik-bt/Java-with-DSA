class four{
    public static void main(String[] args) {
        pattern4(5);
    }

    public static void pattern4(int n){
        for (int i=1; i<=n; i++ ){
            for(int row = 1; row<=i; row++){
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}