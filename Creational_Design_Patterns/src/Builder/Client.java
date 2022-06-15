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
			client can mess up order of putting parameters into map. There is no validation
		*/
	}
}
