package Classes;

public class Author {

	public int id;
	String firstName;
	String lastName;
	
	

	public Author(int id) {
		this.id = id;
		this.firstName = "";
		this.lastName = "";
	}
	
	public Author(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Author(String firstName, String lastName) {
		this.id = 0;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null)
			return false;
		if(obj.getClass() != this.getClass())
			return false;
		final Author other = (Author) obj;
		return this.id == other.id;
		
	}

}
