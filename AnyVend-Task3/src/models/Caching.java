package models;


//this inline with comment block does not work so we have to use this ugly style :(
public class Caching 
//#if AgeVerification
//@implements AgeVerification 
//#endif
{
	public enum Kind {Physical, Crypto, Both };
	Kind payType;
	
	public Caching() {
		//#if Physical && Crypto
		payType = Kind.Both;
		//#elif Crypto
//@		payType = Kind.Crypto;
		//#elif Physical
//@		payType = Kind.Physical;
		 //#else
//@			System.err.println("Invalid combination of Kinds in Caching!");
		//#endif
	
		//Code from Task 2 for comparison
/*		
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
*/
	}
	
	@Override
	public String toString() {
		return "Caching with: " + payType;
	}
	
	//#if AgeVerification
//@	@Override
//@	public boolean ofLegalAge() {
//@		// TODO Auto-generated method stub
//@		return false;
//@	}
	//#endif
}
