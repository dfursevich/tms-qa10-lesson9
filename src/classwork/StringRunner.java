package classwork;

import java.util.Arrays;

public class StringRunner {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = new String("Hello World");
        String s3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s3);

        int l = s1.length();
        System.out.println("l = " + l);

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.print(ch + " ");
        }
        System.out.println();

        String s4 = "";
        boolean isEmpty = s4.isEmpty();
        System.out.println("isEmpty = " + isEmpty);

        String s5 = " ";
        if (s5 != null && !s5.isEmpty()) {
            System.out.println("No empty");
        }

        boolean isBlank = s5.isBlank();
        System.out.println("isBlank = " + isBlank);
        
        String s6 = "Hello World";
        System.out.println("s6.indexOf(\"l\") = " + s6.indexOf("l"));
        System.out.println("s6.lastIndexOf(\"l\") = " + s6.lastIndexOf("l"));

        String s7 = "Hello World1";
        System.out.println("s7.replace(\"World\", \"Peace\") = " + s7.replace("World", "Peace"));
        System.out.println("s7.replace(\"l\", \"k\") = " + s7.replace("l", "k"));
        System.out.println("s7.replaceAll(\"\\\\d\", \"k\") = " + s7.replaceAll("\\d", "k"));
        System.out.println("s7.substring(2, 4) = " + s7.substring(2, 4));
        System.out.println("s7.toUpperCase() = " + s7.toUpperCase());
        System.out.println("s7.endsWith(\"d1\") = " + s7.endsWith("d1"));

        System.out.println("String.join(\";\", s1, s2, \"bbb\") = " + String.join(";", s1, s2, "bbb"));

        System.out.println("String.valueOf(999) = " + String.valueOf(999));

        String s8 = new String("hello");
        String s9 = new String("hello");

        System.out.println("s8 == s9: " + (s8 == s9));
        System.out.println("s8 == s9: " + (s8.equals(s9)));

        String s10 = "Hello world. again";
        String[] split = s10.split(" ");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
    }
}
