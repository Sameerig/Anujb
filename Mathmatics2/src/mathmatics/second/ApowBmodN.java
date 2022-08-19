package mathmatics.second;

public class ApowBmodN {
	
	public static double convert(long a, long b, long m) {
		long result =(long) (Math.pow(a, b)%m);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert(2, 40, 13));
	}

}
