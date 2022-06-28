
public class zerotoend {
	
	static void zero(int arr[]) {
		int greatest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>greatest && greatest <0 ) {
				greatest=arr[i];
			}else if(arr[i]==0) {
				greatest=0;
			}
			System.out.println(greatest+ " ");
		}
//		return 0;
	}
	
	public static void main(String[] args) {
		int a[] = {8,0,1,3,0,0,5};
		zero(a);
	}
}
