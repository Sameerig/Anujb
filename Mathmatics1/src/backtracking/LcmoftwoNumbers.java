package backtracking;

public class LcmoftwoNumbers {
	
	public static int gcd(int a,int b) {
		if(a==b) return a;
		if(a<b) return gcd(b,a);
		return gcd(a-b,b);
	}
	
	public static int Lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=24;
		int b=36;
		System.out.println(Lcm(a, b));
	}

}
