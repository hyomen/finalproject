package Final;

import java.io.Serializable;

public class Borrow implements Serializable {
	private String id;
	private String isbn;
	Borrow(String id,String isbn){
		this.id = id;
		this.isbn = isbn;
	}

	public String getId() {
		return id;
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String toString(){
		return "¾ÆÀÌµð : "+getId() +" ISBN : "+ getIsbn();
	}
}
