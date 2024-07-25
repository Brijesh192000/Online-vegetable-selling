package food;

import java.util.Scanner;

public class SignIn implements Register {
	
	String name;
	String emailid;
	long mobilenumber;
	String password;
	String address;
	
	static double total_Bill;
	
	//getter method 
	public String getname()
	{
		return name;
	}
	public String getemailid()
	{
		return emailid;
	}
	public long getmobilenumber()
	{
		return mobilenumber;
	}
	public String getpassword()
	{
		return password;
	}
	public String getaddress()
	{
		return address;
	}
	
	//setter method
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setemailid(String emailid)
	{
		this.emailid=emailid;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	public void setaddress(String address)
	{
		
	}
	public void setmobilenumber()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter yuor mobile number");
		long mno = s.nextLong();
		if(mno>99999999 && mno>1000000000);
		{
			this.mobilenumber = mno;
		}
		
		
	}
	public void createAccount()
	{
		System.out.println("=========Enter your details for createAccount=======");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=s.nextLine();
		//this.name=s.nextLine();
		setname(name);
		
		System.out.println("Enter your email");
		this.emailid=s.nextLine();
		
		System.out.println("Enter your password");
		String password=s.next();
		setpassword(password);
		
		System.out.println("Enter your address");
		String address=s.nextLine();
		address=s.nextLine();
		setaddress(address);
		
		setmobilenumber();
		System.out.println("==========Account successfully created========");
		login();	
	}
	public void login() {
		if(this.mobilenumber !=0)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("press 1.mno login");
			System.out.println("press 2.emailid login");
			int option =s.nextInt();
			
			if(option == 1) {
				System.out.println("Enter your mno");
				long mno = s.nextLong();
				s.nextLine();
				System.out.println("Enter password ");
				String pwd =s.nextLine();
				System.out.println("password");
				if(this.mobilenumber == mno && this.password.equals(pwd))
				{
					System.out.println("=======Login sccessfully done=======" );
				}
				else
				{
					System.out.println("=====Invalid mno and pwd======");
					login();
				}
			}
			else if(option == 2) 
			{
				System.out.println("Enter your emailid");
				String emailid =s.nextLine();
				emailid = s.nextLine();
				System.out.println("Enter password");
				String pwd = s.nextLine();

				if (this.emailid.equals(emailid)&& this.password.equals(pwd))
				{
					System.out.println("Login sucessfully done");
					
				}
				else 
				{
					System.out.println("invalid emailid and pwd");
					login();
				}
			}
				else 
				{
					System.out.println("invalid option");
					login();
				}
			
				
			}else {
				createAccount();
			}
		
			
		}
	@Override
	public void creatAccount() {
		// TODO Auto-generated method stub
		
	}
		
	}
	
	
	


