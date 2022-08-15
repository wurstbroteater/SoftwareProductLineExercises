package models;

import interfaces.ICaching;

public class Caching implements ICaching{
	Kind payType;

	private Caching() {}
	
	public Caching(Kind type) {
		this.payType = type;
	}

	@Override
	public String toString() {
		return "Caching with: " + payType;
	}

	@Override
	public boolean hasPayType(Kind type) {
		return payType.equals(type);
	}
}
