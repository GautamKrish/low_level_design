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
			Still can mess up order of putting parameters into map.9
		 */
		Builder builder = new Builder();

		builder
				.setName("Gautam Krishnan")
				.setId("33378755")
				.setContact("7028543901")
				.setEmail("gautam@gmail.com")
				.setAge(12);
		Student_v4 object_4 = new Student_v4(builder);
		/*
			order doesn't matter as setter functions are defined.
			No type casting runtime exceptions;
		 */

		Student_v5 object_5 = Student_v5.getBuilder()
										.setName("Gautam")
										.setAge(43)
										.setEmail("gautam@gmail.com")
										.setId("7876433")
										.setContact("9077865431")
										.build();

	}
}
