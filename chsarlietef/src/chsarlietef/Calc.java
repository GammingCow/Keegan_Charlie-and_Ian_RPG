package chsarlietef;

import java.util.Scanner;

public class Calc {
	
	
	


	public static void main(String[] args) {
		Scanner input;
		int a = 0;
		int b = 0;
		double sum = 0;
		int mode = 0;
		input = new Scanner(System.in);
		boolean run = true;
		while(run) {
		System.out.println("what opperation would you like to do\n(1)addition\n(2)subtraction\n(3)multiplication\n(4)division\n(5)exponent");
		
		mode = input.nextInt();
		
		switch(mode) {
		
		case 1:
		
		System.out.println("what is the first number you would like to add:");
		a = input.nextInt();
		System.out.println("what is the second number you would like to add:");
		b = input.nextInt();
		sum = a+b;
		System.out.println("result is: "+sum);
		
		break;
		
		case 2:
		
		System.out.println("what is the first number you would like to subtraction:");
		a = input.nextInt();
		System.out.println("what is the second number you would like to subtraction:");
		b = input.nextInt();
		sum = a-b;
		System.out.println("result is: "+sum);
		
		break;
		
		case 3:
			
			System.out.println("what is the first number you would like to multiply:");
			a = input.nextInt();
			System.out.println("what is the second number you would like to multiply:");
			b = input.nextInt();
			sum = a*b;
			System.out.println("result is: "+sum);
			
		break;
		
		case 4:
			
			System.out.println("what is the first number you would like to divide:");
			a = input.nextInt();
			System.out.println("what is the second number you would like to divide:");
			b = input.nextInt();
			sum = a/b;
			System.out.println("result is: "+sum);
		
		break;
		
		case 5:
			
			System.out.println("what is the first number you would like to set:");
			a = input.nextInt();
			System.out.println("what is the second number you would like to add as an exponent:");
			b = input.nextInt();
			sum = Math.pow(a, b);
			System.out.println("result is: "+sum);
			
		break;
		
		
		default:
			System.out.println("invalid opperation");

		}
		System.out.println("would you like to calculate again, type true/false");
		run = input.nextBoolean();
		}	
	
	}
}