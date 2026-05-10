// perfect way to write a package :  
// (domain,projectName,pakageName)
// Eg. com.google.corejava.01Basics

// java.lang is automatically imported

// util.ArrayList is not
import java.util.*;

public class basicIdea{
    public static void main(String[] args) {

        String str = new String();
        // left: String is a class
        // right: Object made from String class uisng new keyword.
        // new is used for declaration.


        ArrayList<String> arr = new ArrayList<>();
        // imported by decalring java.util.*
        // or java.util.ArrayList


        System.out.println(arr);
        System.out.println(str);
        // System is a class
        // This class belongs to a pakage
        // Pakage name is java.lang (lang pakage)

    }
}