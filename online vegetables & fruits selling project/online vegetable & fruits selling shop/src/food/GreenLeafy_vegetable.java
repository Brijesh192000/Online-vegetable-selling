package food;

import java.util.ArrayList;
import java.util.Scanner;

public class GreenLeafy_vegetable extends OnlineShop {
//	ArrayList list1=new ArrayList();
	public void types1(){
		System.out.println("Enter your GreenLeafy_vegetable");
		System.out.println("1.Spanish");
		System.out.println("2.FenugreekLeaves(methi)");
		System.out.println("3.Spring_onion");
		System.out.println("4.Mustard_leaves(rai saag)");
		System.out.println("5.Wild_spinach(bathua saag)");
		System.out.println("6.Red_chawliLeaves(lal saag)");
		System.out.println("7.Green_chawliLeaves(geern saag)");
		System.out.println("8.Dill_leaves(sowa saag)");
		System.out.println("9.Garlic_leaves");
		System.out.println("10.celery_leaves");
		System.out.println("11.radish_leaves");
		System.out.println("12.Colocasia_leaves(Arbi_leaves)");
		System.out.println("13.Green_coriander");
		System.out.println("14.Mint_leaves");
		System.out.println("15.Go back to the onlineshop page");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		switch (n)
		{
		case 1:{
			spanish();
			break;
		}
		case 2:{
			fenugreekLeaves();
			break;
		}
		case 3:{
			spring_onion();
			break;
			
		}
		case 4:{
			mustard_leaves();
			break;
		}
		case 5:{
			wild_spinach();
			break;
		}
		case 6:{
			red_chawliLeaves();
			break;
		}
		case 7:{
			green_chawliLeaves();
		}
		case 8:{
			dill_leaves();
		}
		case 9:{
			garlic_leaves();
		}
		case 10:{
			celery_leaves();
		}
		case 11:{
			radish_leaves();
		}
		case 12:{
			colocasia_leaves();
		}
		case 13:{
			green_coriander();
		}
		case 14:{
			mint_leaves();
		}
		case 15:{
			onlineshop();
			
		}
		default:
			System.out.println("Enter valid input");
			types1();
		}
		
		
	}
	public void spanish() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of spanish rs 25 per bundle");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+25;
				Vegetable.list.add("spanish");
				Vegetable.price.add(25);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.change vegetables ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int n = s.nextInt();
				switch (n) {
				case 1:{
					spanish();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					GreenLeafy_vegetable v = new GreenLeafy_vegetable();
					v.types1();
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
					spanish();
				}
			}else if (c=='n'|| c=='N') {
				spanish();
			}
			
		
	}
	public void fenugreekLeaves() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of fenugreekLeaves rs 60 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+60;
				Vegetable.list.add("fenugreekLeaves");
				Vegetable.price.add(40);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.change vegetables ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					fenugreekLeaves();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					GreenLeafy_vegetable v = new GreenLeafy_vegetable();
					v.types1();
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
					fenugreekLeaves();
				}
			}else if (c=='n'|| c=='N') {
				fenugreekLeaves();
			}
		
	}
	public void spring_onion() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of spring_onion rs 20 per bundle");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+20;
				Vegetable.list.add("spring_onion");
				Vegetable.price.add(20);
				System.out.println("Do You want order more");
				System.out.println("1.order same vegetable");
				System.out.println("2.change vegetables ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int m = s.nextInt();
				switch (m) {
				case 1:{
					spring_onion();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					GreenLeafy_vegetable v = new GreenLeafy_vegetable();
					v.types1();
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
					spring_onion();
				}
			}else if (c=='n'|| c=='N') {
				spring_onion();
			}
		
	}
	public void mustard_leaves () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of mustard_leaves rs 20 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+20;
			Vegetable.list.add("mustard_leaves");
			Vegetable.price.add(20);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				mustard_leaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				mustard_leaves();
			}
		}else if (c=='n'|| c=='N') {
			mustard_leaves();
		}
	}
	public void wild_spinach () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of wild_spinach rs 20 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+20;
			Vegetable.list.add("wild_spanich");
			Vegetable.price.add(20);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				wild_spinach();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				wild_spinach();
			}
		}else if (c=='n'|| c=='N') {
			wild_spinach();
		}
	}
	public void red_chawliLeaves() {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of red_chawliLeaves rs 20 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+20;
			Vegetable.list.add("red_chawliLeaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				red_chawliLeaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				red_chawliLeaves();
			}
		}else if (c=='n'|| c=='N') {
			red_chawliLeaves();
		}
	}
	public void green_chawliLeaves() {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of green_chawliLeaves rs 20 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+20;
			Vegetable.list.add("green_chawliLeaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				green_chawliLeaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				green_chawliLeaves();
			}
		}else if (c=='n'|| c=='N') {
			green_chawliLeaves();
		}
	}
	public void dill_leaves() {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of dill_leaves rs 20 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+20;
			Vegetable.list.add("dill_leaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				dill_leaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				dill_leaves();
			}
		}else if (c=='n'|| c=='N') {
			dill_leaves();
		}
	}
	public void garlic_leaves () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of garlic_leaves rs 10 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+10;
			Vegetable.list.add("garlic_leaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				garlic_leaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				garlic_leaves();
			}
		}else if (c=='n'|| c=='N') {
			garlic_leaves();
		}
	}
	public void celery_leaves () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of celery_leaves rs 50 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+50;
			Vegetable.list.add("celery_leaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				celery_leaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				celery_leaves();
			}
		}else if (c=='n'|| c=='N') {
			celery_leaves();
		}
	}
	public void radish_leaves () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of radish_leaves rs 30 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+30;
			Vegetable.list.add("mustard_leaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				mustard_leaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				radish_leaves();
			}
		}else if (c=='n'|| c=='N') {
			radish_leaves();
		}
	}
	public void colocasia_leaves () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of colocasia_leaves rs 10 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+10;
			Vegetable.list.add("colocasia_leaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				colocasia_leaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				colocasia_leaves();
			}
		}else if (c=='n'|| c=='N') {
			colocasia_leaves();
		}
	}
	public void green_coriander () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of green_coriander rs 20 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+20;
			Vegetable.list.add("green_coriander");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				green_coriander();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				green_coriander();
			}
		}else if (c=='n'|| c=='N') {
			green_coriander();
		}
	}
	public void mint_leaves () {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("price of mint_leaves rs 20 per bundle");
		System.out.println("confirm order press Y/N");
		char c =s.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Order Confirm");
			SignIn.total_Bill=SignIn.total_Bill+20;
			Vegetable.list.add("mint_leaves");
			Vegetable.price.add(40);
			System.out.println("Do You want order more");
			System.out.println("1.order same vegetable");
			System.out.println("2.change vegetables ");
			System.out.println("3.Go Back");
			System.out.println("4.proceed bill");
			
			int m = s.nextInt();
			switch (m) {
			case 1:{
				mustard_leaves();
				break;
			}
			case 2:{
				onlineshop();
				break;
			}
			case 3:{
				GreenLeafy_vegetable v = new GreenLeafy_vegetable();
				v.types1();
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
				mint_leaves();
			}
		}else if (c=='n'|| c=='N') {
			mint_leaves();
		}
	}

	
	

}
