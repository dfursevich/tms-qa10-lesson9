package classwork;

public class TernaryOperatorRunner {
    public static void main(String[] args) {
        int age = 20;
        int salary = 0;

        if (age > 30) {
            salary = 1000;
        } else if (age > 20) {
            salary = 500;
        } else {
            salary = 100;
        }

        int salary2 = age > 30 ? 1000 : (age > 20 ? 500 : 100);

        System.out.println("salary = " + salary);
        System.out.println("salary2 = " + salary2);
    }
}
