package sefA1;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
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

}
