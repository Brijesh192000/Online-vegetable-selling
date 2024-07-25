package food;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruits extends OnlineShop {
	//ArrayList list2 = new ArrayList();
	public void types2() {
		System.out.println("Enter your fruits");
		System.out.println("1.Apple");
		System.out.println("2.Banana");
		System.out.println("3.Pomegranate");
		System.out.println("4.Mango");
		System.out.println("5.Orange");
		System.out.println("6.Pineapple");
		System.out.println("7.Grapes");
		System.out.println("8.Water-melon");
		System.out.println("9.Papaya");
		System.out.println("10.Guava");
		System.out.println("11.Blueberry");
		System.out.println("12.Lychee");
		System.out.println("13.Peach");
		System.out.println("14.Pear");
		System.out.println("15.Plum");
		System.out.println("16.Strawbeery");
		System.out.println("17.MuskMelon");
		System.out.println("18.Grapefruit");
		System.out.println("19.JavaPlum");
		System.out.println("20.Sapodilla");
		System.out.println("21.Cherry");
		System.out.println("22.Go back to the onlineshop page");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch (n)
		{
		case 1:{
			apple();
			break;
		}
		case 2:{
			banana();
			break;
		}
		case 3:{
			pomegranate();
			break;
			
		}
		case 4:{
			mango();
			break;
		}
		case 5:{
			orange();
			break;
		}
		case 6:{
			pineapple();
			break;
		}
		case 7:{
			grapes();
		}
		case 8:{
			waterMelon();
		}
		case 9:{
			papaya();
		}
		case 10:{
			guava();
		}
		case 11:{
			blueBerry();
		}
		case 12:{
			lychee();
		}
		case 13:{
			peach();
		}
		case 14:{
			pear();
		}
		case 15:{
			plum();
		}
		case 16:{
			strawBerry();
		}
		case 17:{
			muskMelon();
		}
		case 18:{
			grapeFruits();
		}
		case 19:{
			javaPlum();
		}
		case 20:{
			sapodilla();
		}
		case 21:{
			cherry();
		}
		case 22:{
			onlineshop();
			
		}
		default:
			System.out.println("Enter valid input");
			types2();
		}
		
	}
	public void apple() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of apple rs 250 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+250;
				Vegetable.list.add("apple");
				Vegetable.price.add(250);
				System.out.println("Do You want order more");
				System.out.println("1.order same fruits");
				System.out.println("2.change fruits ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int n = s.nextInt();
				switch (n) {
				case 1:{
					apple();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					 Fruits f= new Fruits();
					 f.types2();
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
					apple();
				}
			}else if (c=='n'|| c=='N') {
				apple();
			}
			
		
	}
	public void banana() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of banana rs 30 per derzon");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+30;
				Vegetable.list.add("banana");
				Vegetable.price.add(30);
				System.out.println("Do You want order more");
				System.out.println("1.order same fruits");
				System.out.println("2.change fruits ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int n = s.nextInt();
				switch (n) {
				case 1:{
					banana();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Fruits f = new Fruits();
					f.types2();
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
					banana();
				}
			}else if (c=='n'|| c=='N') {
				banana();
			}
			
		
	}
	public void pomegranate() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of Pomegranate rs 80 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+80;
				Vegetable.list.add("pomegranate");
				Vegetable.price.add(80);
				System.out.println("Do You want order more");
				System.out.println("1.order same fruits");
				System.out.println("2.change fruits ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int n = s.nextInt();
				switch (n) {
				case 1:{
					banana();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Fruits f = new Fruits();
					f.types2();
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
					pomegranate();
				}
			}else if (c=='n'|| c=='N') {
				pomegranate();
			}
	}
	public void mango() {
		Scanner s = new Scanner(System.in); 
		
			System.out.println("price of mango rs 150 per 1kg");
			System.out.println("confirm order press Y/N");
			char c =s.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("Order Confirm");
				SignIn.total_Bill=SignIn.total_Bill+150;
				Vegetable.list.add("mango");
				Vegetable.price.add(150);
				System.out.println("Do You want order more");
				System.out.println("1.order same fruits");
				System.out.println("2.change fruits ");
				System.out.println("3.Go Back");
				System.out.println("4.proceed bill");
				
				int n = s.nextInt();
				switch (n) {
				case 1:{
					mango();
					break;
				}
				case 2:{
					onlineshop();
					break;
				}
				case 3:{
					Fruits f = new Fruits();
					f.types2();
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
					mango();
				}
			}else if (c=='n'|| c=='N') {
				mango();
			}
		}
		public void orange() {
				Scanner s = new Scanner(System.in); 
				
					System.out.println("price of orange rs 150 per 1kg ");
					System.out.println("confirm order press Y/N");
					char c =s.next().charAt(0);
					if(c=='y'||c=='Y') {
						System.out.println("Order Confirm");
						SignIn.total_Bill=SignIn.total_Bill+150;
						Vegetable.list.add("orange");
						Vegetable.price.add(150);
						System.out.println("Do You want order more");
						System.out.println("1.order same fruits");
						System.out.println("2.change fruits ");
						System.out.println("3.Go Back");
						System.out.println("4.proceed bill");
						
						int n = s.nextInt();
						switch (n) {
						case 1:{
							orange();
							break;
						}
						case 2:{
							onlineshop();
							break;
						}
						case 3:{
							Fruits f = new Fruits();
							f.types2();
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
							orange();
						}
					}else if (c=='n'|| c=='N') {
						orange();
					}
					
		}
		public void pineapple() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of pineapple rs 70 per piece");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+70;
					Vegetable.list.add("pineaaple");
					Vegetable.price.add(70);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						pineapple();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						pineapple();
					}
				}else if (c=='n'|| c=='N') {
					pineapple();
				}
				
	}
		public void grapes() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of orange rs 40 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+40;
					Vegetable.list.add("grapes");
					Vegetable.price.add(40);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						grapes();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						grapes();
					}
				}else if (c=='n'|| c=='N') {
					grapes();
				}
				
	}
		public void waterMelon() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of orange rs 80 per piece");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+80;
					Vegetable.list.add("orange");
					Vegetable.price.add(80);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						waterMelon();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						waterMelon();
					}
				}else if (c=='n'|| c=='N') {
					waterMelon();
				}
				
	}
		public void papaya() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of papaya rs 60 per piece");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+60;
					Vegetable.list.add("papaya");
					Vegetable.price.add(60);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						papaya();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						papaya();
					}
				}else if (c=='n'|| c=='N') {
					papaya();
				}
				
	}
		public void guava() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of guava rs 30 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+30;
					Vegetable.list.add("guava");
					Vegetable.price.add(30);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						guava();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						guava();
					}
				}else if (c=='n'|| c=='N') {
					guava();
				}
				
	}
		public void blueBerry() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of blueBerry rs 150 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+150;
					Vegetable.list.add("blueberry");
					Vegetable.price.add(150);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						blueBerry();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						blueBerry();
					}
				}else if (c=='n'|| c=='N') {
					blueBerry();
				}
				
	}
		public void lychee() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of lychee rs 200 per kg ");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+200;
					Vegetable.list.add("lychee");
					Vegetable.price.add(200);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						lychee();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						lychee();
					}
				}else if (c=='n'|| c=='N') {
					lychee();
				}
				
	}
		public void peach() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of peach rs 200 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+200;
					Vegetable.list.add("peach");
					Vegetable.price.add(200);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						peach();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						peach();
					}
				}else if (c=='n'|| c=='N') {
					peach();
				}
				
	}
		public void pear() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of pear rs 100 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+150;
					Vegetable.list.add("pear");
					Vegetable.price.add(150);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						pear();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						pear();
					}
				}else if (c=='n'|| c=='N') {
					pear();
				}
				
	}
		public void plum() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of plum rs 150 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+150;
					Vegetable.list.add("plum");
					Vegetable.price.add(150);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						plum();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						plum();
					}
				}else if (c=='n'|| c=='N') {
					plum();
				}
				
	}
		public void strawBerry() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of strawBerry rs 100 per 500g ");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+100;
					Vegetable.list.add("strawBerry");
					Vegetable.price.add(100);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						strawBerry();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						strawBerry();
					}
				}else if (c=='n'|| c=='N') {
					strawBerry();
				}
				
	}
		public void muskMelon() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of muskMelon rs 50 per piece");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+50;
					Vegetable.list.add("muskMelon");
					Vegetable.price.add(50);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						muskMelon();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						muskMelon();
					}
				}else if (c=='n'|| c=='N') {
					muskMelon();
				}
				
	}
		public void grapeFruits() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of grapeFruits rs 150 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+150;
					Vegetable.list.add("grapeFruits");
					Vegetable.price.add(150);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						grapeFruits();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						grapeFruits();
					}
				}else if (c=='n'|| c=='N') {
					grapeFruits();
				}
				
	}
		public void javaPlum() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of javaPlum rs 150 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+150;
					Vegetable.list.add("javaPlum");
					Vegetable.price.add(150);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						javaPlum();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						javaPlum();
					}
				}else if (c=='n'|| c=='N') {
					javaPlum();
				}
				
	}
		public void sapodilla() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of sapodilla rs 60 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+60;
					Vegetable.list.add("sapodilla");
					Vegetable.price.add(60);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						sapodilla();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						sapodilla();
					}
				}else if (c=='n'|| c=='N') {
					sapodilla();
				}
				
	}
		public void cherry() {
			Scanner s = new Scanner(System.in); 
			
				System.out.println("price of cherry rs 250 per 1kg");
				System.out.println("confirm order press Y/N");
				char c =s.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("Order Confirm");
					SignIn.total_Bill=SignIn.total_Bill+150;
					Vegetable.list.add("cherry");
					Vegetable.price.add(150);
					System.out.println("Do You want order more");
					System.out.println("1.order same fruits");
					System.out.println("2.change fruits ");
					System.out.println("3.Go Back");
					System.out.println("4.proceed bill");
					
					int n = s.nextInt();
					switch (n) {
					case 1:{
						cherry();
						break;
					}
					case 2:{
						onlineshop();
						break;
					}
					case 3:{
						Fruits f = new Fruits();
						f.types2();
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
						cherry();
					}
				}else if (c=='n'|| c=='N') {
					cherry();
				}
				
	}
			
}
