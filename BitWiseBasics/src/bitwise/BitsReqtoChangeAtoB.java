package bitwise;

public class BitsReqtoChangeAtoB {
	
	static int countSetbits(int n) {
		int count=0;
		while (n!=0) {
			count ++;
			n=n&(n-1);
		}
		return count;
	}

	static int Flippedcount(int a, int b) {
		return countSetbits(a^b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Flippedcount(10, 20));
	}

}
