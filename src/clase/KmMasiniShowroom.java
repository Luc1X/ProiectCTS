package clase;

public class KmMasiniShowroom {
	private final double Km1;
	private final double Km2;
	private final double Km3;

	public KmMasiniShowroom(double Km1, double Km2, double Km3) {
		super();
		this.Km1 = Km1;
		this.Km2 = Km2;
		this.Km3 = Km3;
	}

	public double getKm1() {
		return Km1;
	}

	public double getKm2() {
		return Km2;
	}

	public double getKm3() {
		return Km3;
	}

	public KmMasiniShowroom inmultire(double numar) {
		return new KmMasiniShowroom(this.Km1 * numar, this.Km2 * numar, this.Km3 * numar);
	}

	public KmMasiniShowroom impartire(double numar) {
		return new KmMasiniShowroom(this.Km1 / numar, this.Km2 / numar, this.Km3 / numar);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Km1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Km2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Km3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KmMasiniShowroom other = (KmMasiniShowroom) obj;
		if (Double.doubleToLongBits(Km1) != Double.doubleToLongBits(other.Km1))
			return false;
		if (Double.doubleToLongBits(Km2) != Double.doubleToLongBits(other.Km2))
			return false;
		if (Double.doubleToLongBits(Km3) != Double.doubleToLongBits(other.Km3))
			return false;
		return true;
	}

}
