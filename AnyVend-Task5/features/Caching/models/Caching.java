package models;

public class Caching {
	public enum Kind {Physical, Crypto, Both };
	Kind payType;
	
	public Caching() {
		payType = Kind.Both;
	}
	
	public Caching(Kind payType) {
		this.payType = payType;
	}
	
	@Override
	public String toString() {
		return "Caching with: " + payType;
	}
	
}
