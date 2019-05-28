package sefA1;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
  
public class shopper { 
 public void shop() throws IOException { 
 Scanner sc = new Scanner(System.in); 
 ArrayList<Product> list = new ArrayList<Product>(); 
 check(list); 
 while (true) { 
  System.out 
   .println("     Welcome to our store"); 
  System.out 
   .println("Select function: (1.View stock list  2.Check price 3.Check bulk discount 4.Quit))"); 
  int choice = sc.nextInt(); 
  switch (choice) { 
  
  case 1:
	  s();
	  break;
  case 2:
	  p();
	  break;
  case 3:
	  p();
	  break;
  default: 
  System.out.println("Wrong function"); 
  } 
  
 } 
  
 } 
  
  
 private void checkOut(ArrayList<Product> list) { 
 int sum = 0; 
 for (int i = 0; i < list.size(); i++) { 
  Product f = list.get(i); 
  sum += f.getMoney(); 
 } 
   
 if(sum>200){ 
  int newSum = (int) (sum * 0.9); 
  System.out.println("Price:" + sum+ ", Discounted"+ newSum+""); 
 }else{ 
  System.out.println("Price: " + sum+""); 
 } 
   
 for (int i = 0; i < list.size(); i++) { 
  Product f = list.get(i); 
  f.setNumber(0); 
 } 
 } 
  
  public void buy(ArrayList<Product> list) throws IOException { 
 Scanner sc1 = new Scanner(System.in); 
 Scanner sc2 = new Scanner(System.in); 
 print(list); 
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
  
  public void check(ArrayList<Product> list) throws IOException { 
 BufferedReader br = new BufferedReader(new FileReader("/Users/shuhaoshi/Desktop/Product.txt")); 
 String line; 
 while ((line = br.readLine()) != null) { 
  String[] str = line.split(" "); 
  Product f = new Product(str[0], str[1], Integer.parseInt(str[2])); 
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
 
 public String s() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		char custAnswer;
		char finalAnswer;
		char custSelect;
		int quantity;
		while(true)
		{
			do {
			//Show all the products
			//Product array	
			
			//Products:					selection:
			//Bread							a
			//Milk							b
			//Eggs							c
			System.out.println("Products:		Selection:");
			System.out.println("bread:				a");
			System.out.println("milk:				b");
			System.out.println("eggs				c");
				
				
				System.out.println("Select product using the characters to the right of the product names:");
				custAnswer = sc.next().charAt(0);
				}

			while ((custAnswer != 'a') && (custAnswer != 'b') && (custAnswer != 'c'));
			
				if (custAnswer == 'a')
				{
					 System.out.println("a"); //From the product class 
					//Show all the details about the product bread, E.g price, supplier, discount when bought in bulk
				}
				else if (custAnswer == 'b')
				{
					System.out.println("b"); //From the product class
					//Show all the details about the product milk, E.g price, supplier, discount when bought in bulk
				}
				else if (custAnswer == 'c')
				{
					System.out.println("c"); //From the product class
					//Show all the details about the product eggs, E.g price, supplier, discount when bought in bulk
				}
				System.out.println("Enter selection to add to cart: ");
				custSelect = sc.next().charAt(0);
				System.out.println("Enter quantity: ");
				quantity = sc.nextInt();
				System.out.println("Selection: " + custSelect + "with quantity: " + quantity);
				System.out.println("Select another product: s");
				System.out.println("Exit to the menu: e");
				finalAnswer = sc.next().charAt(0);
				if(finalAnswer == 'e')
				{
					shop();
				}
				if (finalAnswer == 's') continue;
	}
	}
 
 public String p() throws IOException
	{
		while(true) 
		{
			
		String[] values = {"p1000", "p1500", "p2000"};  //change this to the product array where the product's details is contained
		Scanner sc = new Scanner(System.in);
		String custAnswer;
		char finalAnswer;
		do {
				System.out.println("Enter ProductID:");
				custAnswer = sc.nextLine();}
				//change the "values" into the product array with the productID so it can search for the productID and see if it matches
				while(Arrays.stream(values).noneMatch(custAnswer::equals));
				if(Arrays.stream(values).anyMatch(custAnswer::equals)) 
				{
					System.out.println("Product details are as follows:");
					//Show all the details about the product bread, E.g price, supplier, discount when bought in bulk
				}
				
				System.out.println("Enter another productID: p");
				System.out.println("Exit to the menu: e");
				finalAnswer = sc.next().charAt(0);
				if(finalAnswer == 'e')
				{
					shop();
				}
				if (finalAnswer == 'p') continue;
	}
	
}
 public String d() throws IOException
	{
		while(true) 
		{
			
		String[] values = {"p1000", "p1500", "p2000"};  //change this to the product array where the product's details is contained
		Scanner sc = new Scanner(System.in);
		String custAnswer;
		char finalAnswer;
		do {
				System.out.println("Enter ProductID:");
				custAnswer = sc.nextLine();}
				//change the "values" into the product array with the productID so it can search for the productID and see if it matches
				while(Arrays.stream(values).noneMatch(custAnswer::equals));
				if(Arrays.stream(values).anyMatch(custAnswer::equals)) 
				{
					System.out.println("Product details are as follows:");
					//Show all the details about the product bread, E.g price, supplier, discount when bought in bulk
				}
				
				System.out.println("Enter another productID: p");
				System.out.println("Exit to the menu: e");
				finalAnswer = sc.next().charAt(0);
				if(finalAnswer == 'e')
				{
					shop();
				}
				if (finalAnswer == 'p') continue;
	}
	}
}