package Language.Tiger;

public class TigerType extends TigerNamespace {
	public static TigerType INTEGER = new TigerInteger();
	public static TigerType STRING = new TigerString();
	public static TigerType NOVALUE = new TigerNoValue();
	public static TigerType BOOLEAN = new TigerBoolean();
	public static TigerType NIL = new TigerRecord(null, true);
	public static TigerType ARRAY = new TigerArray();
	public static TigerType RECORD = new TigerRecord();
	@Override
	public String toString() {
		return "";
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerType;
	}
}
