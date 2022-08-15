package main;
import java.util.ArrayList;
import java.util.List;

import interfaces.ICaching.Kind;
import interfaces.IFood;
import interfaces.IFries;
import interfaces.IMessage;
import loader.PluginLoader;
import models.Caching;

public class AnyVend {
		public static void main(String[] args) throws InterruptedException {
			List<IMessage> messagePlugins = PluginLoader.load(IMessage.class);
			print(messagePlugins, true);
			print(messagePlugins, false);
			
			/*
			 * Framework approach shifts the variability modeling part into the interface design and implementation,
			 * rather than having it to model inside the class.
			 * Example:
			 *  - Everything is interfaced by IFood but to make Fries more configurable we need to extend IFood by IFries
			 *  - AnyVend doesnt now that doener exists but the IFood interface and so the proposed workaround (https://moodle.uni-ulm.de/mod/moodleoverflow/discussion.php?d=4866) does not work
			 */
			
			//Features like PayType Crypto or Physical are now indirect features
			Caching caching = new Caching(Kind.Crypto);
			List<IFood> foods = new ArrayList<>();//PluginLoader.load(IFood.class);
			//Things which does not work
			//IFood d = new Doener(true, false, true, true, true, true);
			//Doener dd = new Doener(true, false, true, true, true, true);
			//foods.add(dd);
			//Fries f = new Fries();
			
		}

		private static void print(List<IMessage> messagePlugins, boolean startMessage) {
			for (IMessage message : messagePlugins) {
				if (message.isStartMessage() == startMessage) {
					System.out.print(message.getMessage());
				}
			}
		}
}
