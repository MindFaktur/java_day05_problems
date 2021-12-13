import java.util.Scanner;

public class distance{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter x co-ordinate ");
		int x = obj.nextInt();
		System.out.println(" Enter y co-ordinate ");
		int y = obj.nextInt();
		float length = (float)Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		System.out.println(" The length of given point (" + x  + "," + y + ") is " + length);
	}
}
