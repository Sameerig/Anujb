package mathmatics.second;

public class Findalldivisor {
	
	public static void divisorsSimple(int n) {
		if(n==1) System.out.println(1);
		for(int i = 1; i*i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
				if(n/i != i) System.out.println(n/i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisorsSimple(30);
	}

}
