package Builder;

public class Student_v5 {
	private String name;
	private String id;
	private String email;
	private String contact;
	private int age;

	private Student_v5(Builder builder){
		this.name = builder.name;
		this.id = builder.id;
		this.email = builder.email;
		this.contact = builder.contact;
		this.age = builder.age;
	}

	public  static Builder getBuilder(){
		return new Builder();
	}
	//public because client needs to call this method

	public static class Builder{ // static because need to return instance of Builder w/o creating instance of Student

		private String name;
		private String id;
		private String email;
		private String contact;
		private int age;

		private Builder(){} // not allowed to be created from outside this class

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

		public Student_v5 build(){
			return new Student_v5(this); // because student constructor takes in builder
		}
		// Inside build method because of chaining. Setter returns builder object hence needs to be called on it.


	}

}
