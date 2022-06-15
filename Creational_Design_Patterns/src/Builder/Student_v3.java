package Builder;

import java.util.Map;

public class Student_v3 {
	String name;
	String id;
	String email;
	String contact;
	int age;

	public Student_v3(Map<Parameter, Object> parameterMap){
		this.name = (String) parameterMap.get(Parameter.NAME);
		this.id = (String) parameterMap.get(Parameter.ID);
		this.email = (String) parameterMap.get(Parameter.EMAIL);
		this.contact = (String) parameterMap.get(Parameter.CONTACT);
		this.age = (int) parameterMap.get(Parameter.AGE);
	}
}
