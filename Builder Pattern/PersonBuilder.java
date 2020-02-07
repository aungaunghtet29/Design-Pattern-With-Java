package builder.pattern;

public class PersonBuilder {
	private Person person;

	public PersonBuilder createPerson() {
		person = new Person();
		return this;
	}

	public PersonBuilder addPersonName(String name) {
		person.setName(name);
		return this;
	}

	public PersonBuilder addPersonAge(int age) {
		person.setAge(age);
		return this;
	}

	public PersonBuilder addPersonHeigh(int heigh) {
		person.setHeigh(heigh);
		return this;
	}

	public PersonBuilder addPersonAddress(String address) {
		person.setAddress(address);
		return this;
	}

	public Person build() {
		return person;
	}

	@Override
	public String toString() {
		return "PersonBuilder [person=" + person + "]";
	}
	
}
