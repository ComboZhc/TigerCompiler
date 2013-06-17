package Language.Tiger;

import java.util.Map;


public class TigerRecord extends TigerType{
	private Map<String, TigerType> elementTypes;
	@Override
	public String toString() {
		if (this.elementTypes == null)
			return "Record";
		else 
			return "Record" + this.elementTypes;
	}
	public Map<String, TigerType> getElementTypes() {
		return elementTypes;
	}
	public void setElementTypes(Map<String, TigerType> elementTypes) {
		this.elementTypes = elementTypes;
	}
	public TigerRecord() {
		this.elementTypes = null;
	}
	public TigerRecord(Map<String, TigerType> elementTypes) {
		this.elementTypes = elementTypes;
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerRecord
		  && elementTypes.equals(((TigerRecord)o).elementTypes);
	}
}
