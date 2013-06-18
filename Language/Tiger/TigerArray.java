package Language.Tiger;
public class TigerArray extends TigerType{
	private TigerType elementType;
	public TigerArray() {
		this.elementType = null;
	}
	public TigerArray(TigerType elementType) {
		this.elementType = elementType;
	}
	public TigerType getElementType() {
		return elementType;
	}
	public void setElementType(TigerType elementType) {
		this.elementType = elementType;
	}
	@Override
	public String toString() {
		if (this.elementType == null)
			return "Array";
		else 
			return "Array(" + elementType + ")";
	}
	@Override
	public boolean equals(Object o) {
		return this == o;
	}
}
