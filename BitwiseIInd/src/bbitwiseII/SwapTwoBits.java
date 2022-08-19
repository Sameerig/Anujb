package bbitwiseII;

public class SwapTwoBits {
	
	static int afterSwapingBits(int n,int i,int j) {
		int ith =(n>>i)&1;
		int jth =(n>>j)&1;
		if(ith==jth) return n;
		int mask= (1<<i)|(1<<j);
		return n^mask;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(afterSwapingBits(10, 1, 2));
	}

}
