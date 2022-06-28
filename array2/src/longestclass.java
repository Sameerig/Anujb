
public class longestclass {
	public static int longest(int nums[]) {
		int counter = 0;
		int max = 0;

	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] == 1)
	            counter++;
	        else
	            counter = 0;

	        max = Math.max(max, counter);
	    }

	    return max;
	    }
	public static void main(String[] args) {
		int a[] = {1,1,1,0,0,1,0,1,1,1,1,0,1};
		int output=longest(a);
		System.out.println(output);
	}
}
