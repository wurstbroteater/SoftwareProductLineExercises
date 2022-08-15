package models;

import interfaces.*;
public class Caching implements IAgeVerification {
	public enum Kind {Physical, Crypto, Both};
	Kind payType;
	
	public Caching() {
		original();
	}
	
	public Caching(Kind payType) {
		original(payType);
	}
	
	@Override
	public String toString() {
		return original();
	}
	
	@Override
	public boolean ofLegalAge() {
		return true;
	}	
}