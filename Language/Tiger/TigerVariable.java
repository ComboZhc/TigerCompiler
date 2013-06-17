package Language.Tiger;

public class TigerVariable extends TigerNamespace {
	private TigerType type;

	public TigerType getType() {
		return type;
	}

	public void setType(TigerType type) {
		this.type = type;
	}

	public TigerVariable() {
		this.type = null;
	}
	
	public TigerVariable(TigerType type) {
		this.type = type;
	}
	
}
