package sefA1;


import java.util.ArrayList;
import java.util.Scanner;

public class chechout {
	public static void main(String[] args) {
		


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
		int ID;
		
	Scanner item = new Scanner(System.in);
	System.out.println("Enter item ID");
	ID = item.nextInt();
	if(ID== p1.ID) {
		System.out.println("The price is " + p1.price);
	}
	else if (ID==p2.ID) {
		System.out.println("The price is " + p2.price);
	}
	else if (ID==p3.ID) {
		System.out.println("The price is " + p3.price);
		
	}
	else if (ID==p4.ID) {
		System.out.println("The price is " + p4.price);
	}
	else if (ID==p5.ID) {
		System.out.println("The price is " + p5.price);
	}
	
	
	}
}

