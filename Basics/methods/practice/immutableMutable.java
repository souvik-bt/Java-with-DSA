public class immutableMutable {
    public static void main(String[] args) {

        // string 
        // method calling is immutable
        // old value is not affected
        String name = "Souvik";
        System.out.println("New name : " + upper(name));
        System.out.println("Old name : " + name);
    }

    // string
    public static String upper(String str) {             //new variable str with same value
        return str.toUpperCase();
    }

    // object
    // method calling is mutable
    // old value is updated only
}


