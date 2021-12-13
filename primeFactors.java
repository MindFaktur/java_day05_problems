import java.util.Scanner;

public class primeFactors{
	public static void main(String[] args){
		System.out.println(" Please enter a number to find its prime Factors ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		for ( int i = 2; i * i <= n; i++ ){
			while ( n % i == 0 ){
				System.out.println(" The prime factor is " + i);
				n = n/i;
			}
		}System.out.println(" The prime factor is " + n);
	}
}
