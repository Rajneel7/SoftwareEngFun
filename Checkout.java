package sefa1;

import java.util.Scanner;

public class Checkout  
{
	// Customer requirement 1 = Select Product
	// Customer requirement 2 = Check price, entering ID to check price
	// Customer requirement 3 = Check discount for a SPECIFIC product when purchased in bulk
	
	//Customer requirement 1
	System.out.println("What would you like to do?");
	//List of products
	String[] bob = Products.getProduct(); //Show all the products
	Scanner scanner = new Scanner(System.in); //Ask which product they want to see
	System.out.println("What product would you like to see - Enter product name"); 
	String answer = scanner.nextLine();
	// make it all lower case letters, if they spell it wrong, return "error - please enter again"
	// use IF statement or for loop
	// if entered correctly show them ALL the details, price, supplier, discount when bought in bulk
	//return them back to the home page or exit the program
	
	//Customer requirement 2
	System.out.println("What would you like to do?");
	String answer = scanner.nextLine();
	// Check price
	System.out.println("Which product would you like to check the price of - Enter productID");
	String answer = scanner.nextLine();
	//make it all lower case letters, if they spell it wrong, return "error - please enter again"
	// use IF statement or for loop
	// if entered correctly show them ALL the details, price, supplier, discount when bought in bulk
	//return them back to the home page or exit the program
	
	
	//Customer requirement 3
	System.out.println("What would you like to do?");
	// Check discounts 
	System.out.println("Which product would you like to check the discount of - Enter productID"); 
	String answer = scanner.nextLine();
	//make it all lower case letters, if they spell it wrong, return "error - please enter again"
	// use IF statement or for loop
	// if entered correctly show them ALL the details, price, supplier, discount when bought in bulk
	//return them back to the home page or exit the program
	
}
