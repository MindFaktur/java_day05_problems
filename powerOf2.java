import java.util.Scanner;

public class powerOf2{
	public static void main(String[] args){
		System.out.println(" Enter a number between 0 and 31 ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int[] array = new int[n] ;
		if ( n > 0 && n < 31 ){
			for ( int i = 0; i < n; i++ ){
				array[i] = (int)(Math.pow(2,i));
				System.out.println(" The value of 2^" + i + " is "  + array[i]);
			}
		}else{
			System.out.println(" Please enter a number between 0 and 31 ");
		}
	}
}
