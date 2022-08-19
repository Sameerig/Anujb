package mathmatics.second;

public class IfaNumberOftwo {
	
	public static boolean Powoftwo(int n) {
		int mask =n-1;
		int result = n&mask;
		if(result/2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Powoftwo(16));
	}

}
