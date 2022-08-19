package backtracking;

public class UniquePath {
	public static int findthePaths(int m,int n) {
		if(n==1||m==1) return 1;
		return findthePaths(m-1,n)+findthePaths(m, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=3;
		System.out.println(findthePaths(m, n));
	}

}
