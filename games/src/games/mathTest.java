
package games;

import java.util.Scanner;

public class mathTest {
	static int A;
	static int B;
	static int C;
	static int ans;
	static int userAns;
	static int type;
	static int dif;
	static int tDif;
	static int numberC;
	static int rounds = 10;

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Choose game type:\n(1)Addition\n(2)Subtrtaction\n(3)Multiplication\n(4)Division");
		type = scanner.nextInt();
		
		System.out.println("Choose dificulty\n(1)Easy (0-10)\n(2)Medium (0-50)\n(3)Hard(-100-100)");
		dif = scanner.nextInt();
		for(int i = 0; i < rounds; i++) {
			switch(dif) {
				case(1):
					A = (int) (Math.random() * 11);
					B = (int) (Math.random() * 11);
					break;
				case(2):
					A = (int) (Math.random() * 51);
					B = (int) (Math.random() * 51);
					break;
				case(3):
					A = (int) (Math.random() * 202 - 101);
					B = (int) (Math.random() * 202 - 101);
					C = (int) (Math.random() * 202 - 101);
					break;
				default:
					System.out.println("Invalid dificulty");
					return;
			}
			
			switch(type) {
				case(1):
					if (dif != 3) {
						ans = A + B;
						System.out.println("What is" + A + "+" + B);
						userAns = scanner.nextInt();
						if (ans == userAns) {
							System.out.println("Correct");
							numberC++;
						}else {
							System.out.println("Wrong you were " +(Math.abs(ans - userAns)) + " off");
							tDif += ans - userAns;
						}
					}else {
						ans = A + B + C;
						System.out.println("What is" + A + "+" + B + "+" + C);
						userAns = scanner.nextInt();
						if (ans == userAns) {
							System.out.println("Correct");
							numberC++;
						}else {
							System.out.println("Wrong you were " +(Math.abs(ans - userAns)) + " off");
							tDif += ans - userAns;
						}
					}
				break;
				case(2):
					if (dif != 3) {
						ans = A - B;
						System.out.println("What is" + A + "-" + B);
						userAns = scanner.nextInt();
						if (ans == userAns) {
							System.out.println("Correct");
							numberC++;
						}else {
							System.out.println("Wrong you were " +(Math.abs(ans - userAns)) + " off");
							tDif += ans - userAns;
						}
					}else {
						ans = A - B - C;
						System.out.println("What is" + A + "-" + B + "-" + C);
						userAns = scanner.nextInt();
						if (ans == userAns) {
							System.out.println("Correct");
							numberC++;
						}else {
							System.out.println("Wrong you were " +(Math.abs(ans - userAns)) + " off");
							tDif += ans - userAns;
						}
					}
					break;
				case(3):
					if (dif != 3) {
						ans = A * B;
						System.out.println("What is" + A + "*" + B);
						userAns = scanner.nextInt();
						if (ans == userAns) {
							System.out.println("Correct");
							numberC++;
						}else {
							System.out.println("Wrong you were " +(Math.abs(ans - userAns)) + " off");
							tDif += ans - userAns;
						}
					}else {
						ans = A * B * C;
						System.out.println("What is" + A + "*" + B + "*" + C);
						userAns = scanner.nextInt();
						if (ans == userAns) {
							System.out.println("Correct");
							numberC++;
						}else {
							System.out.println("Wrong you were " +(Math.abs(ans - userAns)) + " off");
							tDif += ans - userAns;
						}
					}
					break;
				case(4):
					if(A == 0) {
						A++;
					}
					if(B == 0) {
						B++;
					}
					ans = A / B;
					System.out.println("What is" + A + "/" + B);
					userAns = scanner.nextInt();
					if (ans == userAns) {
						System.out.println("Correct");
						numberC++;
					}else {
						System.out.println("Wrong you were " +(Math.abs(ans - userAns)) + " off");
						tDif += ans - userAns;
					}
					break;
				default:
					System.out.println("Choose a corect dificulty/game type");
					break;
			}
		}
		System.out.println(numberC + " out of " + rounds);
	}
}
