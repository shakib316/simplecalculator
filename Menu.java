package calculator;
import java.util.Scanner;

public class Menu {

	public int menu() {
		{	
			System.out.println("**Enter 1 to add**");
			System.out.println("**Enter 2 to sub**");
			System.out.println("**Enter 3 to mul**");
			System.out.println("**Enter 4 to div**");
			System.out.println("**Enter 0 to exit**");
			System.out.println("*****************************");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			return choice;
		}
	}

}