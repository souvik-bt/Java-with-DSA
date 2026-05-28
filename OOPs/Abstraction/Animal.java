package OOPs.Abstraction;

//  abstract class
public abstract class Animal{


    // 2 types of method exists in abstract class:

    // abstract method: in Java is a method that is declared without an implementation (it has no body)
    // body will be filled by child class
    public abstract void sayHello();
    

    // concerete method: regular method can exist too
    public void sleep(){
        System.out.println("zzz...");
    }
}