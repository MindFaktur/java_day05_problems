import java.util.Scanner;

public class vowelOrConsonant{
	public static void main(String[] args){
		System.out.println(" Enter an alphabet to find if its a vowel or consonant ");
		Scanner obj = new Scanner(System.in);
		char value = obj.next().charAt(0);
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		boolean answer = false;
		for ( int i = 0; i < 5; i++ ){
			if ( value == vowels[i] ){
				answer = true;
			}
		}
		if (answer){
			System.out.println(" The given alphabet " + value + " is a vowel ");
		}else{
			System.out.println(" The given alphabet " + value + " is a consonant ");
		}
	}
}
