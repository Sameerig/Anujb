
public class laddersproblem {
	
	static void leadersinArray(int a[]) {
		int largest = Integer.MIN_VALUE;
		for (int i=a.length-1;i>=0;i--) {
			if(a[i]>largest) {
				largest=a[i];
				System.out.println(a[i]+ " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,7,4,1,3};
		leadersinArray(a);
	}

}
