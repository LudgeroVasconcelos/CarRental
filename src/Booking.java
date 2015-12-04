
import java.util.ArrayList;
import java.util.List;


public class Booking {

	private List<Customer> customers;
	private List<Car> cars;
	
	
	public Booking() {
		customers = new ArrayList<Customer>();
		cars = new ArrayList<Car>();
	}

	public void addCustomer(Customer c){
		customers.add(c);
	}
	
	public void addCar(Car c){
		cars.add(c);
	}
	
	
	public List<Car> getAvailableCars(){
		List<Car> availableCars = new ArrayList<Car>();
		
		for(Car c: cars){
			if(c.isAvailable())
				availableCars.add(c);
		}
		
		return availableCars;
	}
	
	public void book(Customer costumer, Car car, Period p, Location l){
		costumer.book();
		car.book(l);
	}
}
