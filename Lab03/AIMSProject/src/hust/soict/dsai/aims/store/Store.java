public class Store {
	private final int storeCapacity = 1000;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000];
	
	private int qtyStore = 0;
	public void addDVD(DigitalVideoDisc disc) {
		if (qtyStore < storeCapacity) {
			itemsInStore[qtyStore] = disc;
			qtyStore++;
			System.out.println("DVD has been added");
		} else {
			System.out.println("Capacity is full");
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		boolean found = false;
		
		for (int i = 0; i < qtyStore; i++) {
			if (itemsInStore[i].equals(disc)) {
				itemsInStore[i] = null;
				found = true;
				for (int j = i; j < qtyStore; j ++) {
					itemsInStore[j] = itemsInStore[j + 1];
				}
				qtyStore--;
				System.out.println("DVD has been removed");
			}
		}
		
		if (found == false) {
			System.out.println("Cannot find the DVD to be removed");
		}
	}
}