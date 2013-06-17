package Language.Tiger;
import java.util.List;


public class TigerFunction extends TigerNamespace{
	private List<TigerType> parameterTypes;
	private TigerType returnType;
	private boolean primitive;
	public boolean isPrimitive() {
		return primitive;
	}
	public void setPrimitive(boolean primitive) {
		this.primitive = primitive;
	}
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
		this.parameterTypes = null;
		this.returnType = null;
		this.primitive = false;
	}
	public TigerFunction(List<TigerType> parameterTypes, TigerType returnType, boolean primitive) {
		this.parameterTypes = parameterTypes;
		this.returnType = returnType;
		this.primitive = primitive;
	}
	@Override
	public String toString() {
		return "FUNCTION" + parameterTypes + "->" + returnType;
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof TigerFunction
			&& parameterTypes.equals(((TigerFunction)o).getParameterTypes())
			&& returnType.equals(((TigerFunction)o).getReturnType());
	}
	
}
