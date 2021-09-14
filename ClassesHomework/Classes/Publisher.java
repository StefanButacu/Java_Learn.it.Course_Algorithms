package Classes;

public class Publisher {

	private int id;
	private String publisherName;
	
	
	
	
	public Publisher(int id, String publisherName) {
		this.id = id;
		this.publisherName = publisherName;
	}



	
	public Publisher(String publisherName) {
		this.id = 0;
		this.publisherName = publisherName;
		
	}


	@Override
	public boolean equals(Object obj) {
		// not treating null comparison or different class
		Publisher other = (Publisher) obj;
		return this.id == other.id;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}
}
