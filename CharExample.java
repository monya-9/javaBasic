
public class CharExample {
    public static void main(String[] args) {
        char c1 = 97;
		int int1;
		for (int i=0; i<27; i++) {
			int1 = c1++;
		     System.out.println("int1 : " + int1 + ", c1 : " + (char)( c1-1) );
			 // int1 : 97, c1 : a
			 // int1 : 98, c1 : b
			 // int1 : 99, c1 : c
	    }
	}	
}