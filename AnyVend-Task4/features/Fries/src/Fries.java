import java.util.Random;

import interfaces.IFood;
import interfaces.IFries;

public class Fries implements IFries{
	private int temp = 0;
	private final FriesType type;
	
	public Fries(FriesType type) {
		this.type = type;
	}
	
	@Override
	public boolean hasWorkingTemp() {
		// TODO Auto-generated method stub
		return temp  >= MIN_FOOD_TEMP;
	}

	@Override
	public IFood getFood() {
		//Cook food
		if(temp >= MIN_FOOD_TEMP) {
			adjustTempBy(temp - MIN_FOOD_TEMP);
		} else {
			adjustTempBy(MIN_FOOD_TEMP - temp);
		}
		return this;
	}

	@Override
	public void adjustTempBy(int degree) {
		temp += degree;
		
	}

	@Override
	public boolean isCrispy() {
		Random r = new Random();
		final int low = 10;
		final int high = 100;
		return (r.nextInt(high - low) + low) >= 42;
	}

}
