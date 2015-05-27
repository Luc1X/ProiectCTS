package clase;

import interfete.IMasina;

public abstract class VanzareNoua {
	private IMasina masina;
	
	public VanzareNoua(IMasina masina) {
		this.masina = masina;
	}
	
	public abstract void plecare();
	
	public IMasina getMasina() {
		return masina;
	}
}
