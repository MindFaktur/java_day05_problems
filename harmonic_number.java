import java.util.Scanner;

public class harmonic_number{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter a number to find its harmonic number value ");
		int n = obj.nextInt();
		if ( n > 0 ){
			double harmonic_value = 0;
			for ( double i = 1; i <= n; i++ ){
				harmonic_value = (harmonic_value + (1/i));
			}
			System.out.println(harmonic_value);
		}else{
			System.out.println(" enter a number greater than 0 ");
		}
	}
}
