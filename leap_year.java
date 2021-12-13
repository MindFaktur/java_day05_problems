import java.util.Scanner;

public class leap_year{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the year to check if its a leap year ");
		int value = obj.nextInt();
		if ( value > 999 && value < 10000){
			if ( (value%4 == 0) || (value%100 == 0) || (value%400 == 0) ){
				System.out.println( value + " is a leap year ");
			}else{
				System.out.println( value + " is not a leap year ");
			}
		}else{
			System.out.println( " please enter a 4 digit number ");
		}
	}
}
