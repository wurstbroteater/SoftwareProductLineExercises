package models; 

public   class  Caching {
	
	public  enum  Kind {Physical ,  Crypto ,  Both}

	;

	
	Kind payType  ;

	
	
	public Caching  () {
		payType = Kind.Both;
	
		payType = Kind.Crypto;
	}

	
	
	public Caching  (Kind payType) {
		this.payType = payType;
	
		//here original(payType) does not work becaue of mismatch Kind with Kind but in Crypto Caching it does work, why?
		this.payType = payType;
	}

	
	
	
	 private String  toString__wrappee__Caching() {
		return "Caching with: " + payType;
	}

	
	
	@Override
	public String toString() {
		return toString__wrappee__Caching();
	}

	;


}
