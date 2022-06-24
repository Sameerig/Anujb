
public class thirdLargestarray {
	
	public static int Thirdone(int a[]) {
		 int largest = 0;
		    int secondLargest = -1;
		    int thirdLargest = -2;

		    for (int i = 0; i < a.length; i++) {
		        if (a[i] > a[largest]) {
		            thirdLargest = secondLargest;
		            secondLargest = largest;
		            largest = i;
		        } else if (a[i] < a[largest]) {
		            if (secondLargest == -1 || a[i] > a[secondLargest]) {
		                thirdLargest = secondLargest;
		                secondLargest = i;
		            }else if (a[i] < a[secondLargest]) {
		                if (thirdLargest == -2 || a[i] > a[thirdLargest]) {
		                    thirdLargest =i;
		                }
		            }
		        }
		    }
		    return thirdLargest;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {23,21,32,12,23};
		int output = array[Thirdone(array)];
		System.out.println(output);
		
	}

}
