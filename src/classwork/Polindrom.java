package classwork;

public class Polindrom {
    public static void main(String[] args) {
        String str = "потоп";
        boolean polindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - i - 1);
            if (c1 != c2) {
                polindrom = false;
                break;
            }
        }
        System.out.println("polindrom = " + polindrom);
    }
}
