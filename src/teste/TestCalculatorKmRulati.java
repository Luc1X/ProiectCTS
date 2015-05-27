package teste;

import static org.junit.Assert.*;
import interfete.ICalculatorKmRulati;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;

import clase.CalculatorKmRulati;

public class TestCalculatorKmRulati {
	CalculatorKmRulati calculatorKmRulati;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ICalculatorKmRulati calc = mock(ICalculatorKmRulati.class);

		when(calc.adunaKm(50000, 25000)).thenReturn(75000);
		calculatorKmRulati = new CalculatorKmRulati();
		calculatorKmRulati.setCalc(calc);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdunareKm() {
		assertEquals(75000, calculatorKmRulati.adunareKm(50000, 25000));
	}

}
