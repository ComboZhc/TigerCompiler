package Language.Tiger;

public class TigerString extends TigerType{
	@Override
	public String toString() {
		return "String";
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerString;
	}
}
