package bbitwiseII;

public class NonReapatFindifTwo {
	
	public static int nonreapatForTwoArrayElement(int a[]) {
		int res =0;
		for(int i=0;i<a.length;i++) {
			res=res^a[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,4,1,2,3,7,4,1};
		System.out.println(nonreapatForTwoArrayElement(array));
	}

}
