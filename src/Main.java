import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Booking bookings = new Booking();
		
		Customer c = new Customer(999, "Ludgero");
		bookings.addCustomer(c);
		
		Car ford = fordFactory();
		bookings.addCar(ford);
		
		List<Car> cars = bookings.getAvailableCars();
		
		System.out.print("Before booking: ");
		System.out.print(c.getBookingsCounter() + " ");
		//System.out.println(bookings.getBookings(c));
		printCars(cars);
		
		bookings.book(c, ford, Period.ONE_DAY, new Location("London"));
		
		cars = bookings.getAvailableCars();
		System.out.print("After booking: ");
		System.out.print(c.getBookingsCounter() + " ");
		printCars(cars);
	}
	
	private static FamilySmall fordFactory() {
		Map<Period, Integer> fordPrices = new HashMap<Period, Integer>();
		
		for(int i = 0; i < Period.values().length; i++){
			fordPrices.put(Period.values()[i], 50 + 50*i);
		}
		
		return new FamilySmall("Ford", "Focus", fordPrices);
	}

	private static void printCars(List<Car> cars){
		for(Car c: cars){
			System.out.println(c.getBrand() + " " + c.getModel());
		}
	}
}
