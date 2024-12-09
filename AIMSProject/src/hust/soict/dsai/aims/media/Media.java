package hust.soict.dsai.aims.media;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public boolean equals(Object obj) {
	    if (obj instanceof Media) {
	        Media other = (Media) obj;
	        return this.title.equals(other.title);
	    }
	    return false;
	}

	
	public String toString() {
		return "ID: " + id + "\nTitle: " + title + "\nCategory: " + category + "\nCost: " + cost + ".";
	}
}
