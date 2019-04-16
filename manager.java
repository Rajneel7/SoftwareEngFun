package sefA1;

import java.util.ArrayList;
import java.util.Scanner;

public class manager {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("============Welcome to our store============");
		System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
		System.out.println("Select which function you want to use");

		ArrayList<Product> array = new ArrayList<Product>();

		init(array);
		while (true) {

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
					
			case 5:
				System.out.println("Bye");
				System.exit(0); 

			}
		}
	}

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

		for (int i = 0; i < array.size(); i++) {
			Product item = array.get(i);

			if (item.ID == ID) {
				System.out.println("Enter new item ID");
				item.ID = sc.nextInt();

				System.out.println("Enter item name");
				item.name = sc.next();

				System.out.println("Enter item price");
				item.price = sc.nextDouble();
				System.out.println("Item has been changed");

				System.out.println();
				System.out.println("============Welcome to our store============");
				System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
				System.out.println("Select which function you want to use");
				return;
			}
		}
		System.out.println("Item ID does not exist");
		System.out.println();
		System.out.println("============Welcome to our store============");
		System.out.println("1: Stock list   2: Add item   3: Delete item   4: Change item  5: Quit");
		System.out.println("Select which function you want to use");
	}

	private static void deleteItem(ArrayList<Product> array) {

		System.out.println("Selected deleting item function");
		System.out.println("Enter item ID");
		Scanner sc = new Scanner(System.in);

		int ID = sc.nextInt();

		for (int i = 0; i < array.size(); i++) {

			Product item = array.get(i);

			if (item.ID == ID) {

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

		for (int i = 0; i < array.size(); i++) {

			Product item = array.get(i);

			System.out.println(item.ID + "               " + item.name + "                       " + item.price);

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
}
