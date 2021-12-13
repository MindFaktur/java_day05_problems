import java.util.Scanner;

public class evenOdd{
	public static void main(String[] args){
		System.out.println(" Enter a number to find if its a odd or even ");
		Scanner obj = new Scanner(System.in);
		float n = obj.nextFloat();
		if ( n % 2 == 0 ){
			System.out.println( n + " is a even number");
		}else{
			System.out.println( n + " is a odd number");
		}
	}
}
