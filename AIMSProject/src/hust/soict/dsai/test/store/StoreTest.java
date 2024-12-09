package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		//Create a new store
		Store store = new Store();
				
		//Create new dvd objects
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
				
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
				
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
				
		//Test the add and remove method
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.removeMedia(dvd3);
		store.addMedia(dvd3);
		store.removeMedia(dvd3);
		
	}
}