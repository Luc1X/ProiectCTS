package clase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import interfete.IMasina;

public class Masina implements IMasina {
	private static Masina instance;

	private String marca;
	private String model;
	private String culoare;
	private int anFabricatie;
	private double nrKm;

	public static synchronized Masina getInstance() {
		if (instance == null)
			instance = new Masina("Skoda", "Octavia", "alb", 2010, 30000);
		return instance;
	}

	public Masina(String marca, String model, String culoare, int anFabricatie,
			double nrKm) {
		super();
		this.marca = marca;
		this.model = model;
		this.culoare = culoare;
		this.anFabricatie = anFabricatie;
		this.nrKm = nrKm;
	}

	public Masina() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public int getAnFabricatie() {
		return anFabricatie;
	}

	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}

	public double getNrKm() {
		return nrKm;
	}

	public void setNrKm(double nrKm) {
		this.nrKm = nrKm;
	}

	@Override
	public String toString() {
		return "Masina [marca=" + marca + ", model=" + model + ", culoare="
				+ culoare + ", anFabricatie=" + anFabricatie + ", nrKm=" + nrKm
				+ "]";
	}

	@Override
	public void vinde() {
		System.out.println("Masina " + marca + " " + model
				+ " fabricata in anul " + anFabricatie + " si rulata " + nrKm
				+ " km" + " a fost vanduta.");
	}

	@Override
	public String getNume() {
		return marca + " " + model;
	}

	private static final ArrayList<Masina> listaMasini = new ArrayList<Masina>();

	public void citireFisier(String numeFisier) throws Exception {
		try {
			BufferedReader br = new BufferedReader(new FileReader(numeFisier));
			String linie = br.readLine();

			while (linie != null && linie.length() != 0) {
				introducereMasiniInShowroom(linie);
				linie = br.readLine();
			}
			br.close();
		}

		catch (IOException e) {
			System.out.println("Fisierul nu a fost gasit.");
		}
	}

	private void introducereMasiniInShowroom(String linie) throws Exception {
		if (linie.contains(" ")) {
			String[] parametrii = linie.split(" ");
			Masina masina8 = new Masina(parametrii[0], parametrii[1],
					parametrii[2], Integer.parseInt(parametrii[3]),
					Double.parseDouble(parametrii[4]));
			getListamasini().add(masina8);
		} else
			throw new IllegalArgumentException();

	}

	public static ArrayList<Masina> getListamasini() {
		return listaMasini;
	}
	
	public String concatenare(String unu, String doi) {
		return unu + " " + doi;
	}
	

	public int numara(String litera) {
		int numara = 0;
		for (int i = 0; i < litera.length(); i++) {
			if (litera.charAt(i) == 'a' || litera.charAt(i) == 'A') {
				numara++;
			}
		}
		return numara;
	}
	

	public int maximKm(int x, int y) {
		return Math.max(x, y);
	}
	


	public int minimKm(int x, int y) {
		return Math.min(x, y);
	}
	


	public boolean numarParKm(int x) {
		if (x % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean numarImparKm(int x) {
		if (x % 2 == 1)
			return true;
		else
			return false;
	}
	
	public int medieAritmeticaAniFabricatie(int x, int y) {
		return (x + y) / 2;
	}
	
	public int medieGeometricaNrKm(int x, int y) {
		return (int) Math.sqrt(x * y);
	}
	

	public int patratNrKm(int x) {
		return x * x;
	}
	

	public int scadereNrMasini(int x, int y) {
		return x - y;
	}

	public int inmultireNrMasini(int x, int y) {
		return x * y;
	}



}
