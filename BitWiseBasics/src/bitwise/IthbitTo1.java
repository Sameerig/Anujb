package bitwise;

public class IthbitTo1 {
	
	static int setTheBit(int n, int i) {
		int mask=1<<i;
		int result = mask|n;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setTheBit(15, 3));
	}

}
