import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class UnitTest {

//for testing - Customer cust = mock( Customer.class);
// verify (cust.setHasCat().set...)

/*
------------------------------------------------------- Methods from CAT class to test -------------------------------------------------------
*/

/*
Testing getCatID(). Make some cats and verify that it's returning the correct ID.
*/
@Test
public void testGetCatID() {
	Cat c1 = new Cat(10,"Fluffy","$400.00");
	Cat c2 = new Cat(20,"Dobby","$200.00");
	Cat c3 = new Cat(30,"Artemis","$500.00");
	Cat c4 = new Cat(40,"Midnight","$100.00");
	assertEquals(10,c1.getCatID());
	assertEquals(20,c2.getCatID());
	assertEquals(30,c3.getCatID());
	assertEquals(40,c4.getCatID());
}


/*
Testing getCatName(). Make some cats and verify that it's returning the correct Name.
*/
@Test
public void testGetCatName() {
	Cat c1 = new Cat(10,"Cloud","$400.00");
	Cat c2 = new Cat(20,"Sephiroth","$200.00");
	Cat c3 = new Cat(30,"Aerith","$500.00");
	Cat c4 = new Cat(40,"Vincent","$100.00");
	assertEquals("Cloud",c1.getCatName());
	assertEquals("Sephiroth",c2.getCatName());
	assertEquals("Aerith",c3.getCatName());
	assertEquals("Vincent",c4.getCatName());
}

/*
Testing getCatPrice(). Make some cats and verify that it's returning the correct Price.
*/
@Test
public void testGetCatPrice() {
	Cat c1 = new Cat(10,"Cloud","$400.00");
	Cat c2 = new Cat(20,"Sephiroth","$200.00");
	Cat c3 = new Cat(30,"Aerith","$500.00");
	Cat c4 = new Cat(40,"Vincent","$100.00");
	assertEquals("$400.00",c1.getCatPrice());
	assertEquals("$200.00",c2.getCatPrice());
	assertEquals("$500.00",c3.getCatPrice());
	assertEquals("$100.00",c4.getCatPrice());
}

/*
Testing isAvailable(). Make some cats and rent them out to verify that isAvailable() is working correctly.
*/
@Test
public void testIsAvailable() {
	Cat c1 = new Cat(10,"Cloud","$400.00");
	Cat c2 = new Cat(20,"Sephiroth","$200.00");
	c1.rentOut(100,"Zack");
	assertEquals(false,c1.isAvailable());
	c1.changeAvailability();
	assertEquals(true,c1.isAvailable());
}

/*
Testing rentOut(). Make some cats and rent them out to verify that rentOut() is working correctly.
*/
@Test
public void testRentOut() {
	Cat c1 = new Cat(10,"Cloud","$400.00");
	Cat c2 = new Cat(20,"Sephiroth","$200.00");
	Cat c3 = new Cat(30,"Aerith","$500.00");
	Cat c4 = new Cat(40,"Vincent","$100.00");
	c1.rentOut(100,"Zack");
	c2.rentOut(200,"Barry");
	c3.rentOut(300,"Arin");
	c4.rentOut(400,"Danny");
	assertEquals(false,c1.isAvailable());
	assertEquals(false,c2.isAvailable());
	assertEquals(false,c3.isAvailable());
	assertEquals(false,c4.isAvailable());
}

/*
Testing checkCustomer(). Make some cats and rent them out to verify that checkCustomer() is working correctly.
*/
@Test
public void testCheckCustomer() {
	Cat c1 = new Cat(10,"Cloud","$400.00");
	Cat c2 = new Cat(20,"Sephiroth","$200.00");
	c1.rentOut(100,"Zack");
	c2.rentOut(200,"Barry");
	assertEquals("Zack",c1.checkCustomer());
	assertEquals("Barry",c2.checkCustomer());
}

/*
Testing changeAvailability(). Make some cats and test changing their availability back to available.
*/
@Test
public void testChangeAvailability() {
	Cat c1 = new Cat(10,"Cloud","$400.00");
	Cat c2 = new Cat(20,"Sephiroth","$200.00");
	c1.rentOut(100,"Zack");
	c2.rentOut(200,"Barry");
	c1.changeAvailability();
	c2.changeAvailability();
	assertEquals(true,c1.isAvailable());
	assertEquals(true,c2.isAvailable());
}


/*
Testing toString(). Make some cats and test printing out their information to ensure toString() is working properly.
*/
@Test
public void testToString() {
	Cat c1 = new Cat(10,"Cloud","$400.00");
	Cat c2 = new Cat(20,"Sephiroth","$200.00");
	Cat c3 = new Cat(30,"Aerith","$500.00");
	Cat c4 = new Cat(40,"Vincent","$100.00");
	assertEquals("ID 10. Cloud: $400.00 / day",c1.toString());
	assertEquals("ID 20. Sephiroth: $200.00 / day",c2.toString());
	assertEquals("ID 30. Aerith: $500.00 / day",c3.toString());
	assertEquals("ID 40. Vincent: $100.00 / day",c4.toString());
}



/*
------------------------------------------------------- Methods from CUSTOMER class to test -------------------------------------------------------
*/

/*
Testing getCustomerID(). Create some customers and verify it's returning the correct ID.
*/
@Test
public void testGetCustomerID() {
	Customer c1 = new Customer(100,"Suzy");
	Customer c2 = new Customer(200, "Arin");
	Customer c3 = new Customer(300, "Griffin");
	Customer c4 = new Customer(400, "Nick");
	assertEquals(100,c1.getCustomerID());
	assertEquals(200,c2.getCustomerID());
	assertEquals(300,c3.getCustomerID());
	assertEquals(400,c4.getCustomerID());
}

/*
Testing getCustomerName(). Create some customers and verify that it's returning the correct Name.
*/
@Test
public void testGetCustomerName() {
	Customer c1 = new Customer(100,"Suzy");
	Customer c2 = new Customer(200, "Arin");
	Customer c3 = new Customer(300, "Griffin");
	Customer c4 = new Customer(400, "Nick");
	assertEquals("Suzy",c1.getCustomerName());
	assertEquals("Arin",c2.getCustomerName());
	assertEquals("Griffin",c3.getCustomerName());
	assertEquals("Nick",c4.getCustomerName());
}



}//end class