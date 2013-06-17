package Language.Tiger;
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
		this.parameterTypes = null;
		this.returnType = null;
	}
	public TigerFunction(List<TigerType> parameterTypes, TigerType returnType) {
		this.parameterTypes = parameterTypes;
		this.returnType = returnType;
	}
	
}
