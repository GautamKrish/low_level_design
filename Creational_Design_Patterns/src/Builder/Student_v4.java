package Builder;

public class Student_v4 {
	String name;
	String id;
	String email;
	String contact;
	int age;

	public Student_v4(Builder builder){
		this.name = builder.name;
		this.id = builder.id;
		this.email = builder.email;
		this.contact = builder.contact;
		this.age =  builder.age;
	}
}
