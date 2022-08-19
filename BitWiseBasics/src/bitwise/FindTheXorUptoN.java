package bitwise;

public class FindTheXorUptoN {
	
	static void findAllXor(int n) {
		if (n==0) System.out.println("Not possible");
		int result =0;
		for(int i=0;i<n;i++) {
			result =result^1;
			System.out.println(result+"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAllXor(7);
	}

}
