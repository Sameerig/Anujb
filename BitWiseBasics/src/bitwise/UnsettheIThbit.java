package bitwise;

public class UnsettheIThbit {

	//	or its Simple min set the ith bit to the 0
	
	static int setToZero(int n, int i) {
		int mask = ~(1<<(i-1));
		int result = n&mask;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setToZero(15, 4));
	}

}
