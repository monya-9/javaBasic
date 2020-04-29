
public class MethodExample {
    public static void main(String[] args) {
        // System.out.println("resutl: " + sum(10, 20));
        // System.out.println("resutl: " + sum(10.5, 20.3));
        // System.out.println("resutl: " + sum(10, 20, 30));
        // System.out.println("1 ~ 5 합: " + toSum(1,5));
        // printStar(3);
        // printDouble(10,5);
        // printStar(5, "World");
        printGugudan(8);

    }

    public static void printGugudan(int dan) {
        for (int i = 8; i <= 8; i++) {
            System.out.println(i + "dan");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }

    public static void printString(String str, String name) {
        System.out.println(str + "," + name);
    }

    public static void printDouble(int a, int b) {
        System.out.println(a * b);
    }

    public static void printStar(int a, String str) {
        for (int i = 1; i <= a; i++) {
            System.out.println("*****" + "," + "World");

        }
    }

    public static int toSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static double sum(double c, double d) {
        double sum = 0;
        sum = c + d;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }
}