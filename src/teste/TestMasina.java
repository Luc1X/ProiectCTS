package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Masina;

public class TestMasina {
	Masina masina1;
	Masina masina2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		masina1 = new Masina("Audi", "A6", "alb", 2015, 3500);
		masina2 = new Masina(null, null, null, 2010, 145000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMarca() {
		assertNotNull(masina1.getMarca());
	}

	@Test
	public void testNrKm() {
		assertNotNull(masina1.getNrKm());
	}

	@Test
	public void testModel() {
		assertNull(masina2.getModel());
	}

	@Test
	public void testCuloare() {
		assertNull(masina2.getCuloare());
	}

	@Test
	public void testConcatenare() {
		Masina masina = new Masina();
		String concatenare = masina.concatenare("Ford", "Focus");
		assertEquals("Ford Focus", concatenare);
	}

	@Test
	public void testNumara() {
		Masina masina = new Masina();
		int rezultatNumara = masina
				.numara("Audi A4 are un pret promotional pana pe data de 30.05.2015");
		assertEquals(8, rezultatNumara);
	}

	@Test
	public void testMaximKm() {
		Masina masina = new Masina();
		int nrKmMaxim = masina.maximKm(30000, 100000);
		assertEquals(100000, nrKmMaxim);
	}

	@Test
	public void testMinimKm() {
		Masina masina = new Masina();
		int nrKmMinim = masina.minimKm(30000, 100000);
		assertEquals(30000, nrKmMinim);
	}

	@Test
	public void testNumarKmPar() {
		Masina masina = new Masina();
		boolean numarParKm = masina.numarParKm(130468);
		assertTrue(numarParKm);
	}

	@Test
	public void testNumarKmImpar() {
		Masina masina = new Masina();
		boolean numarImparKm = masina.numarImparKm(130465);
		assertTrue(numarImparKm);
	}

	@Test
	public void testMedieAritmeticaAnFabricatie() {
		Masina masina = new Masina();
		int medieAritmeticaAnFabricatie = masina.medieAritmeticaAniFabricatie(
				2012, 2014);
		assertEquals(2013, medieAritmeticaAnFabricatie);
	}

	@Test
	public void testMedieGeometricaNrKm() {
		Masina masina = new Masina();
		int medieGeometricaNrKm = masina.medieGeometricaNrKm(20000, 80000);
		assertEquals(40000, medieGeometricaNrKm);
	}

	@Test
	public void testPatratNrKm() {
		Masina masina = new Masina();
		int rezultatPatratNrKm = masina.patratNrKm(100);
		assertEquals(10000, rezultatPatratNrKm);
	}

	@Test
	public void testPatratNrKmNegativ() {
		Masina masina = new Masina();
		int rezultatPatratNrKm = masina.patratNrKm(100);
		assertNotEquals(100000, rezultatPatratNrKm);
	}

	@Test
	public void testScadereNrMasini() {
		Masina masina = new Masina();
		int rezultatScadereNrMasini = masina.scadereNrMasini(20, 8);
		assertEquals(12, rezultatScadereNrMasini);
	}

	@Test
	public void testInmultireNrMasini() {
		Masina masina = new Masina();
		int rezultatInmultireNrMasini = masina.inmultireNrMasini(8, 3);
		assertEquals(24, rezultatInmultireNrMasini);
	}

}
