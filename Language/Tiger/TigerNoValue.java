package Language.Tiger;

public class TigerNoValue extends TigerType {
	@Override
	public String toString() {
		return "NoValue";
	}	
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerNoValue;
	}
}
