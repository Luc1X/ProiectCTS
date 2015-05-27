package clase;

import interfete.IMasina;

public class Vanzare extends VanzareNoua {

	public Vanzare(IMasina masina) {
		super(masina);
	}

	public void plecare() {
		System.out.println("Masina " + super.getMasina().getNume()
				+ " a parasit showroom-ul.");
	}

}
