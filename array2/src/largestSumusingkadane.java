
public class largestSumusingkadane {
	
	static int largestSumSubArray(int a[]) {
		int currentsum=0;
		int maxSum =Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			currentsum+=a[i];
			if(maxSum<currentsum) maxSum=currentsum;
			if(currentsum<0) currentsum=0;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-2,7,-6,4,1,-3,8};
		int ans =largestSumSubArray(a);
		System.out.println(ans);
	}

}
