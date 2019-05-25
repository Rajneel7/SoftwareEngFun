package sefA1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mainmenu{
	
	
		public static void main(String[] args) {
		System.out.println();
	        System.out.println("============Welcome to our store============");
	        System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
	        System.out.println("Select which function you want to use");

	    		
				ArrayList<Product> array = new ArrayList<Product>();
			
				init(array);
				while(true){
		
			mainMenu();
			
				int choose = chooseFunction();
			switch (choose) {
			case 1:

				showItemList(array);
				break;

	case 2:

		addItem(array);
	break;

	case 3:
	deleteItem(array);
	break;

	 case 4:

	updateItem(array);
				break;
				
			}}}
			
		public static void init(ArrayList<Product> array) {

			Product p1 = new Product();
			p1.ID = 0001;
			p1.name = "Bread";
			p1.price = 5;

			Product p2 = new Product();
			p2.ID = 0002;
			p2.name = "Milk";
			p2.price = 3;

			Product p3 = new Product();
			p3.ID = 0003;
			p3.name = "Eggs";
			p3.price = 5;

			Product p4 = new Product();
			p4.ID = 0004;
			p4.name = "Cake";
			p4.price = 10;

			Product p5 = new Product();
			p5.ID = 0005;
			p5.name = "Shampoo";
			p5.price = 7;

			array.add(p1);
			array.add(p2);
			array.add(p3);
			array.add(p4);
			array.add(p5);
		}

		

		private static void updateItem(ArrayList<Product> array) {
			
				System.out.println("Change item function selected");
				System.out.println("Enter item ID");
				
				Scanner sc = new Scanner(System.in);
				int ID = sc.nextInt();
				
				for(int i = 0 ; i < array.size(); i++){
					Product item = array.get(i);
					
					if(item.ID == ID){
						System.out.println("Enter new item ID");
						item.ID = sc.nextInt();
						
						System.out.println("Enter item name");
						item.name = sc.next();
						
						System.out.println("Enter item price");
						item.price = sc.nextDouble();
						System.out.println("Item has been changed");
						return ;
					}
				}
				System.out.println("Item ID does not exist");
		}

		private static void deleteItem(ArrayList<Product> array) {
		
				System.out.println("Selected deleting item function");
				System.out.println("Enter item ID");
				Scanner sc = new Scanner(System.in);
				
				int ID = sc.nextInt();
				
				for(int i = 0 ; i < array.size(); i++){
					
					Product item = array.get(i);
					
					if( item.ID == ID){
						
						array.remove(i);
						System.out.println("Item has been deleted");
						System.out.println();
				        System.out.println("============Welcome to our store============");
				        System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
				        System.out.println("Select which function you want to use");
						return;
					}
				}
				System.out.println("Can not find item ID");
				System.out.println();
		        System.out.println("============Welcome to our store============");
		        System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
		        System.out.println("Select which function you want to use");

		}
		

		private static void addItem(ArrayList<Product> array) {
			
				System.out.println("Selected adding function");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter item ID");
	
				int ID = sc.nextInt();
		
				System.out.println("Enter item name");
				String name = sc.next();
			
				System.out.println("Enter item price");
				double price = sc.nextDouble();
		
				Product item = new Product();
		
				item.ID = ID;
				item.name = name;
				item.price = price;
				array.add(item);
				System.out.println("Item has been added");
				
				System.out.println();
		        System.out.println("============Welcome to our store============");
		        System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
		        System.out.println("Select which function you want to use");

			
		}
		
		

		private static void showItemList(ArrayList<Product> array) {
			System.out.println();
			System.out.println("================Item Stock================");
			System.out.println("Item ID         Item name                Item price");
			
			for(int i = 0 ; i < array.size(); i++){

		Product item = array.get(i);
			
			System.out.println(item.ID+"   "+item.name+"        "+item.price);
			
		}
			System.out.println();
	        System.out.println("============Welcome to our store============");
	        System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
	        System.out.println("Select which function you want to use");

		}

		private static int chooseFunction() {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}

		private static void mainMenu() {
			

		}
		private static void checkPrice() {
		


		}


		private static void customerInput()
		{
			Scanner sc = new Scanner(System.in);
			char custAnswer;
			char finalAns;	
			do {
			System.out.println("What would you like to do? \nSelect Product: s		Check Price: p		Check Discounts for an item: d"); //Change the question??
			custAnswer = sc.next().charAt(0);
			}
			while ((custAnswer != 's') && (custAnswer != 'p') && (custAnswer != 'd'));
			
			switch(custAnswer)
			{
			case 's':
			s();
			break; 
			
			case 'p':
			p();
			break;
			
			case 'd':
			d();
			break;
					
			default:
				System.out.println("Error - please enter a valid option.")	
			break;
					
			}
			
		}
			public static String s()
			{
				Scanner sc = new Scanner(System.in);
				char custAnswer;
				char finalAnswer;	
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
						System.out.println("Select another product: s");
						System.out.println("Exit the program: e");
						finalAnswer = sc.next().charAt(0);
						if(finalAnswer == 'e')
						{
							System.exit(0);
						}
						if (finalAnswer == 's') continue;
			}
			}
			
			public static String p()
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
						System.out.println("Exit the program: e");
						finalAnswer = sc.next().charAt(0);
						if(finalAnswer == 'e')
						{
							System.exit(0);
						}
						if (finalAnswer == 'p') continue;
			}
			
		}
			public static String d()
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
						System.out.println("Exit the program: e");
						finalAnswer = sc.next().charAt(0);
						if(finalAnswer == 'e')
						{
							System.exit(0);
						}
						if (finalAnswer == 'p') continue;
			}
			}

}


			
			
		
	




