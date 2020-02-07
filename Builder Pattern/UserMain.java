package builder.pattern;

public class UserMain {
	public static void main(String[] args) {
		UserBuilder us = new UserBuilder();
		us.create().addName("Aung Aung").addPhone("09692234268").build();
		System.out.println(us);
		
		us.create().addName("Maung Maung").addAddress("Yangon").build();
		System.out.println(us);
	}
	

	
}
