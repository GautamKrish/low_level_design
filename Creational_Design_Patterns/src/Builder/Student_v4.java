package Builder;

public class Student_v4 {
	String name;
	String id;
	String email;
	String contact;
	int age;

	public Student_v4(Builder builder){
		this.name = builder.getName();
		this.id = builder.getId();
		this.email = builder.getEmail();
		this.contact = builder.getContact();
		this.age =  builder.getAge();
	}
}
