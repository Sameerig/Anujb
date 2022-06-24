
public class Deleteelement {
	public static int deleteone(int a[], int key) {
		for (int i=0;i<a.length;i++) {
			if(a[i]==key) {
				i=i+1;
				System.out.println(a);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,32,12,34,5};
		int value =12;
		deleteone(a,value);
		
	}

}
