package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.KmMasiniShowroom;

public class TestKmMasiniShowroom {
	private KmMasiniShowroom kmMasiniShowroom;

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("-- Set up class --");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("-- Tear down class --");
	}

	@Before
	public void setUp() {
		System.out.println("Setup");

		kmMasiniShowroom = new KmMasiniShowroom(10000, 20000, 30000);
	}

	@After
	public void tearDown() {
		System.out.println("Tear down");

		kmMasiniShowroom = null;
	}

	@Test
	public void testInmultireVector() {
		KmMasiniShowroom vectorNou = new KmMasiniShowroom(50000, 100000, 150000);
		KmMasiniShowroom rezultat = kmMasiniShowroom.inmultire(5);

		assertEquals(vectorNou, rezultat);
	}

	@Test
	public void testImpartireVector() {
		KmMasiniShowroom vectorNou = new KmMasiniShowroom(2000, 4000, 6000);
		KmMasiniShowroom rezultat = kmMasiniShowroom.impartire(5);

		assertEquals(vectorNou, rezultat);
	}

}
