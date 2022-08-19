package backtracking;

public class Gcd {
	
	public static int gcd(int a, int b) {
		if(a==b) return a;
		if(a<b) return gcd(b,a);
		return gcd(a-b,b);
	}
	static int gcdEuclid(int a, int b) {
		if(a<b) return gcdEuclid(b,a);
		if(b==0 ) return a;
		return gcdEuclid(a%b,b);
		
	}
	public static void main(String[] args) {
		int a=24;
		int b=40;
		System.out.println(gcd(a,b));
	}
}
