package models;


import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Doener {
	public boolean withEverything, noOnions, spicy, withCheese, meat, takeAway;	
	
	public Doener(boolean withEverything, boolean noOnions, boolean spicy, boolean withCheese, boolean meat, boolean takeAway) {
		super();
		this.withEverything = withEverything;
		this.noOnions = noOnions;
		this.spicy = spicy;
		this.withCheese = withCheese;
		this.meat = meat;
		this.takeAway = takeAway;
	}
	
	public Doener() {
		
	}

	@Override
	public String toString() {
		String values = "";
		Field[] fields = this.getClass().getDeclaredFields();
		for(Field f : fields) {
			try {
				values += f.getName() + " = " + f.get(this) + "\n";
			} catch (IllegalArgumentException e) {
				//ignore exception
			} catch (IllegalAccessException e) {
				//ignore exception
			}
		}
		return "Doener with:\n" + values;
	}
}