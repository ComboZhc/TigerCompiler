package Language.Tiger;
import java.util.LinkedList;
import java.util.List;


public class TigerFunction extends TigerNamespace{
	private List<TigerType> parameterTypes;
	private TigerType returnType;
	public List<TigerType> getParameterTypes() {
		return parameterTypes;
	}
	public void setParameterTypes(List<TigerType> parameterTypes) {
		this.parameterTypes = parameterTypes;
	}
	public TigerType getReturnType() {
		return returnType;
	}
	public void setReturnType(TigerType returnType) {
		this.returnType = returnType;
	}
	public TigerFunction() {
		this.parameterTypes = new LinkedList<TigerType>();
		this.returnType = null;
	}
	public TigerFunction(List<TigerType> parameterTypes, TigerType returnType) {
		this.parameterTypes = parameterTypes;
		this.returnType = returnType;
	}
	@Override
	public String toString() {
		return "FUNCTION" + parameterTypes + ":" + returnType;
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerFunction
			&& parameterTypes.equals(((TigerFunction)o).getParameterTypes())
			&& returnType.equals(((TigerFunction)o).getReturnType());
	}
	
}
