
public class Largestelement {
	public static int findmax(int array[]) {
		int max=0;
		for(int i=0;i<array.length ;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			
		}
		return max;
	}
	public static void main(String[] args){
		int myarr[]= {29083,43,543,19999};
		int output = findmax(myarr);
		System.out.println(output);
	}
}
