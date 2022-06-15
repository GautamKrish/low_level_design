package Builder;
// mutable builder class
public class Builder {
	String name;
	String id;
	String email;
	String contact;
	int age;

	public Builder setName(String name) {
		this.name = name;
		return this;
	}

	public Builder setId(String id) {
		this.id = id;
		return this;
	}

	public Builder setEmail(String email) {
		this.email = email;
		return this;
	}

	public Builder setContact(String contact) {
		this.contact = contact;
		return this;
	}

	public Builder setAge(int age) {
		this.age = age;
		return this;
	}

}
