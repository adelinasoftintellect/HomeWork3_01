
import java.util.Scanner;

public class HomeWork3_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter integer a:");
		int a = input.nextInt();

		System.out.println("Please enter integer b:");
		int b = input.nextInt();

		if (a > 0 && b > 0) {
			System.out.println("Result (a / b) is: +");

		} else if (a < 0 && b < 0) {
			System.out.println("Result (a / b) is: +");

		} else {
			System.out.println("Result (a / b) is: -");
		}
		input.close();

	}
}
