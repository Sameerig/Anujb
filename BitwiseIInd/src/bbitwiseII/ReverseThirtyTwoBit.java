package bbitwiseII;

public class ReverseThirtyTwoBit {
	
	static int afterReverse(long n) {
		long res=0;
		int i=0;
		while(i<=31) {
			if((n&(1<<i))!=0) 
				res+=(1L<<(3l-i));
			i++;
		}
		return (int) res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(afterReverse(3));
	}

}
