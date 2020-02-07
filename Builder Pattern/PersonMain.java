package builder.pattern;

public class PersonMain {
	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilder();
		builder.createPerson().addPersonName("Aung Aung").build();
		System.out.println(builder);
	}
}
