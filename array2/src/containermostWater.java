
public class containermostWater {
	
	static int containerWithmostWater(int a[]) {
		int maxArea=0;
		int l=0;
		int r =a.length-1;
		
		while(l<r) {
			int height =Math.min(a[l], a[r]);
			int distance =r-l;
			int area = height*distance;
			maxArea = Math.max(maxArea, area);
			
			if(a[l]<a[r]) {
				l++;
			}else {
				r--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,6,2,4,5,8,3,7};
		int output=containerWithmostWater(a);
		System.out.println(output);

	}

}
