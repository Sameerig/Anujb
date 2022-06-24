
public class reverseAr {
	public static void revarr(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println("reverse of the array is: "+a[i]);
		}
	}
	
	public static void main(String[] args) {
		int array[] = {36,34,23,43,21};
		revarr(array);
		
	}
}
