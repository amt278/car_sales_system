package maincarsales;

public abstract class Person {

	protected String username;
	protected String password;

	public Person() {
	}

	public Person(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// public abstract void showData(int indexUser);
}
