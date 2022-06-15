package Builder;
// mutable builder class
public class Builder {
	String name;
	String id;
	String email;
	String contact;
	int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getContact() {
		return contact;
	}

	public int getAge() {
		return age;
	}

}
