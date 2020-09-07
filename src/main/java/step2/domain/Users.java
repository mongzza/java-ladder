package step2.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Users {
	private final List<User> users;

	public Users(String[] names) {
		this.users = Arrays.stream(names)
				.map(User::new)
				.collect(Collectors.toList());
	}

	public List<User> getUsers() {
		return Collections.unmodifiableList(this.users);
	}

	public int size() {
		return this.users.size();
	}
}
