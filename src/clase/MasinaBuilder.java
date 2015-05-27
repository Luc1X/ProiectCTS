package clase;

import interfete.IMasinaBuilder;

public class MasinaBuilder implements IMasinaBuilder {

	private String marca;
	private String model;
	private String culoare;
	private int anFabricatie;
	private double nrKm;

	public MasinaBuilder setMarca(String marca) {
		this.marca = marca;
		return this;
	}
	
	public MasinaBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public MasinaBuilder setCuloare(String culoare) {
		this.culoare = culoare;
		return this;
	}
	public MasinaBuilder setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
		return this;
	}
	public MasinaBuilder setNrKm(double nrKm) {
		this.nrKm = nrKm;
		return this;
	}

	public Masina construieste() {
		return new Masina(marca, model, culoare, anFabricatie, nrKm);
	}

}
