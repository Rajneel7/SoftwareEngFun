package sefA1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class salesEmployee {
	public void salesEmploye() throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<Product>();
		check(list);
		while (true) {
			System.out.println("     Welcome to our store");
			System.out.println("Select function: (1.View stock list  2.Remove item 3.Cancel transaction 4.Quit))");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
				  // checklist
				  print(list); 
			case 3:
			// Cancel transaction 
			  cancel(list);
			case 4: 
				  // quit
				  return; 
				  default: 
				  System.out.println("Wrong function"); 
			}
		}
	}

	
			private void cancel(ArrayList<Product> list) { 
				 int sum = 0; 
				 for (int i = 1; i < list.size(); i++) { 
				  Product f = list.get(i); 
				  sum += f.getMoney(); 
				
				  System.out.println("Price: " + sum+""); 
				  System.out.println("Shopping cart has been cleared"); 
				 } 
				   
				 //After checkout quantity set to 0
				 for (int i = 0; i < list.size(); i++) { 
				  Product f = list.get(i); 
				  f.setNumber(0); 
				 } 
		
	}

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
			 System.out.println("ID\tName\tPrice"); 
			 for (int i = 0; i < list.size(); i++) { 
			  Product f = list.get(i); 
			  System.out.println(f.getId() + "\t" + f.getName() + "\t"
			   + f.getPrice() + "\t" + f.getUnit()); 
			 } 

	}
}