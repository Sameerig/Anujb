
public class Searchelement {
	
	public static int Search(int array[],int key) {
		for (int i=0;i<array.length;i++) {
			if (array[i]==key) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,32,12,34,5};
		int value =4;
		int output=Search(a,value);
		System.out.println(output);
	}

}
