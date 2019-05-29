package sefA1;

import java.io.IOException;
import java.util.Scanner;

public class Product { 
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		checkout checkout = new checkout();
		manager manager = new manager();
		salesEmployee salesEmp = new salesEmployee();

		while (true) {
			System.out.println("    Welcome to our store");
			System.out.println("Enter your role (1.Customer 2.Manager 3.Sales employee 4.Quit)");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				// customer
				checkout.shop();
				break;
			case 2:
				// manager
				manager.manager();
				break;
			case 3:
				// salesEmployee
				salesEmp.salesEmploye();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong role");
			}}
		}
		
		
	
	 //Set ID 
	 private String id; 
	 //Set name 
	 private String name; 
	 //Set price 
	 private int price; 
	 //Set unit
	 private String unit; 
	  
	 //Set qty 
	 private int number; 
	 public Product(String id, String name, int price, String unit) { 
	 super(); 
	 this.id = id; 
	 this.name = name; 
	 this.price = price; 
	 this.unit =unit;
	
	 } 
	 public Product() { 
	 super(); 
	
	 } 
	 public String getId() { 
	 return id; 
	 } 
	 public void setId(String id) { 
	 this.id = id; 
	 } 
	 public String getName() { 
	 return name; 
	 } 
	 public void setName(String name) { 
	 this.name = name; 
	 } 
	 public int getPrice() { 
	 return price; 
	 } 
	 public void setPrice(int price) { 
	 this.price = price; 
	 } 
	 public String getUnit() { 
	 return unit; 
	 } 
	 public void setUnit(String unit) { 
	 this.unit = unit; 
	 } 
	 public int getNumber() { 
	 return number; 
	 } 
	 public void setNumber(int number) { 
	 this.number = number; 
	 } 
	  
	 //Price
	 public int getMoney(){ 
	 return price * number; 
	 }
	 
	
	
	
	 
	
	} 