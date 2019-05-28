package sefA1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class checkout {
	public void shop() throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<Product>();
		check(list);
		while (true) {
			System.out.println("     Welcome to our store");
			System.out.println("Select function: (1.View stock list  2.Check Price 3.Buy item 4.Checkout 5.Quit))");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				// checklist
				print(list);
				break;
			case 2:
				// Check Price
				price(list);
				break;
			case 3:
				// buy
				buy(list);
				break;
			case 4:
				// checkout
				checkOut(list);
				break;
			case 5:
				// quit
				return;
			default:
				System.out.println("Wrong function");
			}

		}

	}

	

	private void checkPrice(ArrayList<Product> list) throws IOException {
			BufferedReader br = new BufferedReader(new FileReader("/Users/shuhaoshi/Desktop/Product.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				Product f = new Product(str[0], str[1], Integer.parseInt(str[2]), "");
				list.add(f);
			}
			br.close();
		}

		public void price(ArrayList<Product> list) {
			System.out.println("ID\tName\tPrice");
			for (int i = 0; i < list.size(); i++) {
				Product f = list.get(i);
				System.out.println(f.getId() + "\t" + f.getName() + "\t" + f.getPrice() + "\t"  + f.getUnit());
			}
		
	}



	// Checkout
	private void checkOut(ArrayList<Product> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			sum += f.getMoney();
		}

		if (sum > 200) {
			int newSum = (int) (sum * 0.9);
			System.out.println("Price:" + sum + ", Discounted Price: " + newSum + "");
		} else {
			System.out.println("Price: " + sum + "");
		}

		// After checkout quantity set to 0
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			f.setNumber(0);
		}
	}

	// Buy item
	 public void buy(ArrayList<Product> list) throws IOException { 
		 Scanner sc1 = new Scanner(System.in); 
		 Scanner sc2 = new Scanner(System.in); 
		 price(list); 
		 while (true) { 
		  System.out.println("10% discount if shop over 200!"); 
		  System.out.println("Enter item ID(If finished buying，Enter -1 to quit)"); 
		  String id = sc1.nextLine(); 
		  if ("-1".equals(id)) { 
		  System.out.println("Go to checkout "); 
		  return; 
		  } else { 
		  boolean flag = false; 
		  for (int i = 0; i < list.size(); i++) { 
		   Product f = list.get(i); 
		   if(f.getId().equals(id)) { 
		   System.out.println("Enter " + f.getName() + " amount： "); 
		   int num = sc2.nextInt(); 
		   f.setNumber(num); 
		   flag = true; 
		   } 
		  } 
		  if(!flag){ 
		   System.out.println("ID incorrect, re-enter"); 
		  } 
		  } 
				

		}

	}
	// public String id() {
	// Scanner sc1 = new Scanner(System.in);
	// String id = sc1.nextLine();
	// return id;
	// }

	// Checkitem
	public void check(ArrayList<Product> list) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/shuhaoshi/Desktop/Product.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(" ");
			Product f = new Product(str[0], str[1], Integer.parseInt(str[2]), "");
			list.add(f);
		}
		br.close();
	}

	public void print(ArrayList<Product> list) {
		System.out.println("ID\tName");
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			System.out.println(f.getId() + "\t" + f.getName() + "\t"  + f.getUnit());
		}
	}
}