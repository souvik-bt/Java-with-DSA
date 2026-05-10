// write this if inside same directory/folder
package src.test1;
// write if import pakage from other directorys
import src.test2.cat;

public class main {
    public static void hello(String[] args) {
        
        // this is the class from test1
        src.test1.cat cat1 = new src.test1.cat();

        // this is the class from test2
        cat cat2 = new cat();

        
    }
}
