public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int currentorder = 0;
	
	public void add_DigitalVideoDisc(DigitalVideoDisc disc) {
		if (currentorder == MAX_NUMBER_ORDERED) {
			System.out.println("Cart has been fulled");
		}
		else {
			itemsOrdered[currentorder] = disc;
			currentorder++;
			System.out.println("Dics have been added!");
			if (currentorder >= 18) {
				System.out.println("Warning: Cart is almost full");
			}
		}
	}
	
	public void add_DigitalVideoDisc (DigitalVideoDisc[] dvdlist) {
		for (DigitalVideoDisc disc : dvdlist) {
			if (currentorder < MAX_NUMBER_ORDERED) {
				itemsOrdered[currentorder] = disc;
				currentorder++;
				System.out.println("The disc has been added!");
			} else {
				System.out.println("The cart is full. Cannot add more items!");
			}
		}
	}
	
	public void add_DigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (currentorder + 2 <= MAX_NUMBER_ORDERED) {
			itemsOrdered[currentorder] = dvd1;
			currentorder++;
			itemsOrdered[currentorder] = dvd2;
			currentorder++;
			System.out.println("Both disc have been added!");
		} else if (currentorder + 1 <= MAX_NUMBER_ORDERED) {
			itemsOrdered[currentorder] = dvd1;
			currentorder++;
			System.out.println("The first disc has been added! The cart is full for the second disc.");
		} else {
			System.out.println("The cart is full. Cannot add more discs!");
		}
	}
	
	public void remove_DigitalVideoDisc(DigitalVideoDisc disc) {
		boolean Turnon = false;
		int update = currentorder;
		if (currentorder == 0) {
			System.out.println("Cart is Empty");
		}
		else {
			for (int i = 0; i < currentorder; i++) {
				if (itemsOrdered[i].equals(disc)) {
					Turnon = true;
					update -= 1;
				}
				if (Turnon) {
					if (i < 19) {
						itemsOrdered[i] = itemsOrdered[i + 1];
					}
				}
			}
			if(!Turnon) {
				System.out.println("That Disc is not exist");
			}
			else {
				System.out.println("You have just remove dics");
			}
		}
		currentorder = update;
	}
	
	public float totalCost() {
		float result = 0;
		for (int i = 0; i < currentorder; i++) {
			result += itemsOrdered[i].getCost();
		}
		return result;
	}
}
