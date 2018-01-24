
public class usefull_Things {
	int N[] = new int[10];
	boolean areEq;

	public boolean isEq(int[] N) {
		switch(N.length) {
		case 1:
			areEq = true;
			break;
		case 2:
			areEq = N[0] == N[1];
			break;
		case 3:
			areEq = N[0] == N[1] && N[1] == N[2];
			break;
		case 4:
			areEq = N[0] == N[1] && N[1] == N[2] && N[2] == N[3];
			break;
		default:
			areEq = false;
			break;
		}
		return areEq;
	}
}