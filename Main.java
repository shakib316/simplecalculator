package calculator;
import java.util.Scanner;


public class Main
{

	public static void main(String[] args) {

	while (true)
	{
		Menu m=new Menu();
		 int s =m.menu();
		 switch(s)
			{
			case 1:
				Add obj = new Add();
			    obj.add();
			    break;
			case 2:
				Sub obj1 = new Sub();
			    obj1.sub();
			    break;
			case 3:
				Mul obj2 = new Mul();
			    obj2.mul();
			    break;
			case 4:
				Div obj3 = new Div();
			    obj3.div();
			    break;
			
		   case 0:
			   System.exit(0);
			   
			}

	}   		

}}