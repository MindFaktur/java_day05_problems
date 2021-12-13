import java.util.Scanner;

public class windChill{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter temperatur t in farheneit \n(0<t<50)");
		float t = obj.nextInt();
		System.out.println(" Enter wind speed v in miles per hour \n(3<v<120)");
		float v = obj.nextInt();

		float w = (float)(35.74 + (0.6215*t) + (0.4275*t - 35.75)*Math.pow(v,0.16));
		System.out.println(" Wind chill is " + w);
	}
}
