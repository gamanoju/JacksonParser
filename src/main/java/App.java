import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	
	public static void main(String ...args){
		
		File input = new File("largerInput.json");
		LargerStructure largerStructure = deserialise(input);
		System.out.println(largerStructure.getFoo());
	}
	
	
	public static LargerStructure deserialise(File input){

		LargerStructure largerStructure = null;
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			largerStructure = mapper.readValue(input, LargerStructure.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return largerStructure;
	}
}
