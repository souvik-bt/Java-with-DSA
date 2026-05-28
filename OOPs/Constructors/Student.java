package OOPs.Constructors;

public class Student{

    // properties
    private String name;
    private int rollNumber;
    private int age;

    // behaviour : getter and seters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name; 
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Constructors types.....................................

    // 1.1 Java's default - dont give anything; default values will be considered. 
    // eg. integers=0 , strings=null

    // 1.2 User's default - set something DEFAULT
    // eg. int age = 10
    /* public Student(){
        this.age = 10;
    }
    */

    // 2. parametrized constructors
    public Student(String name, int rollNumber, int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Note : 1. Method overloading works for constructors too.
    //        2. No return type is required.
    
   
}