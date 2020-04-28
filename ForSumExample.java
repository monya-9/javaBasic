
public class ForSumExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; ){
            sum =sum + i;
            i = i + 3;
        }
        System.out.println("1~100 합: " + sum);

    }
}