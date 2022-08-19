package mathmatics.second;

public class fastPowerr {
	public static int fast(int a ,int b) {
		if(b==0) return 1;
		int halfres= fast(a,b/2);
		int fullres = halfres*halfres;
		if(b%2!=0) fullres= fullres*a;
		return fullres;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fast(3,4));
	}

}
