public class immutableMutable {
    public static void main(String[] args) {

        // string in method calling is immutable
        // old value is not affected
        String name = "Souvik";
        System.out.println("New name : " + upper(name));
        System.out.println("Old name : " + name);
    }

    // string
    public static String upper(String str) {
        return str.toUpperCase();
    }

    // object

}


