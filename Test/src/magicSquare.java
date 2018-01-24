import java.util.Arrays;

public class magicSquare {

	int square[] = new int[9];
	usefull_Things usefull_Things = new usefull_Things();
	static magicSquare magicSquare = new magicSquare();
	int maxNum = 9;
	
	public magicSquare(){
		for(int i = 0;i > square.length; i++) {
			square[i] = 0;
		}
	}

	public int[] make() {
		int stage = 0;
		//init all variables to check that the square is magic
		int[] N = new int[12];
		boolean isMagic = false;
		boolean allDif = false;
		
		while(isMagic == false && allDif == false) {
			switch(stage) {
				case 0: square[0]++;
						if(square[0] >= maxNum) {
							stage++;
							//square[0] = 0;
						}
						break;
				case 1: square[1]++;
						if(square[1] >= maxNum) {
							stage++;
							//square[1] = 0;
						}else if (square[0] > maxNum) {
							stage = 0;
						}
						break;
				case 2: square[2]++;
						if(square[2] >= maxNum) {
							stage++;
							square[2] = 0;
						}else if (square[1] > maxNum) {
							stage = 1;
						}
						break;
				case 3: square[3]++;
						if(square[3] >= maxNum) {
							stage++;
							square[3] = 0;
						}else if (square[2] > maxNum) {
							stage = 2;
						}
						break;
				case 4: square[4]++;
						if(square[4] >= maxNum) {
							stage++;
							square[4] = 0;
						}else if (square[3] > maxNum) {
							stage = 3;
						}
						break;
				case 5: square[5]++;
						if(square[5] >= maxNum) {
							stage++;
							square[5] = 0;
						}else if (square[4] > maxNum) {
							stage = 4;
						}
						break;
				case 6: square[6]++;
						if(square[6] >= maxNum) {
							stage++;
							square[6] = 0;
						}else if (square[5] > maxNum) {
							stage = 5;
						}
						break;
				case 7: square[7]++;
						if(square[7] >= maxNum) {
							stage++;
							square[7] = 0;
						}else if (square[6] > maxNum) {
							stage = 6;
						}
						break;
				case 8: square[8]++;
						if(square[8] >= maxNum) {
							stage++;
							square[8] = 0;
						}else if (square[7] > maxNum) {
							stage = 7;
						}
						break;
			}	
			N[0] = square[0] + square[3] + square[6];
			N[1] = square[1] + square[4] + square[7];
			N[2]= square[2] + square[5] + square[8];
			
			N[3] = square[0] + square[1] + square[2];
			N[4] = square[3] + square[4] + square[5];
			N[5] = square[6] + square[7] + square[8];
			
			N[6] = square[0];
			N[7] = square[6] + square[4] + square[2];
			N[8] = square[8];
			
			N[8] = square[2];
			N[9] = square[0] + square[4]+ square[8];
			
			N[10] = square[6];
			
			isMagic = usefull_Things.isEq(N);
			System.out.println(Arrays.toString(square));
			
		}
		return square;
	}
	public static void main(String[] args) {
		System.out.println(magicSquare.make());
	}
}
