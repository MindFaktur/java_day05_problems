import java.util.Scanner;

public class quadratic{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the value of a ");
		float a = obj.nextFloat();
		System.out.println(" Enter the value of b ");
		float b = obj.nextFloat();
		System.out.println(" Enter the value of c ");
		float c = obj.nextFloat();
		System.out.println(" The quadratic quation is (" + a + "x^2 + " + b + "x + " + c + ")");

		float delta = (b*b - (4*a*c));
		double x1 = (-b + (Math.sqrt(Math.abs(delta))/(2*a)));
		double x2 = (-b - (Math.sqrt(Math.abs(delta))/(2*a)));
		System.out.println(delta);
		System.out.println(" Root 1 of x is " + x1);
		System.out.println(" Root 2 of x is " + x2);
	}
}
