package chsarlietef;

import java.util.Scanner;

public class MathGame2 {
	
	public static void main(String[] args) {
	
	int mode = 0;	
	int correct = 0;
	int a = 0;
	int b = 0;
	double sum = 0;
	int rounds = 50;
	Scanner input;
	input=new Scanner(System.in);
	for (int i = 0;i<rounds; i++) {
		mode = (int)(Math.random()*100)%5;
		a= (int) (Math.random()*10);
		b= (int) (Math.random()*10);
	switch(mode) {
		case 0:
			System.out.println("What is " + a + "+" + b + "?");
			sum = input.nextDouble();
			if (a+b==sum) {
				System.out.println("Congragulations, you got it correct!");
				correct++;
			} else {
				System.out.println("YOU GOT IT WRONG! The correct answer is: " + (a+b));		
			}
			break;
		case 1:
			System.out.println("What is " + a + "-" + b + "?");
			sum = input.nextDouble();
			if (a-b==sum) {
				System.out.println("Congragulations, you got it correct!");
				correct++;
			} else {
				System.out.println("YOU GOT IT WRONG! The correct answer is: " + Math.abs(a-b));		
			}
		case 2:
			System.out.println("What is " + a + "*" + b + "?");
			sum = input.nextInt();
			if (a*b==sum) {
				System.out.println("Congragulations, you got it correct!");
				correct++;
			}else {
				System.out.println("YOU GOT IT WRONG! The correct answer is: " + (a*b));		
			}
			break;
		case 3:
			System.out.println("What is " + a + "/" + (b+1) + "?");
			sum = input.nextDouble();
			if ((double)a/(double)(b+1)==sum) {
				System.out.println("Congragulations, you got it correct!");
				correct++;
				} else {
					System.out.println("YOU GOT IT WRONG! The correct answer is: " + (int)(a/b));		
				}
			break;
		case 4:
			System.out.println("What is " + a + "^" + b + "?");
			sum = input.nextInt();
			if (Math.pow(a, b)==sum) {
				System.out.println("Congragulations, you got it correct!");
				correct++;
				} else {
					System.out.println("YOU GOT IT WRONG! The correct answer is: " + (int)(a^b));		
				}
		}
	}
	System.out.println("You got " + correct + " out of " + rounds);
	}

}