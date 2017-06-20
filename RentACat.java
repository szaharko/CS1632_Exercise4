import java.util.Scanner;


public class RentACat {

	public static void main(String [] args) {
	
	
		//Initialize any variables needed
			boolean closeShop = false;
			int ans = 0;
			
		//Create Cats
		Cat cat1 = new Cat(1,"Noctis","$500.00");
		Cat cat2 = new Cat(2,"Prompto","$300.00");
		Cat cat3 = new Cat(3,"Ignis", "$400.00");
		Cat cat4 = new Cat(4,"Gladio","$250.00");
		
		//Create Customers
		
		Customer c1 = new Customer(100,"Ardyn Izunia");
		Customer c2 = new Customer(200,"Aranea Highwind");
		Customer c3 = new Customer(300,"Zack Fair");

		//Import a keyboard scanner to take the user's input
			Scanner kbd = new Scanner(System.in);
			
		/*Now start the program loop that will run RentACat until the shop
			is closed. */
		
		while ( !closeShop ) {
			
			//Ask the user which option they'd like to choose
			/*Note: Option 1 - Show cats available to rent
				Option 2 - Rent a cat to a customer
				Option 3 - Return a cat
				Option 4 - Close the shop
			*/
		
			System.out.print("Option [1,2,3,4] > ");
			ans = kbd.nextInt();
		
			/*If the user inputs 1, list the available Cats to rent.*/
		
			if ( ans == 1 ) {
			
				System.out.println("Cats for Rent");
				
				if ( cat1.isAvailable() ) {
					System.out.println(cat1.toString());
				}
				
				if ( cat2.isAvailable() ) {
					System.out.println(cat2.toString());
				}
				
				if ( cat3.isAvailable() ) {
					System.out.println(cat3.toString());
				}
				
				if ( cat4.isAvailable() ) {
					System.out.println(cat4.toString());
				}
			}
			
			/*If the user inputs 2, ask for Customer ID and check if it exists. If it does not, state that it doesn't exist and ask
			for another. If it exists, ask which cat. Make sure the cat exists
			and is in for rental.*/
			
			if ( ans == 2 ) {
				
				boolean temp = false;
			
				while ( !temp ) {
				
					System.out.print("Customer ID > ");
					ans = kbd.nextInt();
				
					//Check if Customer Exists
				
					//If it exists, rent out the cat
					
					if ( ans == c1.getCustomerID() | ans == c2.getCustomerID() | ans == c3.getCustomerID() ) {
						
						int custID = ans;
						String custName = "";
						if ( custID == c1.getCustomerID() ) {
							custName = c1.getCustomerName();
						}
						if ( custID == c2.getCustomerID() ) {
							custName = c2.getCustomerName();
						}
						if ( custID == c3.getCustomerID() ) {
							custName = c3.getCustomerName();
						}
						
						boolean temp2 = false;
						
						while ( !temp2 ) {
							System.out.print("Rent which cat? > ");
							int i = kbd.nextInt();
						
							//Check if Cat exists
						
							if ( i == cat1.getCatID() | i == cat2.getCatID() | i == cat3.getCatID() | i == cat4.getCatID() ) {
							
								//If it exists, check if it is available
							
								if ( i == cat1.getCatID() ) {
							
									if ( cat1.isAvailable() ) {
									
										cat1.rentOut(custID,custName);
										System.out.println( cat1.getCatName() + " has been rented to Customer " + custName + ".");
										temp2 = true;
										temp = true;
										break;
									}
									else {
										System.out.println("Sorry, " + cat1.getCatName() + " is not here!");
									}
								}
								if ( i == cat2.getCatID() ) {
							
									if ( cat2.isAvailable() ) {
									
										cat2.rentOut(custID,custName);
										System.out.println( cat2.getCatName() + " has been rented to Customer " + custName + ".");
										temp2 = true;
										temp = true;
										break;
									}
									else {
										System.out.println("Sorry, " + cat2.getCatName() + " is not here!");
									}
								}
								if ( i == cat3.getCatID() ) {
							
									if ( cat3.isAvailable() ) {
									
										cat3.rentOut(custID,custName);
										System.out.println( cat3.getCatName() + " has been rented to Customer " + custName + ".");
										temp2 = true;
										temp = true;
										break;
									}
									else {
										System.out.println("Sorry, " + cat3.getCatName() + " is not here!");
									}
								}
								if ( i == cat4.getCatID() ) {
							
									if ( cat4.isAvailable() ) {
									
										cat4.rentOut(custID,custName);
										System.out.println( cat4.getCatName() + " has been rented to Customer " + custName + ".");
										temp2 = true;
										temp = true;
										break;
									}
									else {
										System.out.println("Sorry, " + cat4.getCatName() + " is not here!");
									}
								}
							}
						}//end while for rent cat
					}
					
					//If it does not exist, alert and keep looping
					else {
						System.out.println("That customer doesn't exist!");
					}
					
				}// end while for customer ID
			}
			
			/*If the user inputs 2, ask for which Cat they are returning. Check
			if the cat ID exists. If it does not, inform them. If it does,
			print the customer's name and what they paid, along with a welcome back message to the cat.*/
			
			if ( ans == 3 ) {
				boolean temp = false;
				
				while ( !temp ) {
				
					System.out.print("Return which cat? > ");
					int answer = kbd.nextInt();
					
					//cat ID exists
					if ( answer == cat1.getCatID() | answer == cat2.getCatID() | answer == cat3.getCatID() | answer == cat4.getCatID() )
					{
						if ( answer == cat1.getCatID() )
						{
							if (cat1.isAvailable()) { 
								System.out.println("Invalid cat ID. Cat is not currently rented out.");
							}
							else {
								cat1.changeAvailability();
								System.out.println(cat1.checkCustomer() + " paid " + cat1.getCatPrice() + ".");
								System.out.println("Welcome back, " + cat1.getCatName() + "!");
								temp = true;
								break;
							}
						}
						if ( answer == cat2.getCatID() )
						{
							if (cat2.isAvailable()) { 
								System.out.println("Invalid cat ID. Cat is not currently rented out.");
							}
							else {
								cat2.changeAvailability();
								System.out.println(cat2.checkCustomer() + " paid " + cat2.getCatPrice() + ".");
								System.out.println("Welcome back, " + cat2.getCatName() + "!");
								temp = true;
								break;
							}
						}
						if ( answer == cat3.getCatID() )
						{
							if (cat3.isAvailable()) { 
								System.out.println("Invalid cat ID. Cat is not currently rented out.");
							}
							else {
								cat3.changeAvailability();
								System.out.println(cat3.checkCustomer() + " paid " + cat3.getCatPrice() + ".");
								System.out.println("Welcome back, " + cat3.getCatName() + "!");
								temp = true;
								break;
							}
						}
						if ( answer == cat4.getCatID() )
						{
							if (cat4.isAvailable()) { 
								System.out.println("Invalid cat ID. Cat is not currently rented out.");
							}
							else {
								cat4.changeAvailability();
								System.out.println(cat4.checkCustomer() + " paid " + cat4.getCatPrice() + ".");
								System.out.println("Welcome back, " + cat4.getCatName() + "!");
								temp = true;
								break;
							}
						}
					}
					
					//cat ID doesn't exist
					else {
						System.out.println("Invalid cat ID.");
					}
				}
			}
			
			/*
			If the user enters 4, the shop is closed and the program is ended.
			*/
			if ( ans == 4 ) {
				System.out.println("Closing up shop for the day!");
				break;
			}
	
		} //end while loop
	

	} //end main class
	
	
} //end class RentACat