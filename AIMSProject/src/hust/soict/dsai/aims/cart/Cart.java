package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;
import hust.soict.dsai.aims.media.Playable;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	public ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBER_ORDERED);
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public void addMedia(Media media) {
		boolean found = false;
		for (Media m: itemsOrdered) {
			if (m.equals(media)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Already in cart.");
		} else {
			itemsOrdered.add(media);
			System.out.println("Added successfully.");
		}
	}
	
	public void removeMedia(Media media) {
		boolean found = false;
		for (Media m: itemsOrdered) {
			if (m.equals(media)) {
				found = true;
				break;
			}
		}
		if (found) {
			itemsOrdered.remove(media);
			System.out.println("Removed successfully.");
		} else {
			System.out.println("Media is not in cart.");
		}
	}
	
	public float totalCost() {
		float result = 0;
		for (Media m: itemsOrdered) {
			result += m.getCost();
		}
		return result;
	}
	
	public void search(int id) {
        boolean found = false;
        for (Media m: itemsOrdered) {
            if (m.getId() == id) {
                System.out.println("Disc is in cart. Information: ");
                System.out.println(m.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match is found");
        }
    }

    public void search(String title) {
        boolean found = false;
        for (Media m: itemsOrdered) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("Disc is in cart. Information: ");
                System.out.println(m.toString());
                break;
            }
        } 
        if (!found) {
            System.out.println("No match is found");
        }
    }
    
    public void displayCart() {
    	if(itemsOrdered.size() == 0) {
    		System.out.println("No item in cart.");
    	} else {
    		for (Media m: itemsOrdered) {
    			System.out.println(m.toString());
    		}
    	}
    }
    
    public void sortByTitleCost() {
    	Collections.sort(itemsOrdered, COMPARE_BY_TITLE_COST);
    }
    
    public void sortByCostTitle() {
    	Collections.sort(itemsOrdered, COMPARE_BY_COST_TITLE);
    }
    
    public boolean Contains(Object obj) {
    	boolean found = false;
    	for (Media m: itemsOrdered) {
    		if (m.equals(obj)) {
    			found = true;
    			break;
    		}
    	}
    	return found;
    }
    
    public Media findMedia(String title) {
    	for (Media m: itemsOrdered) {
    		if (m.getTitle().equalsIgnoreCase(title)) {
    			return m;
    		}
    	}
    	return null;
    }
    
    public boolean isEmpty() {
    	if (itemsOrdered.size() == 0) {
    		return true;
    	}
    	return false;
    }
    
    public void emptyCart() {
    	for (Media m: itemsOrdered) {
    		itemsOrdered.remove(m);
    	}
    }
    
    public void filterCart(Scanner sc) {
    	System.out.println("1. Filter by id");
        System.out.println("2. Filter by title");
        System.out.println("3. Back");
        int filter = sc.nextInt();
        switch (filter) {
        	case 1:
        		int id = sc.nextInt();
        		Cart cart1 = new Cart();
        		for (Media m: itemsOrdered) {
        			if (m.getId() == id) {
        				cart1.addMedia(m);
        			}
        		}
        		
        		if (cart1.isEmpty()) {
        			System.out.println("No media is in cart.");
        		} else {
        			cart1.displayCart();
        		}
        		break;
        	case 2:
        		String title = sc.nextLine();
        		Cart cart2 = new Cart();
        		for (Media m: itemsOrdered) {
        			if (m.getTitle().equalsIgnoreCase(title)) {
        				cart2.addMedia(m);
        			}
        		}
        		if (cart2.isEmpty()) {
        			System.out.println("No media is in cart.");
        		} else {
        			cart2.displayCart();
        		}
        		break;
        	case 3:
        		break;
        	default:
        		System.out.println("Invalid choice.");
        		break;
        }
    }
    
    public void sortCart(Scanner sc) {
    	System.out.println("1. Sort by title-cost.");
        System.out.println("2. Sort by cost-title.");
        System.out.println("3. Back.");
        int sort = sc.nextInt();
        switch (sort) {
            case 1:
                this.sortByTitleCost();
                this.displayCart();
                break;
            case 2:
                this.sortByCostTitle();
                this.displayCart();
                break;
            case 3:
                break;
            default:
            	System.out.println("Invalid choice");
                break;
        }
    }
    
    public void removeCart(Scanner sc) {
        this.displayCart();
        System.out.print("Enter cart title to be removed: ");
        String title = sc.nextLine();
        Media media = this.findMedia(title);
        if (media != null) {
            this.removeMedia(media);
        } else {
            System.out.println("Not in cart.");
        }
    }
    
    public void playMedia(Scanner sc) {
        System.out.print("Enter the title of the media: ");
        String title = sc.nextLine(); 
        Media media = this.findMedia(title);
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media cannot be played");
            }
        } else {
            System.out.println("Media not found");
        }
    }
}
