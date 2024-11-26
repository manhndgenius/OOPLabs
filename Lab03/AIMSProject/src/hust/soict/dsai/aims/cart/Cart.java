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
			itemsOrdered[currentorder + 1] = dvd2;
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
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		
		for (int i = 0; i < currentorder; i++) {
			System.out.print((i + 1) + ". DVD - ");
			
			if (itemsOrdered[i].getTitle() != null) {
				System.out.println(itemsOrdered[i].getTitle() + " - ");
			}
			if (itemsOrdered[i].getCategory() != null) {
                System.out.print(itemsOrdered[i].getCategory() + " - ");
            }
            if (itemsOrdered[i].getDirector() != null) {
                System.out.print(itemsOrdered[i].getDirector() + " - ");
            }
            if (itemsOrdered[i].getLength() != 0) {
                System.out.print(itemsOrdered[i].getLength() + ": ");
            }
            if (itemsOrdered[i].getCost() != 0) {
                System.out.println(itemsOrdered[i].getCost() + " $");
            }
		}
		
		System.out.println("Total cost: " + this.totalCost() + " $");
		System.out.println("***************************************************");
	}
	
	public void search(int id) {

        boolean found = false;

        for (int i = 0; i < currentorder; i++) {

            if (itemsOrdered[i].isMatch(id)) {

                System.out.print("Found: " + (i + 1) + ". DVD - ");

                if (itemsOrdered[i].getTitle() != null) {
                    System.out.print(itemsOrdered[i].getTitle() + " - ");
                }
                if (itemsOrdered[i].getCategory() != null) {
                    System.out.print(itemsOrdered[i].getCategory() + " - ");
                }
                if (itemsOrdered[i].getDirector() != null) {
                    System.out.print(itemsOrdered[i].getDirector() + " - ");
                }
                if (itemsOrdered[i].getLength() != 0) {
                    System.out.print(itemsOrdered[i].getLength() + ": ");
                }
                if (itemsOrdered[i].getCost() != 0) {
                    System.out.println(itemsOrdered[i].getCost() + " $");
                }

                found = true;
            }
        } 
        if (found == false) {
            System.out.println("No match is found");
        }
    }

    public void search(String title) {

        boolean found = false;

        for (int i = 0; i < currentorder; i++) {

            if (itemsOrdered[i].isMatch(title)) {

                System.out.print("Found: " + (i + 1) + ". DVD - ");

                if (itemsOrdered[i].getTitle() != null) {
                    System.out.print(itemsOrdered[i].getTitle() + " - ");
                }
                if (itemsOrdered[i].getCategory() != null) {
                    System.out.print(itemsOrdered[i].getCategory() + " - ");
                }
                if (itemsOrdered[i].getDirector() != null) {
                    System.out.print(itemsOrdered[i].getDirector() + " - ");
                }
                if (itemsOrdered[i].getLength() != 0) {
                    System.out.print(itemsOrdered[i].getLength() + ": ");
                }
                if (itemsOrdered[i].getCost() != 0) {
                    System.out.println(itemsOrdered[i].getCost() + " $");
                }

                found = true;
            }
        } 
        if (found == false) {
            System.out.println("No match is found");
        }
    }
}
