package Language.Tiger;

public class TigerNil extends TigerRecord {

	public TigerNil() {
		super();
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerNil;
	}
	
	@Override
	public String toString() {
		return "Nil";
	}

}
