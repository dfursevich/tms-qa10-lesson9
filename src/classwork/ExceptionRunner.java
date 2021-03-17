package classwork;

public class ExceptionRunner {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            devide(1, 0);
        } catch (Exception e) {
            System.out.println("Catch devide exception: " + e.getMessage());
        }

        System.out.println("==========");

//        try {
//            System.out.println("Try block");
//            devide();
//        } finally {
//            System.out.println("Finally");
//        }

        try {
            System.out.println("Try block");
            devide(1, 0);
        } catch (Exception e) {
            System.out.println("Catch devide exception");
        } finally {
            System.out.println("Finally");
        }

//        nullPointer();
//        arrayIndex();

        System.out.println("Last line");

        try {

            devide(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double devide() {
        return 10 / 0;
    }

    public static void nullPointer() {
        String s1 = null;
        s1.toUpperCase();
    }

    public static void arrayIndex() {
        int[] ar = new int[4];
        ar[5] = 5;
    }

    public static double devide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Can't devide by zerro");
        }

        return (double) a / b;
    }
}
