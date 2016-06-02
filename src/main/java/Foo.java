import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Foo {
	
	private Map<String, FooItem> items = new HashMap<String, FooItem>();
	
	// Default constructor
	public Foo(){}
	
	public void putItem(String key, FooItem item){
		
		items.put(key, item);
	}
	
	public Map<String, FooItem> getItems(){
		return Collections.unmodifiableMap(items);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		for (String key: items.keySet()){ 
			sb.append(key + ": " + items.get(key) + "\n");
		}
		
		return sb.toString();
	}
}
