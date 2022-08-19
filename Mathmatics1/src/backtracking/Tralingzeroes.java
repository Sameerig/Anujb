package backtracking;

public class Tralingzeroes {
	
	public static int Tzf(int n) {
		if(n<0) return -1;
		 int count = 0;
		 for (int i = 5; n / i >= 1; i *= 5)
			 count += n / i;
		 return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Tzf(5));
	}

}
