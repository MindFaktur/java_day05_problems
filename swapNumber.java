import java.util.Scanner;

public class swapNumber{
	static float a,b;
	public static void main(String[] args){
		System.out.println(" Enter a ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextFloat();
		System.out.println(" Enter b ");
		b = obj.nextFloat();
		System.out.println(" value a is " + a);
		System.out.println(" value b is " + b);
		swap(a,b);
		System.out.println(" after swap a is " + a);
		System.out.println(" after swap b is " +b);
	}
	public static void swap(float x, float y){
		float c = x;
	   a = y;
		b = c;
	}
}
