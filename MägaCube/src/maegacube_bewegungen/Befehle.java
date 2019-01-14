package maegacube_bewegungen;

public class Befehle {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub

	public static void befehl(String Richtung, int x) {

		if (Richtung.equals("F")) {
			
			Maegacube_griffel.maegacube_drehen();
			Maegacube_griffel.maegacube_halten();
			Maegacube_drehen.maegacube_drehen(x);
			Maegacube_griffel.maegacube_stophalten();

		}
		if (Richtung.equals("D")) {
			Maegacube_griffel.maegacube_halten();
			Maegacube_drehen.maegacube_drehen(x);
			Maegacube_griffel.maegacube_stophalten();

		}
		if (Richtung.equals("B")) {

			Maegacube_griffel.maegacube_drehen();
			Maegacube_griffel.maegacube_halten();
			Maegacube_drehen.maegacube_drehen(x);
			Maegacube_griffel.maegacube_stophalten();
		}
		if (Richtung.equals("U")) {

			Maegacube_griffel.maegacube_drehen();
			Maegacube_griffel.maegacube_drehen();
			Maegacube_griffel.maegacube_halten();
			Maegacube_drehen.maegacube_drehen(x);
			Maegacube_griffel.maegacube_stophalten();
		}
		if (Richtung.equals("L")) {

			Maegacube_drehen.maegacube_drehen(-1);
			Maegacube_griffel.maegacube_drehen();
			Maegacube_drehen.maegacube_drehen(-1);
			Maegacube_griffel.maegacube_stophalten();

		}
		if (Richtung.equals("R")) {

			Maegacube_drehen.maegacube_drehen(1);
			Maegacube_griffel.maegacube_drehen();
			Maegacube_drehen.maegacube_drehen(1);
			Maegacube_griffel.maegacube_stophalten();

		}

	}

}
