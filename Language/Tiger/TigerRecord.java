package Language.Tiger;

import java.util.Map;


public class TigerRecord extends TigerType{
	private Map<String, TigerType> elementTypes;
	private boolean nil;
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
	public boolean isNil() {
		return nil;
	}
	public void setNil(boolean nil) {
		this.nil = nil;
	}
	public TigerRecord() {
		this.elementTypes = null;
		this.nil = false;
	}
	public TigerRecord(Map<String, TigerType> elementTypes, boolean nil) {
		this.elementTypes = elementTypes;
		this.nil = nil;
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerRecord
		  && elementTypes.equals(((TigerRecord)o).elementTypes)
		  && nil == ((TigerRecord)o).nil;
	}
}
