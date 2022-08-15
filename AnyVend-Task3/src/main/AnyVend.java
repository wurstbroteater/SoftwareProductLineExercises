package main;

//-------------Imports-------------
//#if Heating 
import interfaces.Heating;
//#endif
//#if Cooling 
//@import interfaces.Cooling;
//#endif
//#if AgeVerification
//@import java.util.Random;
//#endif
//#if Caching
import models.Caching;
//#endif
//#if Doener
//@import models.Doener;
//#endif

public class AnyVend
//-------------Inheritance/Interfacing-------------
//Problem  more inheritance/interfacing means more of this case distinction
//#if Heating 
implements Heating
//#endif
//#if Cooling
//@implements Cooling
//#endif
{
	
	//-------------Fields-------------
	 //#if AgeVerification
//@	private final int userAge = new Random().nextInt(40-10) + 10; //random age in [10,43)
	 //#endif
	//#if Cooling || Heating
	//celsius NOT farenheit!
	private int currentTemp = 10;
	//#endif
	
	//-------------Methods-------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#if Doener
//@			//dead feature, not detected?
//@			System.out.println("WARNING: Do not use umlauts in names!");
//@			Doener doener = new Doener();
//@			doener.withCheese = true;
//@			System.out.println(doener);
//@			System.out.println("-----------");
		//#endif
		
		//#if AgeVerification
//@			System.out.println("WARNING: Do not use - in names!");
//@			//some class should now implement AgeVerification interface - how?
//@			System.out.println("-----------");
		//#endif
			
		//#if Caching
			Caching caching = new Caching();
			System.out.println(caching);
			System.out.println("-----------");
		//#endif
	}
	//#if Heating 
	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}
	//#endif
	//#if Heating 
	@Override
	public void startHeaing() {
		// TODO Auto-generated method stub	
	}
	//#endif
	//#if Cooling 
//@	@Override
//@	public boolean isCool() {
//@		// TODO Auto-generated method stub
//@		return false;
//@	}
	//#endif
	//#if Cooling 
//@	@Override
//@	public void startCooldown() {
//@		// TODO Auto-generated method stub	
//@	}
	//#endif
}
