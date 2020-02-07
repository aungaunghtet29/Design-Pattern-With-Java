package builder.pattern;

public class UserBuilder {
	private User user;

	public UserBuilder create() {
		user = new User();
		return this;
	}

	public UserBuilder addName(String name) {
		user.setName(name);
		return this;
	}

	public UserBuilder addAge(int age) {
		user.setAge(age);
		return this;
	}

	public UserBuilder addPhone(String phone) {
		user.setPhone(phone);
		return this;
	}

	public UserBuilder addAddress(String address) {
		user.setAddress(address);
		return this;
	}

	@Override
	public String toString() {
		return "UserBuilder [user=" + user + "]";
	}

	public User build() {
		return user;
	}

}
