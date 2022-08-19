package bbitwiseII;

public class twoNonRepeatingElemnets {
	
	static int findThosetwo(int a[]) {
		int xor =0;
		for(int i=0;i<a.length;i++) {
			xor=xor^i;
		}
		
		int temp=xor;
		int mask =xor&(~(xor-1));
		for(int e:a) {
			if((mask&e)==0) {
				temp=temp^e;
			}
		}
		int firstNumber = temp;
		int secondNumber = xor ^ firstNumber;
		
		int res[] = new int[2];
		res[0] = firstNumber;
		res[1] = secondNumber;
		
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 1, 4, 1, 2, 3, 4, 7};

		int res = findThosetwo(a);
//		
		for(int e: res) {
			System.out.println(e);
		}
	}

}
