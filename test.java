package sefA1;

import org.junit.jupiter.api.Test;



import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class test {
 

    @Test
  
    public void getPrice()  {
    	Product in = new Product("0001", "Apple", 10 ,"KG");
    	int expResult = 10;
    	int result = in.getPrice();
    	assertEquals(expResult, result);
    }
    @Test
    public void getId() { 
    	Product in = new Product("0001", "Apple", 10 ,"KG");
    	String expResult = "0001";
    	String result = in.getId();
    	assertEquals(expResult, result);
    }
    @Test
    public void getName() { 
    	Product in = new Product("0001", "Apple", 10 ,"KG");
    	String expResult = "Apple";
    	String result = in.getName();
    	assertEquals(expResult, result);
    }
    @Test
    public void getUnit() { 
    	Product in = new Product("0001", "Apple", 10 ,"KG");
    	String expResult = "KG";
    	String result = in.getUnit();
    	assertEquals(expResult, result);
    }

    
}