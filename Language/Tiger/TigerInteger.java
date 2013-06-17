package Language.Tiger;

public class TigerInteger extends TigerType {
	@Override
	public String toString() {
		return "Integer";
	}	
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerInteger || o instanceof TigerBoolean;
	}
}
