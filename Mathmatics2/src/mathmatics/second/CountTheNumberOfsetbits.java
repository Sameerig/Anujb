package mathmatics.second;

public class CountTheNumberOfsetbits {
	
	static int countSetBits(int n) {
		int count = 0;
		
		while(n > 0) {
			if((n & 1) == 1) {
				count++;
			}
			n =  n>>1;
//			n >>= 1;
		}
		return count;
	}
	static int countsetbitAchaa(int n) {
		int count =0;
		while (n>0) {
//			System.out.println(n);
			count++;
			n=(n&(n-1));
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countsetbitAchaa(123));
	}

}
