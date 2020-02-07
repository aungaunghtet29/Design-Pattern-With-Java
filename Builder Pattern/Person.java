package builder.pattern;

public class Person {
	private String name;
	private int age;
	private int heigh;
	private String address;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, int heigh, String address) {
		super();
		this.name = name;
		this.age = age;
		this.heigh = heigh;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeigh() {
		return heigh;
	}

	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", heigh=" + heigh + ", address=" + address + "]";
	}

}
