public class five {
    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int totalRows){
        for (int row=1 ; row<=(2*totalRows-1); row++){

            int totalColumns = row > totalRows ? totalRows - (row-totalRows) : row ;

            for(int col=1 ; col<=totalColumns ; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

