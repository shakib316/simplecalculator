package calculator;
import java.util.Scanner;

public class Div {

	public void div() {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Sum of numbers is "+ (num1 / num2) );
	}

}
