
public class SecondLargest {
	
	public static int Secondlar(int a[]) {
		int largest=0;
		int secondLargest=-1;
		for (int i=0;i<a.length;i++) {
			if(a[i]>a[largest]) {
				secondLargest=largest;
				largest =i;
			}else if(a[i]<a[largest]) {
				if(secondLargest==-1 || a[i]>a[secondLargest]) {
					secondLargest=i;
				}
			}
		}
		return secondLargest;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,32,45,31};
		int output=Secondlar(array);
		System.out.println(array[output]);
	}

}
