
public class SingleOperatorExample {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		num2 = num1;
		num1++;
		num2 = 10+ 20;
		
		for (int i=0; i<5; i++) {
			num1++;
		}
		System.out.println("num: " + num1);
		
		boolean isTrue = false;
		isTrue = !isTrue;
		isTrue = !isTrue;
		if (isTrue) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		int bit1 = 10;
		int bit2 = ~bit1 + 1;
		System.out.println(bit2);
	}
}