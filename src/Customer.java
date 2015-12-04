
public class Customer {

	private int id;
	private String name;
	private int bookingsCounter;
	// Loyalty
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void book(){
		bookingsCounter++;
	}
	
	public int getBookingsCounter(){
		return bookingsCounter;
	}
	
}
