package mathmatics.second;

public class ToggletheBit {
	
	public static int toggleTheBit(int n, int i) {
		int mask = 1<<(i-1);
		return mask^n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toggleTheBit(5, 1));
	}

}
