package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Cumparator;

public class TestCumparator {

	@Test
	public void testCalculeazaVarstaCumparator() {
		Cumparator cumparator1 = new Cumparator("Vasile", "Lucian", "1930120297276");
		assertEquals(22, cumparator1.calculeazaVarstaCumparator());
	}
}
