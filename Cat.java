public class Cat {

	int catID;
	String catName;
	String catPrice;
	boolean available;
	String customerRentedTo;
	int customerRentedToID;

	//Method to add a new Cat
	public Cat(int id, String name, String price) {
		catID = id;
		catName = name;
		catPrice = price;
		available = true;
	}
	
	//Return who rented the cat by cat id
	
	//Methods to return the ID, Name, and Price of the Cat
	
	public int getCatID() {
		return catID;
	}
	
	public String getCatName() {
		return catName;
	}
	
	public String getCatPrice() {
		return catPrice;
	}
	
	
	//Method to return whether or not the cat is available for renting
	
	public boolean isAvailable() {
		return available;
	}
	
	//Method to Rent cat out to a specific Customer
	
	public void rentOut(int id, String name) {
		available = false;
		customerRentedTo = name;
		customerRentedToID = id;
	}
	
	//Method to see who rented the cat
	public String checkCustomer() {
		return customerRentedTo;
	}
	
	
	//Method to change Cat availability to true
	
	public void changeAvailability() {
		available = true;
	}
	
	//Method to return a String of the cat's information
	
	public String toString() {
		String temp = "ID " + this.getCatID() + ". " + this.getCatName() + ": " + this.getCatPrice() + " / day";
		return temp;
	}




}//end public class Cat