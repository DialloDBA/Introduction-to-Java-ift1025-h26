package ca.umontreal.ift1015;
import java.util.Scanner;

public class Application {
	
	public static void main (String [] args ) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		while(number >= 0) {
			 number = scanner.nextInt();
			System.out.println("Le nombre saisi est : " + number);
		}
		scanner.close();
	}
}
