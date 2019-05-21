package sefa1;

public class Manager {
	
	//Manager requirement 1 = maintain unit price, replenish stock level, check stock level, re-order quantity for ALL item
	//Manager requirement 2 = maintain supplier details for all products - show supplier details/change
	//Manager requirement 3 = Change the standard price for a item when there is a promotion 
	//Manager requirement 4 = Change the discount percentage for bulk sale on specific product
	//Manager requirement 5 = place a purchase order for all items below replenishment level - system tells warehouse employee 
	//Manager requirement 6 = generate a sales report for specified period (generate last months report)
	//Manager requirement 7 = generate a report on fast moving items based on value (items that are popular)
	//Manager requirement 8 = generate a report based on the customer's postcode (loyalty) for a marketing campaign
	//Manager requirement 9 = generate a supply report (payments for supplies are out of scope)
	//Manager requirement 10 = list products generating the most revenue 
	
	//Login to the system using the username and password as the manager.
	
	//Manager requirement 1
	System.out.println("What would you like to do?");
	//Scanner
	//Check product details (price and stock level)
	System.out.println("What would you like to do?");
	//Order stock 
	//New print out, enter productID, quantity
	System.out.println("ProductID: ........ with quantity: ......... has been placed on order")
	//Replenish stock 
	//New print out, enter productID, quantity
	System.out.println("ProductID: ........ with quantity: ......... has been requested to be replenished on shelves")

	//Manager requirement 2
	System.out.println("What would you like to do?");
	//Supplier details
	//Shows all the suppliers' details with the products they supply.
	
	//Manager requirement 3
	System.out.println("What would you like to do?");
	//Change price
	//Enter productID, enter new price for the product
	//If productID not found, print error message.
	//If all details correct show the new price
	
	//Manager requirement 4
	System.out.println("What would you like to do?");
	//Place special discounts on SPECIFIC items that are bought in bulk (eg. 10% discount for 5 items, 20% discount for 10 items)
	//Use IF statement, eg. if quantity > 5 total * 0.9.... etc
	
	//Manager requirement 5 
	System.out.println("What would you like to do?");
	//Check stock levels for store and warehouse
	//IF any product's stock level in warehouse is below eg. 25 then place order for more products
	//Interacts with stock class 
	
	//Manager requirement 6
	System.out.println("What would you like to do?");
	//Sales report 
	System.out.println("Select which period");
	System.out.println("Last month"); //as it is a new system
	//Print all the products and how many were sold
	
	//Manager requirement 7
	System.out.println("What would you like to do?");
	//Report on fast moving items based on value 
	//Print the products with the most sales eg. products with the highest quantity sold in 1 week
	
	//Manager requirement 8 
	System.out.println("What would you like to do?");
	//Interacts with loyalty class as it contains the postcode
	//Report on which postcode is popularly given when they sign up for the loyalty program.
	
	//Manager requirement 9
	System.out.println("What would you like to do?");
	//Interacts with supplier class 
	//Report on when the order was place, products sent and quantity.
	
	//Manager requirment 10
	System.out.println("What would you like to do?");
	//Report on products that generate the most revenue
	//Print the products with the most sales eg. quantity sold > 50
	
	
	
	
	
	
	
	
	
	
	
	
	

}
