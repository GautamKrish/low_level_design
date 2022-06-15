package Builder;

import java.util.HashMap;
import java.util.Map;

public class Client {
	public static void main(String[] args) {
		Student_v1 object_1 = new Student_v1("Gautam Krishnan", "33378755", "gomzi@yahoo.com", "7067543906", 25);
		// not easily understandable, complex structure
		Map<String, Object> map = new HashMap<>();
		map.put("name", "Gautam Krishnan");
		map.put("id", "33378755");
		map.put("contact", "8907654824");
		map.put("email", "gkrish@gmail.com");
		map.put("age", 17);
		Student_v2 object_2 = new Student_v2(map);
		/*
			client can make typos in strings while defining keys.
			client can mess up order of putting parameters into map. There is no validation.
		*/
		Map<Parameter, Object> map_enum = new HashMap<>();
		map_enum.put(Parameter.NAME, "Gautam Krishnan");
		map_enum.put(Parameter.ID, "33378755");
		map_enum.put(Parameter.CONTACT, "8907654824");
		map_enum.put(Parameter.EMAIL, "gkrish@gmail.com");
		map_enum.put(Parameter.AGE, 17);
		Student_v3 object_3 = new Student_v3(map_enum);
		/*
			Using ENUM solves the typo issue.
			Still can mess up order of putting parameters into map.
		 */
	}
}
