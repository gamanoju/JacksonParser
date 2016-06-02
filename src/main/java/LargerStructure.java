import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LargerStructure {
	
	private Foo foo;
	
	public Foo getFoo() {
		return foo;
	}
	
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
}
