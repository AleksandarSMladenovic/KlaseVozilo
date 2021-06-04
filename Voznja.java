package klaseVozilo;

public class Voznja {

	public static void main(String[] args) {

		/*
		 * Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se
		 * kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve
		 * tipove metoda napisanih u klasi Automobil.
		 */

		Automobil a1 = new Automobil("Opel", "Astra", 123456789, "Pera Peric");
		Automobil a2 = new Automobil("Ford", "Fiesta", 223456789, "Jovan Jovanovic");
		Automobil a3 = new Automobil("Reno", "Megan", 111111111, "Mladen Mladenovic");

		Automobil[] vozila = { a1, a2, a3 };

		a2.setVlasnik("Promenjen vlasnik");
		a3.setVlasnik("Strahinja Strahinjic");

		for (Automobil a : vozila) {
			System.out.println(a.getMarka() + a.getModel());
		}

		for (Automobil a : vozila) {
			System.out.println(a.ispisAuta());
		}
	}

}
