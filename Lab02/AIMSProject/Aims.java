public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		anOrder.add_DigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		anOrder.add_DigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Ainmation",18.99f);
		anOrder.add_DigitalVideoDisc(dvd3);
		
		System.out.println("The Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.remove_DigitalVideoDisc(dvd3);

		System.out.println("The remain cost is: ");
		System.out.println(anOrder.totalCost());
	}
}