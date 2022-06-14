package Builder;
/*
1. A class with lot of attributes;
2. Immutable class; (cannot change state of an instance once it is created)
*/

public class Student_v1 {
	String name;
	String id;
	String email;
	String contact;
	int age;

	public Student_v1(String name, String id, String email, String contact, int age){
		this.name = name;
		this.id = id;
		this.email = email;
		this.contact = contact;
		this.age = age;
	}
}
