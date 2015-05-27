package client;

import clase.Masina;
import clase.MasinaBuilder;
import clase.Vanzare;
import clase.VanzareNoua;

public class Program {
	public static void main(String[] args) {
		Masina.getInstance().setMarca("Volkswagen");
		System.out.println(Masina.getInstance().getMarca()
				+ " da dovada de design si tehnologie avansate.");

		Masina masina1 = new Masina();
		masina1.setMarca("BMW");
		masina1.setModel("Seria 3");
		masina1.setCuloare("negru");
		masina1.setAnFabricatie(2012);
		masina1.setNrKm(25000);
		System.out.println(masina1.toString());

		MasinaBuilder constructorMasina = new MasinaBuilder();
		constructorMasina.setMarca("Renault").setModel("Megane")
				.setCuloare("albastru").setAnFabricatie(2005).setNrKm(150000);
		Masina masina2 = constructorMasina.construieste();

		System.out.println(masina2);

		VanzareNoua vanzare = new Vanzare(new Masina("Opel", "Insignia",
				"rosu", 2013, 15000));
		vanzare.getMasina().vinde();
		vanzare.plecare();

		Masina masina10 = new Masina();
		try {
			masina10.citireFisier("DateFisier.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--- Numar masini din fisier: "+Masina.getListamasini().size()+" ---");

	}
}
