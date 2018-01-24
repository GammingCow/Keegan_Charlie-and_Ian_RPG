package keeganStuff;


public class KeeganFibonacci {

	public static void main(String[] args) {
		
		long x=1;
		long y=1;
		long z=0;
		
		System.out.println(x + "\n" + y);
		
		for(int i = 0;i<100;i++) {
		
			z=x+y;
			
			x=y;
			y=z;
			System.out.println(z);
			
		}
		
		
	}
	
}
