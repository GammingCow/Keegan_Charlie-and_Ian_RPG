
public class Factors {
	
	public static void main(String[]args) {
		int a = 1000000000;
		
		for (int i = 1; i < a; i++) {
			
			if (a%i == 0) {System.out.println(a + " is divisible by " +i);}
			
		}
		
	}
}