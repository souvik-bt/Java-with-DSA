public class twentyEight {
    public static void main(String[] args) {
        pattern28(5);
    }
    public static void pattern28(int n){
        // Rows
        for (int row = 0; row < (2 * n); row++ ){
            // Column Number
            int totalColumn = row > n ? n - (row-n) : row ;

            // Space
            int noOfSpaces = n - totalColumn;
            for(int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
            }
            
            // Column  
            for (int col = 0; col < totalColumn; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
