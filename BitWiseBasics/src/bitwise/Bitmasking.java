package bitwise;

public class Bitmasking {
	
	public static int Masking(int n, int i) {
		int mask=1<<i;
		return mask;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Masking(5, 0));
	}

}
