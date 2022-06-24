 
public class duplicateArr {
	
	public static int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {23,23,23,43,54,54,72};
		int output=removeDuplicates(array);
		System.out.println(output);
	}

}
