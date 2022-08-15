package models;

public class Caching {
	public enum Kind {Physical, Crypto, Both };
	Kind payType;
	
	public Caching() {
		payType = Kind.Crypto;
	}
	
	public Caching(Kind payType) {
		//here original(payType) does not work becaue of mismatch Kind with Kind but in Crypto Caching it does work, why?
		this.payType = payType;
	}
	
	@Override
	public String toString() {
		return original();
	}
	
}