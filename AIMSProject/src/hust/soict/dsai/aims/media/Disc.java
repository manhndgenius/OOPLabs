package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Disc(int id, String title, String category, float cost, int length, String director) {
		// TODO Auto-generated constructor stub
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}
	
	public void play() {
		System.out.println("Playing Disc: " + this.getTitle());
        System.out.println("Disc length: " + this.getLength());
	}
	
	public String toString() {
		return "ID: " + this.getId() + "\nTitle: " + this.getTitle() + "\nCategory: " 
				+ this.getCategory() + "\nCost: " + this.getCost() + "\nLength" 
				+ this.getLength() + "\nDirector: " + this.getDirector() + ".";
	}
}
