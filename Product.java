package sefA1;

import java.io.IOException;
import java.util.Scanner;

public class Product { 

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