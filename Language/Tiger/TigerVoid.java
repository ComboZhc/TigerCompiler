package Language.Tiger;

public class TigerVoid extends TigerType {
	@Override
	public String toString() {
		return "Void";
	}	
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerVoid;
	}
}
