package OOPs.Inheritence.singleInheritence;

// This is parent Class
public class Animal {

    // properties
    private String name;
    private int age;
    
    // behaviour
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods called in test.java
    public void eat(){
        System.out.println("This animal eats food");
    }

    public void sayHello(){
        System.out.println("makes sound");
    }
}
