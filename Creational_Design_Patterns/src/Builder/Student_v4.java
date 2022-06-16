package Builder;

public class Student_v4 {
	private String name;
	private String id;
	private String email;
	private String contact;
	private int age;

	public Student_v4(Builder builder){
		this.name = builder.name;
		this.id = builder.id;
		this.email = builder.email;
		this.contact = builder.contact;
		this.age =  builder.age;
	}
}

/*
	Immutable class
		a. attributes cannot be set from outside the class.
		b. attributes to be private.
		c. no setters hence attributes can be initialized only via constructor (via first time instance creation).
 */