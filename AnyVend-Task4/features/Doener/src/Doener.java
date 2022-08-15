import java.lang.reflect.Field;

import interfaces.IFood;

public class Doener implements IFood {
	public boolean withEverything, noOnions, spicy, withCheese, meat, takeAway;	
	private int temp = 0;
	public Doener(boolean withEverything, boolean noOnions, boolean spicy, boolean withCheese, boolean meat, boolean takeAway) {
		super();
		this.withEverything = withEverything;
		this.noOnions = noOnions;
		this.spicy = spicy;
		this.withCheese = withCheese;
		this.meat = meat;
		this.takeAway = takeAway;
	}
	
	private Doener() {}

	@Override
	public String toString() {
		String values = "";
		Field[] fields = this.getClass().getDeclaredFields();
		for(Field f : fields) {
			try {
				values += f.getName() + " = " + f.get(this) + "\n";
			} catch (IllegalArgumentException | IllegalAccessException e) {
				//ignore exceptions
			}
		}
		return "Doener with:\n" + values;
	}

	@Override
	public boolean hasWorkingTemp() {
		return temp >= MIN_FOOD_TEMP;
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
}
