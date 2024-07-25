package food;

import java.util.Scanner;

public class OnlineShop extends SignIn {
	
	public void onlineshop() 
	{ 
		System.out.println("Enter your choice");
		System.out.println("1.Vegetable");
		System.out.println("2.GreenLeafy_vegetable");
		System.out.println("3.Fruits");
		System.out.println("4.Go Back");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		switch (n) 
		{
		case 1:
		{
			Vegetable v = new Vegetable();
			v.types();
			break;
		}
		case 2:
		{
			GreenLeafy_vegetable v=new GreenLeafy_vegetable();
			v.types1();
			break;
		}
		case 3:
		{
			Fruits f=new Fruits();
			f.types2();
			break;
		}
		case 4:
		{
		 foodDriver f =new foodDriver();
		 f.login();
		 
		}
	default:
			System.out.println("Enter valid input");
			onlineshop();
		}
		
	}


}
