package backtracking;

public class MeanMedianMode {

	public static int Mean(int a[]) {
		int result=0;
		int i=0;
		for(;i<a.length;i++) {
			result+=a[i];
			i+=0;
		}
		return result/i;
	}
	
	public static int median(int a[]) {
		int n= a.length-1;
		if(n%2==0) return a[n/2];
		int media = ((n+1)/2 +(n-1)/2)/2;
		return a[media];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(median(a));
	}

}
