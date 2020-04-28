
public class EvensumExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // 2 또는 3의 배수를 출력하세요. 조건1 || 조건2
            if(( i%2==0) || ( i%3==0 )) {
                System.out.println("2 또는 3 의 배수: " + i);
            }
            if(( i%2==0) && ( i%3==0 )) {
                System.out.println(i);
            }
            if( !(i%2==0)) {
                System.out.println("홀수값: " + i);
            }
        }
    }
}