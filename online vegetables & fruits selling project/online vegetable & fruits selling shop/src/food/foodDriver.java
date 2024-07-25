package food;


import java.util.Scanner;

public class foodDriver {
	static {
		System.out.println("Welcome to my online vegetable & fruits selling shop");
	}
	
	void login() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your option");
		System.out.println("1.CreateAccount");
		System.out.println("2.Logining");
		System.out.println("3.Exit");
		int choice = s.nextInt();
		SignIn i= new SignIn();
		
		switch(choice) {
		case 1:{
			i.createAccount();
			break;
		}
		case 2:{
			i.login();
			break;
		}
		case 3:{
			System.out.println("Thank you and visit Again");
			System.exit(0);
		}
		
		default:{
			System.out.println("Enter valid option");
			main(null);
			}
		}
		OnlineShop o = new OnlineShop();
		o.onlineshop();
		}
	
    public static void main(String[] args) 
	{
		
		foodDriver f =new foodDriver();
    	f.login();
		//Vegetable v =new Vegetable();
		//v.types();
	
	}
	}

	



