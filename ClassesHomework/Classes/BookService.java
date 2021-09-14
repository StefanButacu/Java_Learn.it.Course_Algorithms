package Classes;




public class BookService {


	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		
		Book[] rez = new Book[books.length];
		for(int i = 0; i < books.length; i++) {
			
			for(Author a: books[i].authors){
				if(a.id == author.id){
					rez[i] = books[i];
					break;
					}
			}
		}
		rez = filterNulls(rez);
		return rez;
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		Book[] rez = new Book[books.length];
		for(int i = 0; i < books.length; i++) {
				if(publisher.equals(books[i].publisher)){
					rez[i] = books[i];
					}
			}
		
		rez = filterNulls(rez);
		return rez;
	}
	

	
	
	private static Book[] filterNulls(Book[] arr) {
		int newArraySize = 0;
		for (Book book : arr) {
			if (book != null) {
				newArraySize++;
			}
		}
		
		Book[] filteredArray = new Book[newArraySize];
		
		int filteredArrayIndex = 0;
		for (Book book : arr) {
			if (book != null) {
				filteredArray[filteredArrayIndex++] = book;
			}
		}
		
		return filteredArray;
	}

	public Book[]  filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		Book[] rez = new Book[books.length];
		for(int i = 0; i < books.length; i++) {
			if(books[i].publishingYear >= yearFromInclusively){
					rez[i] = books[i];
					
				}
			}
		
		rez = filterNulls(rez);
		return rez;
	}
}
