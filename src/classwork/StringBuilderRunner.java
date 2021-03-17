package classwork;

public class StringBuilderRunner {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(" ").concat(s2);
        String s4 = s1 + " "  + s2;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(" ");
        sb.append(s2);
        sb.append(" ");
        sb.append("again");

        System.out.println("sb.toString() = " + sb.toString());

        System.out.println("Hello our result is:" + 10 + " and day is " + 2);

        String s5 = "";
        //wrong
        for (int i = 0; i < 10; i++) {
            s5 = s5 + " " + i;
        }
        System.out.println("s5 = " + s5);
        
        //correct
        StringBuilder s6 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s6.append(i);
            s6.append(" ");
        }
        System.out.println("s6.toString() = " + s6.toString());
    }
}
