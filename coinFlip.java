import java.util.Scanner;

public class coinFlip{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter the number of times to flip a coin ");
        int value = obj.nextInt();
		  int action = ( value < 0 ) ? 1 : 0;
		  if ( action == 0 ){
				int totalHeads = 0, totalTails = 0;
				float percentHead, percentTail;
				System.out.println(" The number of times a coin to be flipped is " + value);
				for (int i = 0; i < value; i++){
					int rand_num = (int)(Math.random()*10%2);
					int num = ( rand_num == 0 ) ? totalTails++ : totalHeads++;
				}
				percentHead = ((totalHeads*100)/value);
				percentTail = ((totalTails*100)/value);
				System.out.println(" Head percentage: " + percentHead + " vs Tails percentage: " + percentTail);

			}else{
				System.out.println(" Enter a non-decimal and non negative number ");
			}
    }

}


