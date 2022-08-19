package bitwise;

public class Swap2numbers {
	
	static void swapTwonumbers(int x, int y) {
		System.out.println("x= "+x+" y= "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x= "+x+" y= "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapTwonumbers(3, 4);
	}

}
