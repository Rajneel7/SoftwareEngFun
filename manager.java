package sefA1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class manager {

	public void manager() throws IOException {
		if (load()) {
			Scanner sc = new Scanner(System.in);
			while (true) {
				ArrayList<Product> list = new ArrayList<Product>();
				check(list);
				System.out.println(
						"Select function: (1.View stock list  2.Add item 3.Change item 4.Delete item  5.Quit)");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					// View stock
					print(list);
					break;
				case 2:
					// Add item
					addProduct(list);
					break;
				case 3:
					// Change item
					reverse(list);
					break;
				case 4:
					// Delete item
					remove(list);
					break;
				case 5:
					// Quit
					return;
				default:
					System.out.println("Wrong function");
					break;
				}
			}

		} else {
			return;
		}
	}

	public void remove(ArrayList<Product> list) throws IOException {
		Scanner sc = new Scanner(System.in);
		print(list);
		System.out.println("Enter Item ID ");
		String id = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			if (f.getId().equals(id)) {
				list.remove(i);
				write(list);
				System.out.println("Deleted");
				return;
			}
		}
		System.out.println("Cannot find ID");
	}

	// Change item
	public void reverse(ArrayList<Product> list) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		print(list);
		System.out.println("Enter ID: ");
		String id = sc1.nextLine();
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			if (f.getId().equals(id)) {
				System.out.println("Enter name: ");
				String name = sc1.nextLine();
				System.out.println("Enter price: ");
				int price = sc2.nextInt();

				f.setName(name);
				f.setPrice(price);

				write(list);
				System.out.println("Sucuessful");
				return;
			}
		}
		System.out.println("Cannot find ID!");

	}

	// Add item
	public void addProduct(ArrayList<Product> list) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		print(list);
		System.out.println("Enter ID ");
		String id = sc1.nextLine();
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			if (f.getId().equals(id)) {
				System.out.println("Already exist");
				return;
			}
		}
		System.out.println("Enter name ");
		String name = sc1.nextLine();
		System.out.println("Enter price ");
		int price = sc2.nextInt();

		Product f = new Product(id, name, price, name);
		list.add(f);

		write(list);
		System.out.println("Successful");

	}

	// Adding item into the txt
	private void write(ArrayList<Product> list) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/shuhaoshi/Desktop/Product.txt"));
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			bw.write(f.getId() + " " + f.getName() + " " + f.getPrice() + " " + f.getUnit());
			bw.newLine();
		}
		bw.close();
	}

	public void print(ArrayList<Product> list) {
		System.out.println("ID\tName\tPrice");
		for (int i = 0; i < list.size(); i++) {
			Product f = list.get(i);
			System.out.println(f.getId() + "\t" + f.getName() + "\t" + f.getPrice() + "\t" + f.getUnit());
		}
	}

	// Check stock
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

	// Login
	public boolean load() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);

		enterUsername();
		getUsername();
		
		enterPassword();
		getPassword();

		BufferedReader br = new BufferedReader(new FileReader("/Users/shuhaoshi/Desktop/admin.txt"));
		String line = br.readLine();

		String[] str = line.split(",");

		if (str[0].equals(username) && str[1].equals(password)) {
			System.out.println("Welcome to our store " + username);

			return true;
		} else {
			System.out.println("Username or password incorrect, Cannot login");
			return false;

		}
	}

	public void enterUsername() {
		String enterUsername = "Enter Username: ";
		System.out.println(enterUsername);
	}
	
	public String getUsername() {
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		return username;
	}
	public void enterPassword() {
		String enterPassword = "Enter Password: ";
		System.out.println(enterPassword);
	}

	public String getPassword() {
		System.out.println("f");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		return password;
	}

}
