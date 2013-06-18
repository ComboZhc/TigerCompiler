package Language.Tiger;

import java.util.HashMap;
import java.util.Map;


public class TigerRecord extends TigerType{
	private Map<String, TigerType> elementTypes;
	@Override
	public String toString() {
		return "Record" + this.elementTypes;
	}
	public Map<String, TigerType> getElementTypes() {
		return elementTypes;
	}
	public void setElementTypes(Map<String, TigerType> elementTypes) {
		this.elementTypes = elementTypes;
	}
	public TigerRecord() {
		this.elementTypes = new HashMap<String, TigerType>();
	}
	public TigerRecord(Map<String, TigerType> elementTypes, boolean nil) {
		this.elementTypes = elementTypes;
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerRecord
		  && elementTypes.equals(((TigerRecord)o).elementTypes);
	}
}
