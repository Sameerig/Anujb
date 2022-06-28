
public class minsubArray {
	
	public static int minsum(int a[]) {
		int currentsum=0;
		int minSm=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			currentsum+=a[i];
			if(minSm>currentsum) minSm=currentsum;
			if(currentsum>0) currentsum=0;
		}
		return minSm;
	}
	
	public static void main(String[] args) {
		int a[]= {3, -4, 2, -3,-1,7,-5};
		int ans =minsum(a);
		System.out.println(ans);
	}
}
