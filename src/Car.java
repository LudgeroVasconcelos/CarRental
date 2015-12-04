
public class Car {

	private String brand;
	private String model;
	private int mileage;
	
	private boolean available;
	private Location loc;
	
	
	public Car (String brand, String model){
		this.brand = brand;
		this.model = model;
		available = true;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getMileage(){
		return mileage;
	}
	
	public void setMileage(int mileage){
		this.mileage = mileage;
	}
	
	public void addMileage(int km){
		mileage += km;
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	
	public Location getLocation(){
		return loc;
	}

	public void book(Location loc) {
		available = false;
		this.loc = loc;
	}
	
}
