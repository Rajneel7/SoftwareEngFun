package sefA1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkOutTest {

	@Test
	public void checkOut() {
		checkOut co=new checkOut();
		int result = co.add(5,7);
		assertEquals(12,result);
	}

}
