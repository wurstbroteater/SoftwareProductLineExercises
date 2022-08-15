package main;

import models.Caching;
import models.Doener;
import properties.PropertyManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (PropertyManager.getProperty("Doener")) {
			//dead feature, not detected?
			System.out.println("WARNING: Do not use umlauts in names!");
			Doener doener = new Doener();
			doener.withCheese = true;
			System.out.println(doener);
			System.out.println("-----------");
		}
		
		if (! PropertyManager.getProperty("AgeVerification")) {
			System.out.println("WARNING: Do not use - in names!");
			//some class should now implement AgeVerification interface - how?
			System.out.println("-----------");
		}
		if (PropertyManager.getProperty("Caching")) {
			Caching caching = new Caching();
			System.out.println(caching);
			System.out.println("-----------");
		}

	}

}
