
public class maxsubarrPrint {
	public static void maxArr(int a[]) {
		int curentsum=0;
		int maxSum=0;
		for(int i=0;i<a.length;i++) {
			curentsum+=a[i];
			if(maxSum<curentsum) maxSum=curentsum;
			if(curentsum<0) curentsum=0;
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[]= {-2,7,-6,4,1,-3,8};
		maxArr(array);
	}
}
