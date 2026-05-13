package OOPs.Constructors;

public class Test {

    public static void main(String[] args) {
        
        // Student() is CONSTRUCTOR.
        // Same name is parent Class.
        // this is parameterized Constructor.

        Student student = new Student("Ram", 23, 34);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getRollNumber());

    }
}

