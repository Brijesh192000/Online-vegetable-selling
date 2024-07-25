package food;

import java.util.ArrayList;
import java.util.Scanner;

public class Vegetable extends OnlineShop {
	static ArrayList<Integer> price=new ArrayList();
	static ArrayList<String>list=new ArrayList();
	public void types() {
		System.out.println("Enter your vegetable number");
		System.out.println("1.tomato");
		System.out.println("2.bringle");
		System.out.println("3.cauliflower");
		System.out.println("4.cabbage");
		System.out.println("5.pumpkin");
		System.out.println("6.green_pea");
		System.out.println("7.cucumber");
		System.out.println("8.carrot");
		System.out.println("9.beetroot");
		System.out.println("10.white_radish");
		System.out.println("11.french_beans");
		System.out.println("12.potato");
		System.out.println("13.onion");
		System.out.println("14.garlic");
		System.out.println("15.Go Back to the onlineshop page");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		switch (n)
		{
		case 1:{
			tomato();
			break;
		}
		case 2:{
			bringle();
			break;
		}
		case 3:{
			cauliflower();
			break;
			
		}
		case 4:{
			cabbage();
			break;
		}
		case 5:{
			pumpkin();
			break;
		}
		case 6:{
			green_pea();
			break;
		}
		case 7:{
			cucumber();
		}
		case 8:{
			carrot();
		}
		case 9:{
			beetroot();
		}
		case 10:{
			white_radish();
		}
		case 11:{
			french_beans();
		}
		case 12:{
			potato();
		}
		case 13:{
			onion();
		}
		case 14:{
			garlic();
		}
		case 15:{
			onlineshop(); 
			
			
		}
		default:
			System.out.println("Enter valid input");
			types();
		}
		
	}
	public void tomato() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of tomato rs 60 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+60;
				Vegetable.list.add("tomato");
				price.add(60);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.change vegetables ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					tomato();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}

					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					tomato();
				}
			}else if (c=='n'|| c=='N') {
				tomato();
			}
		
	}
	public void bringle() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of bringle rs 40 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+40;
				Vegetable.list.add("bringle");
				price.add(40);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					bringle();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					bringle();
				}
			}else if (c=='n'|| c=='N') {
				bringle();
			}
		
	
	}
    public void cauliflower() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of cauliflower rs 80 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+80;
				Vegetable.list.add("cauliflower");
				price.add(80);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetable");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					cauliflower();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					cauliflower();
				}
			}else if (c=='n'|| c=='N') {
				cauliflower();
			}
		
	
	}
    public void cabbage() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of cabbage rs 30 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+30;
				Vegetable.list.add("cabbage");
				price.add(30);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.change vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					cabbage();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					cabbage();
				}
			}else if (c=='n'|| c=='N') {
				cabbage();
			}
		
	
	}
    public void pumpkin() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of pumpkin rs 20 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+20;
				Vegetable.list.add("pumpkin");
				price.add(20);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.change vegetables");
				System.out.println("3.Go back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					pumpkin();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					pumpkin();
				}
			}else if (c=='n'|| c=='N') {
				pumpkin();
			}
		
	
	}
    public void green_pea() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of green_pea rs 60 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+60;
				Vegetable.list.add("green_pea");
				price.add(60);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					green_pea();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					green_pea();
				}
			}else if (c=='n'|| c=='N') {
				green_pea();
			}
    }
    public void cucumber() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of cucumber rs 40 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+40;
				Vegetable.list.add("cucumber");
				price.add(40);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					cucumber();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					cucumber();
				}
			}else if (c=='n'|| c=='N') {
				cucumber();
			}		
		
	}
    public void carrot() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of carrot rs 60 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+60;
				Vegetable.list.add("carrot");
				price.add(60);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					carrot();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					carrot();
				}
			}else if (c=='n'|| c=='N') {
				carrot();
			}
    }
    public void beetroot() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of beetroot rs 40 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+40;
				Vegetable.list.add("beetroot");
				price.add(40);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					beetroot();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					beetroot();
				}
			}else if (c=='n'|| c=='N') {
				beetroot();
			}
    }
    public void white_radish() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of white_radish rs 10 per pic");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+10;
				Vegetable.list.add("white_radish");
				price.add(10);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					white_radish();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					white_radish();
				}
			}else if (c=='n'|| c=='N') {
				white_radish();
			}
    }
    public void french_beans() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of feanch_beans rs 60 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+60;
				Vegetable.list.add("french_beans");
				price.add(60);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					french_beans();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					french_beans();
				}
			}else if (c=='n'|| c=='N') {
				french_beans();
			}
    }
    public void potato() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of potato rs 30 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+30;
				Vegetable.list.add("potato");
				price.add(30);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					potato();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					potato();
				}
			}else if (c=='n'|| c=='N') {
				potato();
			}
    }
    public void onion() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of onion rs 30 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+30;
				Vegetable.list.add("onion");
				price.add(30);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Change Vegetables");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					onion();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					onion();
				}
			}else if (c=='n'|| c=='N') {
				onion();
			}
    }
    public void garlic() {
		
		Scanner s = new Scanner(System.in); 

			System.out.println("price of garlic rs 120 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+40;
				Vegetable.list.add("garlic");
				price.add(40);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.Go Back");
				System.out.println("3.Change Vegetable");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					garlic();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Vegetable v = new Vegetable();
					v.types();
					break;
				}
				case 4:{
					System.out.println("ordered items");
					for (Object obj:Vegetable.list) {
						System.out.println(obj);
					}
					System.out.println(SignIn.total_Bill);
					System.out.println("Thank you");
					System.exit(0);
				}
				default:
					System.out.println("invalid input");
					garlic();
				}
			}else if (c=='n'|| c=='N') {
				garlic();
			}
    }
 
 
 
 
 
 
}

