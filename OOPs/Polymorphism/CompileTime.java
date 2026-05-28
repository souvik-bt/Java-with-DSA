class CompileTime{
    // method to add 2 integers
    public int add(int a, int b){
        return a+b;
    }
    // method to add 3 integers
    public int add(int a, int b, int c){
        return a+b+c;
    }
    // method to add 2 doubles
    public double add(double a, double b){
        return a+b;
    }


    // Method Overloading is used to achieve compile time polymorphism.
    public static void main(String[] args) {
        CompileTime calc = new CompileTime();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2,3,6));
        System.out.println(calc.add(2.5,3.4));
    }
}