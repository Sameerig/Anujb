import java.util.Scanner;
public class inchtomet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		System.out.println("Enter the value in the Inches: ");
		float number = user.nextFloat();
		double meter = (0.0254*number);
		System.out.println(meter);
		
	}

}
