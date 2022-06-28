
public class frequency {
	
	public static void freqfind(int a[]) {
		int count =1;
		for(int i=0;i<a.length;i++) {
//			int number = a[i];
			if(a[i]==a[i+1]) {
				count++;
			}else{
				System.out.println(a[i]+" comes "+count+" times");
				count =1;
			}
		}
		System.out.println(a[a.length-1]+" comes "+count+" times");

	}
	
	public static void main(String[] args) {
		int[] array= {2,2,3,3,5,5,5,21,21,23};
		freqfind(array);
	}
}
