package mathmatics.second;

public class CalculatingPrimeFactor {
	
	public static void allPrimeFactor(int n) {
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+"");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allPrimeFactor(149);
	}

}
