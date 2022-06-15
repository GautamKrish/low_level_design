package Builder;

import java.util.Map;

public class Student_v2 {
	String name;
	String id;
	String email;
	String contact;
	int age;

	public Student_v2(Map<String, Object> parameterMap){
		this.name = (String)parameterMap.get("name");
		this.id = (String)parameterMap.get("id");
		this.email = (String)parameterMap.get("email");
		this.contact = (String)parameterMap.get("contact");
		this.age = (int)parameterMap.get("age");
	}

}
