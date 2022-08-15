package models;

public class Caching {
	public enum Kind {Physical, Crypto, Both };
	Kind payType;
	
	public Caching() {
		payType = Kind.Crypto;
	}
	
	public Caching(Kind payType) {
		original(payType);
	}
	
	@Override
	public String toString() {
		return original();
	}
	
}