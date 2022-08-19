package backtracking;

public class Palendrone {

	public static boolean palindroneNumbers(int n) {
		int rev=0;
		int temp=n;
		while(temp>0) {
			int ld = temp%10;
			rev= rev*10+ld;
			temp/=10;
		}
		return n==rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1221;
		System.out.println(palindroneNumbers(n));
	}

}
