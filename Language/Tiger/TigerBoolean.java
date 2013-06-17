package Language.Tiger;

public class TigerBoolean extends TigerType {
	@Override
	public String toString() {
		return "Integer";
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerBoolean || o instanceof TigerInteger;
	}
}
