package mathmatics.second;

public class MaskandFind {

	public static int maskFind(int n, int i) {
		int mask= 1<<i;
		int result =n&mask;
		if(result ==0) return 0;
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(maskFind(n, 0));
	}
	

}
