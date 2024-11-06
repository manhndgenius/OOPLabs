public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc items_order[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int currentorder = 0;
	
	public void add_DigitalVideoDisc(DigitalVideoDisc dics) {
		if (currentorder == MAX_NUMBER_ORDERED) {
			System.out.println("Cart has been fulled");
		}
		else {
			items_order[currentorder] = dics;
			currentorder++;
			System.out.println("Dics have been added!");
			if (currentorder >= 18) {
				System.out.println("Warning: Cart is almost full");
			}
		}
	}
	
	public void remove_DigitalVideoDisc(DigitalVideoDisc dics) {
		boolean Turnon = false;
		int update = currentorder;
		if (currentorder == 0) {
			System.out.println("Cart is Empty");
		}
		else {
			for (int i = 0; i < currentorder; i++) {
				if (items_order[i].equals(dics)) {
					Turnon = true;
					update -= 1;
				}
				if (Turnon) {
					if (i < 19) {
						items_order[i] = items_order[i + 1];
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
			result += items_order[i].getCost();
		}
		return result;
	}
}
