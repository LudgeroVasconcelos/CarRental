
import java.util.HashMap;

public class FamilySmall extends Car{

	HashMap<Period, Integer> prices;
	
	public FamilySmall(String brand, String model, HashMap<Period, Integer> prices) {
		super(brand, model);
		this.prices = prices;
	}
}
