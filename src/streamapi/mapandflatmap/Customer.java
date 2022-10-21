package streamapi.mapandflatmap;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private List<Integer> phoneNumber;
	
	public Customer(int id, String name, String email, List<Integer> phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	it will not throw null pointer exception
//	public Optional<String> getEmail() {
//		return Optional.ofNullable(email);
//	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
