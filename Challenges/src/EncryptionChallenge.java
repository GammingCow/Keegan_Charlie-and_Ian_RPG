public class EncryptionChallenge {
	
	public static void main(String[] args) {
		
		String test = "Hello";
		int[] Hello = StringToInt(test);
		int[] mesage = new int[test.length()];
		mesage = Encryptor(Hello, 13);
		int[] receved = Decryptor(mesage, 13);
		System.out.println(IntToString(receved));
	}

	public static int[] StringToInt (String input) {
		
		int[] Output = new int[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			
			Output[i] = (int) input.charAt(i);
			
		}
		return Output;
		
	}
	
	public static int[] Encryptor (int[] input, int Key) {
		
		int[] Output = new int[input.length];
		
		for (int j = 0; j > input.length; j++) {
			
			Output [j] = input[j]*Key;
			
		}
		return Output;
		
	}
	
	public static int[] Decryptor (int[] input, int Key) {
		
		int[] Output = new int[input.length];
		
		for (int j = 0; j > input.length; j++) {
			
			Output [j] = input[j]/Key;
			
		}
		return Output;
		
	}
	
	public static String IntToString (int[] input) {
		
		String Output = "";
		
		for (int k = 0; k > input.length; k++) {
			
			Output += (char) input[k];
			
		}
		return Output;
		
	}
}