import java.util.Scanner;

public class quotRemain{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the number to find its quotient and remainder ");
		float number = obj.nextFloat();
		System.out.println(" Enter the number to divide above number ");
		float divisor = obj.nextFloat();
		System.out.println(" quotient is " + (number/divisor) + " & remainder is " + (number%divisor));
	}
}
