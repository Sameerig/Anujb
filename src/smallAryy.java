
public class smallAryy {
	public static int Smallelement(int a[]) {
		int small=1000000000;
		for(int i=0;i<a.length;i++) {
			if(small>a[i]) {
				small=a[i];
			}
		}
		return small;
		
	}
	
	public static void main(String[] agrs) {
		int array[]= {30,54,42,45,4};
		int output = Smallelement(array);
		System.out.println(output);
	}
}
