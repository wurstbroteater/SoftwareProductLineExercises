package interfaces;

public interface IFood {
	public final int MIN_FOOD_TEMP = 60;
	public boolean hasWorkingTemp();
	public IFood getFood();
	public void adjustTempBy(int degree);
}
