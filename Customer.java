public class Customer {

	int customerID;
	String customerName;
	int catRentedToCustomer;
	String catRentedName;
	boolean catRented;

	public Customer(int id, String name) {
		customerID = id;
		customerName = name;
		catRented = false;
	}
	
	
	//Methods to return the ID and Name of the Customer
	
	public int getCustomerID() {
		return customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}

}// end class