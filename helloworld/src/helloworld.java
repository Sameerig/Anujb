import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		Scanner r= new Scanner (System.in);
		System.out.println("enter the radius of circle: ");
		double radius = r.nextDouble();
		double area = (3.14*radius*radius);
		double peremiter =(2*3.14*radius);
		System.out.println(area);
		System.out.println(peremiter);
	}

}
