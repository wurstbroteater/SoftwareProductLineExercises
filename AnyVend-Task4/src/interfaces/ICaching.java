package interfaces;

public interface ICaching {
	public enum Kind {Physical, Crypto, Both};
	public boolean hasPayType(Kind type);

}
