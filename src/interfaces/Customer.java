package interfaces;

public class Customer {
	private  int id;
	private String firstName;
	private String lastName;
	
	public Customer(int id, String firstName, String lasttName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lasttName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer() {
		
	}
}
