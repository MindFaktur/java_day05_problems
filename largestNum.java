import java.util.Scanner;

public class largestNum{
	public static void main(String[] args){
		System.out.println(" The program to find largest of two numbers ");
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the 1st number ");
		float userVal1 = obj.nextFloat();
		System.out.println(" Enter the 2nd number ");
		float userVal2 = obj.nextFloat();
		System.out.println(" Enter the 3rd number ");
		float userVal3 = obj.nextFloat();
		float largest = userVal1;
		if ( userVal2 > largest && userVal2 > userVal3 ){
			largest = userVal2;
		}else if ( userVal3 > largest && userVal3 > userVal2 ){
			largest = userVal3;
		}
		System.out.println(" The largest number is " + largest);
	}
}
