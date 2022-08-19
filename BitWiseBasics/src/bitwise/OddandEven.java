package bitwise;

public class OddandEven {
	
	static boolean CheckforOddEven(int n) {
		if((n^1)==n+1) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		System.out.println(CheckforOddEven(n));
	}

}
