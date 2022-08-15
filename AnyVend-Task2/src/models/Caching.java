package models;

import properties.PropertyManager;

public class Caching {
	public enum Kind {Physical, Crypto, Both };
	Kind payType;
	
	public Caching() {
		boolean physical = PropertyManager.getProperty("Physical");
		boolean crypto = PropertyManager.getProperty("Crypto");
		if (crypto && physical) {
			payType = Kind.Both;
		} else if (crypto) {
			payType = Kind.Crypto;
		} else if (physical) {
			payType = Kind.Physical;
		} else {
			System.err.println("Invalid combination of Kinds in Caching!");
		}
	}
	
	@Override
	public String toString() {
		return "Caching with: " + payType;
	}
}
