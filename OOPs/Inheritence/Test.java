package OOPs.Inheritence;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setAge(2);
        dog.setName("sheru");
        dog.eat();
        dog.sayHello();  // overriden by dog child-class
    }
}
