package com.company;

import java.sql.SQLOutput;
import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String name ="Gaurav";
        System.out.println(name);     // print the length of the string
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();  // to lower case
        System.out.println(lstring);
        String ustring = name.toUpperCase(); // to upper case
        System.out.println(ustring);

        String nonTrimString = "      gaurav    ";   // remove unwanted spaces from string
        System.out.println(nonTrimString);
        String Trimmed = nonTrimString.trim();
        System.out.println(Trimmed);

        System.out.println(name.substring(3));  // print the value from that index value to the end [rav]
        System.out.println(name.substring(0,3)); // start is included and end is not included

        System.out.println(name.replace('r','t')); // repalce charter
        System.out.println(name.replace("rav","tva")); // replaces string
        System.out.println(name.replace("r","tva")); // replaces string

        System.out.println(name.startsWith("Gau"));  // check starts with
        System.out.println(name.startsWith("Bau"));
        System.out.println(name.endsWith("Bau"));   //ends with
        System.out.println(name.endsWith("rv"));

        System.out.println(name.charAt(3)); // print char of that index

        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("a",2));  // give the index of that char
        System.out.println(name.lastIndexOf('a'));  // gaive the value iof last index of that char >>>>start searching from last index
        System.out.println(name.lastIndexOf('a',3));

        System.out.println(name.equals("Gaurav"));
        System.out.println(name.equalsIgnoreCase("gaurav"));









    }
}
